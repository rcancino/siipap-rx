package sx.server.integracion.exportacion

import groovy.sql.Sql
import sx.core.Cliente
import sx.replica.AuditLog

import java.sql.ResultSetMetaData

/**
 * Created by rcancino on 03/05/17.
 */
class Clientes implements  Exportador{



    def exportar(Cliente cliente){
        Sql sql = buildSql()
        sql.rows("select * sx_sucursales limit 1", { ResultSetMetaData meta ->

            //ResultSetMetaData rs = (ResultSetMetaData) meta

        })
        Map params = ['id', cliente[map.get('id')]] // cliente.id

        params['sucursal_id'] = cliente.sucursal.sw2

        sql.executeInsert(INSERT, params)
    }



    String INSERT = """
        insert into SX_CLIENTES
        (
        id:     id,
        clave:  CLAVE,
        nombre: NOMBRE,
        sucursal_id: sucursal_id        
        )
    """

    Map map = [
            clave: 'CLAVE',
            nombre: 'NOMBRE',
            rfc: 'RFC',
            'sucursal_id': 'sw2'
    ]
}


