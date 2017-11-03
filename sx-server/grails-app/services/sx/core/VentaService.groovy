package sx.core

import grails.transaction.Transactional

import sx.cxc.CuentaPorCobrar

@Transactional
class VentaService {

    def facturar(Venta pedido) {
      return generarCuentaPorCobrar(pedido)
    }

    def generarCuentaPorCobrar(Venta pedido) {
      assert !pedido.cuentaPorCobrar, 'Cuenta por cobrar ya generada'
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
      cxc.tipo = pedido.tipo
      cxc.fecha = new Date()
      cxc.createUser = pedido.createUser
      cxc.updateUser = pedido.updateUser
      pedido.cuentaPorCobrar = cxc
      cxc.save failOnError: true
      pedido.save failOnError: true
      return pedido
    }
}
