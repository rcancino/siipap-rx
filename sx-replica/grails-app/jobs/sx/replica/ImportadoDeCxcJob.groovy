package sx.replica

import org.springframework.beans.factory.annotation.Autowired
import sx.server.integracion.ImportadorDeAplicacionDeCobro
import sx.server.integracion.ImportadorDeChequesDevueltos
import sx.server.integracion.ImportadorDeCobros
import sx.server.integracion.ImportadorDeCorteDeTarjetas
import sx.server.integracion.ImportadorDeCuentasPorCobrar
import sx.server.integracion.ImportadorDeNotasDeCargo

class ImportadoDeCxcJob {
    static triggers = {
        cron name:'importadorOpAlmacen', startDelay:10000, cronExpression: '0 0 19 * * ?'
    }

    @Autowired ImportadorDeCobros importadorDeCobros

    @Autowired ImportadorDeChequesDevueltos importadorDeChequesDevueltos

    @Autowired ImportadorDeCorteDeTarjetas importadorDeCorteDeTarjetas

    @Autowired ImportadorDeCuentasPorCobrar importadorDeCuentasPorCobrar

    @Autowired ImportadorDeNotasDeCargo importadorDeNotasDeCargo

    @Autowired ImportadorDeAplicacionDeCobro importadorDeAplicacionDeCobro


    def fecha=new Date()

    def execute() {

        println "Importando Cuentas por Cobrar"

                importadorDeCobros.importar(fecha)

                importadorDeChequesDevueltos.importar(fecha)

                importadorDeCorteDeTarjetas.importar(fecha)

                importadorDeCuentasPorCobrar.importar(fecha)

                importadorDeNotasDeCargo.importar(fecha)

                importadorDeAplicacionDeCobro.importar(fecha)

    }
}
