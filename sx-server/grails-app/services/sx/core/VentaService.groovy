package sx.core

import com.luxsoft.cfdix.v33.CfdiSellador33
import grails.transaction.Transactional
import sx.cfdi.Cfdi
import sx.cfdi.CfdiService
import sx.cfdi.CfdiTimbradoService
import sx.cxc.CuentaPorCobrar
import lx.cfdi.v33.CfdiUtils

import com.luxsoft.cfdix.v33.CfdiBuilder33
import com.luxsoft.cfdix.v33.CfdiFacturaBuilder

@Transactional
class VentaService {

  CfdiService cfdiService
  CfdiTimbradoService cfdiTimbradoService

  def facturar(Venta pedido) {
    generarCuentaPorCobrar(pedido)
    generarCfdi(pedido)
  }

  def generarCuentaPorCobrar(Venta pedido) {
    if (pedido.cuentaPorCobrar == null) {
      CuentaPorCobrar cxc = new CuentaPorCobrar()
      cxc.sucursal = pedido.sucursal
      cxc.cliente = pedido.cliente
      cxc.tipoDocumento = 'VENTA'
      cxc.importe = pedido.importe
      cxc.impuesto = pedido.impuesto
      cxc.total  = pedido.total
      cxc.formaDePago = pedido.formaDePago
      cxc.moneda = pedido.moneda
      cxc.tipoDeCambio = pedido.tipoDeCambio
      cxc.comentario = pedido.comentario
      cxc.tipo = pedido.cod ? 'COD': pedido.tipo
      cxc.documento = Folio.nextFolio('FACTURAS',cxc.tipo)
      cxc.fecha = new Date()
      cxc.createUser = pedido.createUser
      cxc.updateUser = pedido.updateUser
      cxc.comentario = 'GENERACION AUTOMATICA'
      pedido.cuentaPorCobrar = cxc
      cxc.save failOnError: true
      pedido.cuentaPorCobrar = cxc
      pedido.save flush: true
    }
    
  }

  def generarCfdi(Venta venta){
    assert venta.cuentaPorCobrar, " La venta ${venta.documento} no se ha facturado"
    CfdiFacturaBuilder builder = new CfdiFacturaBuilder();
    def comprobante = builder.build(venta)
    println CfdiUtils.serialize(comprobante)
    def cfdi = cfdiService.generarCfdi(comprobante, 'I')
    venta.cuentaPorCobrar.cfdi = cfdi
    venta.save flush: true
    return cfdi
  }

  def timbrar(Venta venta){
    assert venta.cuentaPorCobrar, "La venta ${venta} no se ha facturado"
    assert !venta.cuentaPorCobrar?.cfdi?.uuid, "La venta ${venta} ya esta timbrada "
    def cfdi = venta.cuentaPorCobrar.cfdi
    if (cfdi == null) {
      cfdi = generarCfdi(venta)
    }
    cfdi = cfdiTimbradoService.timbrar(cfdi)
    return cfdi;
  }



}
