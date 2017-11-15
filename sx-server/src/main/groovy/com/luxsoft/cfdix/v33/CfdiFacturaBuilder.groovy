package com.luxsoft.cfdix.v33

import org.apache.commons.logging.LogFactory
import org.bouncycastle.util.encoders.Base64

import sx.core.Empresa
import sx.core.Venta
import sx.cxc.CuentaPorCobrar


import lx.cfdi.utils.DateUtils
import lx.cfdi.v33.ObjectFactory
import lx.cfdi.v33.Comprobante

// Catalogos
import lx.cfdi.v33.CUsoCFDI
import lx.cfdi.v33.CMetodoPago
import lx.cfdi.v33.CTipoDeComprobante
import lx.cfdi.v33.CMoneda
import lx.cfdi.v33.CTipoFactor

// Utilerias
import sx.utils.MonedaUtils

/**
 * TODO: Parametrizar el regimenFiscal de
 */
class CfdiFacturaBuilder {

  private static final log=LogFactory.getLog(this)

  private factory = new ObjectFactory();
  private Comprobante comprobante;
  private Empresa empresa
  
  private Venta venta
  private CuentaPorCobrar cxc

  private BigDecimal subTotal = 0.0
  private BigDecimal totalImpuestosTrasladados



  def build(Venta factura){
    println 'Generando cfdi para factura: ' + factura
    this.venta = factura
    this.cxc = venta.cuentaPorCobrar
    this.empresa = Empresa.first()
    // assert empresa, 'La empresa no esta registrada...'
    buildComprobante()
    .buildFormaDePago()
    //.buildEmisor()
    .buildReceptor()

    
    return comprobante
  }
    

  def buildComprobante(){
    log.info("Generando CFDI 3.3 para factura: ${this.cxc.tipo} - ${this.cxc.documento}")
    this.comprobante = factory.createComprobante()
    comprobante.version = "3.3"
    comprobante.tipoDeComprobante = CTipoDeComprobante.I
    comprobante.serie = cxc.tipo
    comprobante.folio = cxc.documento.toString()
    comprobante.setFecha(DateUtils.getCfdiDate(new Date()))
    comprobante.moneda =  V33CfdiUtils.getMonedaCode(cxc.moneda)
    comprobante.lugarExpedicion = cxc.sucursal.direccion.codigoPostal
    return this
  }

  def buildEmisor(){
    /**** Emisor ****/
    Comprobante.Emisor emisor = factory.createComprobanteEmisor()
    emisor.rfc = empresa.rfc
    emisor.nombre = empresa.nombre
    emisor.regimenFiscal = empresa.regimenClaveSat ?:'601' 
    comprobante.emisor = emisor
    return this
  }

  def buildReceptor(){
    /** Receptor ***/
    Comprobante.Receptor receptor = factory.createComprobanteReceptor()
    receptor.rfc = venta.cliente.rfc
    receptor.nombre = venta.cliente.nombre
    switch(venta.usoDeCfdi) {
      case 'G01':
          receptor.usoCFDI = CUsoCFDI.G_01
          break
      case 'G02':
          receptor.usoCFDI = CUsoCFDI.G_02
          break
      case 'G03':
          receptor.usoCFDI = CUsoCFDI.G_03
          break
      default:
          receptor.usoCFDI = CUsoCFDI.G_01
      break
    }
    comprobante.receptor = receptor
    return this
  }

  /**
  *  FIX Para CRE, CON y COD
  */
  def buildFormaDePago(){
      comprobante.formaPago = '99'  // FIX
      comprobante.condicionesDePago = 'Credito 30 días'
      comprobante.metodoPago = CMetodoPago.PUE
      return this
  }
  def buildConceptos(){
    /** Conceptos ***/
    this.totalImpuestosTrasladados = 0.0
    Comprobante.Conceptos conceptos = factory.createComprobanteConceptos()
    this.venta.partidas.each { det ->
        
      Comprobante.Conceptos.Concepto concepto = factory.createComprobanteConceptosConcepto()
      concepto.with { 
        assert det.producto.productoSat, 
        "No hay una claveProdServ definida para el producto ${det.producto} SE REQUIERE PARA EL CFDI 3.3"
        assert det.producto.unidad.claveUnidadSat, 
        "No hay una claveUnidadSat definida para el producto ${det.producto} SE REQUIERE PARA EL CFDI 3.3"
        assert det.producto.unidad.unidadSat, 
        "No hay una unidadSat definida para el producto ${det.producto} SE REQUIERE PARA EL CFDI 3.3"
        String desc = det.producto.descripcion
        if(det.producto.clave == 'SRV0001'){
            desc+= ' ' + venta.comentario
        }
        claveProdServ = det.producto.productoSat.claveProdServ
        noIdentificacion = det.producto.clave
        cantidad = MonedaUtils.round(det.cantidad / det.producto.unidad.factor,3)
        claveUnidad = det.producto.claveUnidadSat
        unidad = det.producto.unidad.clave
        descripcion = desc
        valorUnitario = det.precio
        importe = det.importe
        // Impuestos del concepto
        concepto.impuestos = factory.createComprobanteConceptosConceptoImpuestos()
        concepto.impuestos.traslados = factory.createComprobanteConceptosConceptoImpuestosTraslados()
        Comprobante.Conceptos.Concepto.Impuestos.Traslados.Traslado traslado1 
        traslado1 = factory.createComprobanteConceptosConceptoImpuestosTrasladosTraslado()
        traslado1.base =  det.importe
        traslado1.impuesto = '002'
        traslado1.tipoFactor = CTipoFactor.TASA
        traslado1.tasaOCuota = '0.160000'
        traslado1.importe = MonedaUtils.round(det.importe * 0.16)
        this.totalImpuestosTrasladados += traslado1.importe
        concepto.impuestos.traslados.traslado.add(traslado1)
        conceptos.concepto.add(concepto)

        def pedimento=det.embarque?.pedimento
        if(pedimento){
            Comprobante.Conceptos.Concepto.InformacionAduanera aduana = 
                factory.createComprobanteConceptosConceptoInformacionAduanera()
            aduana.numeroPedimento = pedimento.pedimento
            concepto.informacionAduanera.add(aduana)
            descripcion = "${desc} ${pedimento.fecha.text()}"
        }
        comprobante.conceptos = conceptos
      }
    }
    return this
  }

  

  Comprobante getComprobante(){
    return this.comprobante
  }

}
