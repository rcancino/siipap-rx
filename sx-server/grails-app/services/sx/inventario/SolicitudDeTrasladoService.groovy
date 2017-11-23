package sx.inventario

import grails.transaction.Transactional

import sx.core.Venta

@Transactional
class SolicitudDeTrasladoService {

  def generarSolicitudAutomatica(Venta venta) {
    println 'Generando vale automatico para venta: ' + venta
  }


}
