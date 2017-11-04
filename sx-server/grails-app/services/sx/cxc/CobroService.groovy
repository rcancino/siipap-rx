package sx.cxc

import grails.transaction.Transactional


@Transactional
class CobroService {

  def generarCobroDeContado(CuentaPorCobrar cxc, def params) {
    println "Generando cobro de venta de contado con tipo ${params}"
  }
}
