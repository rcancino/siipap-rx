package sx.cxc

import grails.transaction.Transactional


@Transactional
class CobroService {

	def ventaService

  def generarCobroDeContado(CuentaPorCobrar cxc, List<Cobro> cobros) {
  	
  	// println "Registrando cobros para  la cuenta por cobrar ${cxc.documento} Saldo: ${cxc.saldo}" 

  	def saldo = cxc.saldo
  	
    cobros.each { cobro ->
    	def disponible = cobro.disponible
    	def importe = disponible < saldo ? disponible : saldo
    	// println "Saldo ${saldo} Disponible: ${disponible} Aplicacion: ${importe}"
    	def aplicacion = new AplicacionDeCobro()
    	aplicacion.cuentaPorCobrar = cxc
    	aplicacion.fecha = new Date()
    	aplicacion.importe = importe
    	cobro.addToAplicaciones(aplicacion)
    	disponible = disponible - aplicacion.importe
    	
    	if(disponible < 10 && disponible > 0.01) {
    		cobro.diferencia = disponible
    		cobro.diferenciaFecha = new Date()
    	}
      setComisiones(cobro)
    	cobro.save()
    	saldo = saldo - importe
    }
    

    return cxc
    
  }

  private setComisiones(Cobro cobro) {
    if (cobro.tarjeta) {
      if(cobro.tarjeta.debitoCredito) {
        cobro.tarjeta.comision = 1.46
      } else if (cobro.tarjeta.visaMaster) {
        cobro.tarjeta.comision = 2.36
      } else {
        cobro.tarjeta.comision = 3.80
      }
    }
  }


}
