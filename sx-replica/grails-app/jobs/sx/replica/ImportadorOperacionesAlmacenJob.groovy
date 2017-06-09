package sx.replica

import org.springframework.beans.factory.annotation.Autowired
import sx.server.integracion.ImportadorDeCompras
import sx.server.integracion.ImportadorDeDevolucionDeVentas
import sx.server.integracion.ImportadorDeRecepcionDeCompras
import sx.server.integracion.ImportadorDeTransFormaciones
import sx.server.integracion.ImportadorDeTraslados
import sx.server.integracion.ImportadorDevolucionCompra
import sx.server.integracion.ImportadorMovimientoAlmacen
import  java.util.Date

class ImportadorOperacionesAlmacenJob {
    static triggers = {
        cron name:'importadorOpAlmacen', startDelay:10000, cronExpression: '0 0 21 * * ?'
    }

    @Autowired
    ImportadorMovimientoAlmacen importadorMovimientoAlmacen
    @Autowired
    ImportadorDeTransFormaciones importadorDeTransFormaciones
    @Autowired
    ImportadorDeTraslados importadorDeTraslados
    @Autowired
    ImportadorDeDevolucionDeVentas importadorDeDevolucionDeVentas
    @Autowired
    ImportadorDeRecepcionDeCompras importadorDeRecepcionDeCompras
    @Autowired
    ImportadorDevolucionCompra importadorDevolucionCompra
    @Autowired
    ImportadorDeCompras importadorDeCompras

    def fecha=new Date()


    def execute() {



        println "Importando movimientos  "+fecha
        importadorMovimientoAlmacen.importar(fecha)

        println "Importando transformaciones"
        importadorDeTransFormaciones.importar(fecha)

        println "Importando Traslados"
        importadorDeTraslados.importar(fecha)

        println "Importando Dev Ventas"
        importadorDeDevolucionDeVentas.importar(fecha)

        println "Importando Recepcion Compras"
        importadorDeRecepcionDeCompras.importar(fecha)

        println "Importando Devolucion Compras"
        importadorDevolucionCompra.importar(fecha)

        println "Importando Compras"
        importadorDeCompras.importar(fecha)


    }
}
