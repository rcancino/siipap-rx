package sx.core

import grails.transaction.Transactional

import sx.cxc.CuentaPorCobrar

import com.luxsoft.cfdix.v33.CfdiBuilder33

@Transactional
class VentaService {

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
      cxc.documento = pedido.documento
      cxc.importe = pedido.importe
      cxc.impuesto = pedido.impuesto
      cxc.total  = pedido.total
      cxc.formaDePago = pedido.formaDePago
      cxc.moneda = pedido.moneda
      cxc.tipoDeCambio = pedido.tipoDeCambio
      cxc.comentario = pedido.comentario
      cxc.tipo = pedido.cod ? 'COD': pedido.tipo
      cxc.fecha = new Date()
      cxc.createUser = pedido.createUser
      cxc.updateUser = pedido.updateUser
      pedido.cuentaPorCobrar = cxc
      cxc.save failOnError: true
      pedido.cuentaPorCobrar = cxc
      pedido.save flush: true
    }
    
  }

  def generarCfdi(Venta pedido){
    CfdiBuilder33  builder = new CfdiBuilder33()
    // def comprobante = builder.build(venta)
    // pedido.save failOnError: true
    return pedido
  }

}
