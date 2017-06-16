package sx.server.integracion

import org.apache.commons.lang.exception.ExceptionUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import sx.core.Cliente
import sx.core.Producto
import sx.core.Socio
import sx.core.Venta
import sx.core.VentaCredito
import sx.core.VentaDet
import sx.cxc.CuentaPorCobrar

/**
 * Created by rcancino on 16/08/16.
 */
@Component
class ImportadorDeCuentasPorCobrar implements Importador, SW2Lookup{

    @Autowired
    ImportadorDeClientes importadorDeClientes

    @Autowired
    ImportadorDeProductos importadorDeProductos

    @Autowired
    ImportadorDeVentas importadorDeVentas

    @Autowired
    ImportadorDeCfdi importadorDeCfdi


    def importar(Date ini, Date fin){

    }

    def importar(fecha){
        logger.info("Importando cuentas por cobrar del : ${fecha.format('dd/MM/yyyy')}" )
        def ids = leerRegistros("select cargo_id from SX_VENTAS where fecha = ? ",[fecha.format('yyyy-MM-dd')])
        logger.info('Registros: ' + ids.size())
        ids.each { r ->
            importar(r.cargo_id)
        }
    }

    def importar(String sw2){
        logger.info('Importando Cuenta Por cobrar ' + sw2)
        String select = QUERY + " where  cargo_id = ? "
        def row = findRegistro(select, [sw2])
        build(row)
        importadorDeCfdi.importar(sw2)
    }

    def build(def row){

        CuentaPorCobrar cuentaPorCobrar=CuentaPorCobrar.where{sw2==row.sw2}.find()

        if(!cuentaPorCobrar){
            cuentaPorCobrar =new CuentaPorCobrar()
        }

        bindData(cuentaPorCobrar,row)
        cuentaPorCobrar.sucursal = buscarSucursal(row.sucursal_id)
        Cliente cliente = Cliente.where {sw2 == row.cliente_id}.find()
        if(!cliente){
            cliente = importadorDeClientes.importar(row.cliente_id)
        }
        cuentaPorCobrar.cliente = cliente



        try{
            cuentaPorCobrar.save failOnError:true, flush:true
            Venta venta=Venta.where{sw2==cuentaPorCobrar.sw2}.find()
            venta.cuentaPorCobrar=cuentaPorCobrar
            venta.save failOnError: true, flush: true
        }catch (Exception ex){
            logger.error(ExceptionUtils.getRootCauseMessage(ex))
        }

    }


    static String QUERY = """
    SELECT
        cliente_id,
        sucursal_id,
        fecha,
        docto as documento,
        importe,
        impuesto,
        total,
        FPAGO as formaDePago,
        moneda,
        CARGOS as cargo,
        comentario,
        creado as dateCreated,
        MODIFICADO as lastUpdated,
        CREADO_USERID as createUser,
        MODIFICADO_USERID as updateUser,
        case when tipo='FAC' THEN 'VENTA'
            WHEN TIPO='CHE' THEN 'CHEQUE_DEVUELTO'
            WHEN TIPO='CAR' THEN 'NOTA_DE_CARGO'
            WHEN TIPO='TES'  THEN 'DEVOLUCION_CLIENTE' END AS tipoDocumento,
        CARGO_ID as sw2,(select uuid from sx_cfdi c where c.ORIGEN_ID= v.cargo_id ) as uuid
    FROM sx_ventas v

    """

}
