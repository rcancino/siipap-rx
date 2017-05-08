package sx.server.integracion

import grails.web.databinding.DataBinder
import groovy.sql.Sql
import org.springframework.stereotype.Component
import sx.core.Cliente
import sx.core.Direccion
import sx.core.Sucursal


/**
 * Created by rcancino on 19/09/16.
 */
@Component
class ImportadorDeClientes implements  Importador{


    def importar(){
        logger.info('Importando clientes' + new Date().format('dd/MM/yyyy HH:mm:ss'))

        //def hoy = toSqlDate(new Date())
        def importados = 0
        leerRegistros(QUERY,[]).each { row ->

            def cliente = Cliente.where{ sw2 == row.cliente_id}.find()
            if(!cliente){
                cliente = new Cliente()
                importados++
            }
            bindData(cliente,row)
            cliente.direccion = cliente.direccion ?: new Direccion()
            bindData(cliente.direccion,row)

            cliente.save flush:true
        }
        def message = "Clientes importados: $importados"
        return message
    }

    def importar(def sw2){
        def cliente = Cliente.where{ sw2 == sw2}.find() ?: new Cliente()
        def select = QUERY_ROW + ' where cliente_id = ?'
        def row = getSql().firstRow(select,[sw2])
        bindData(cliente,row)
       // cliente.direccion = cliente.direccion ?: new Direccion()
       // bindData(cliente.direccion,row)+
        cliente.sucursal=Sucursal.findBySw2(1)
        cliente.save failOnError:true, flush:true

    }

    def sincronizar(){

    }

    def importarCatalogoClientes(){


        def queryAudit=""" select * from audit_log_integration where entityName='Cliente' and replicado is null"""


        getSql().eachRow(queryAudit){audit ->
            def queryEntity=""" select * from entity_integration where table_name=?  """



            if(audit.action.equals("INSERT")){

                println "Importando: "+audit.entityId
               importar(audit.entityId)

            }

            if(audit.action.equals("UPDATE")){
                println "Actualizando"
            }

        }
    }

    static String QUERY = """
            select
            cliente_id as sw2,
            clave,nombre,rfc,
            if(suspendido,'false','true') as activo,
            juridico,
            permitir_cheque as permitirCheque,
            calle,
            numero,
            numeroint,
            delmpo as municipio,
            cp ,
            colonia,
            estado,
            pais
            1 as sucursal
            from sx_clientes
            where year(modificado) > 2015  and month(modificado) > 1
            """
    static String QUERY_ROW = """
            select
            cliente_id as sw2,
            clave,nombre,rfc,
            if(suspendido,'false','true') as activo,
            juridico,
            permitir_cheque as permitirCheque,
            calle,
            numero,
            numeroint,
            delmpo as municipio,
            cp ,
            colonia,
            estado,
            pais
            from sx_clientes

            """
}
