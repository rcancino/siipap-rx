package sx.server.integracion

import org.apache.commons.lang.exception.ExceptionUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import sx.core.*
import sx.cxc.NotaDeCargo

/**
 * Created by rcancino on 16/08/16.
 */
@Component
class ImportadorDeNotasDeCargo implements Importador, SW2Lookup{

    @Autowired
    ImportadorDeClientes importadorDeClientes

    def importar(Date ini, Date fin){

    }

    def importar(){
        importar(new Date())
    }

    def importar(fecha){
        logger.info("Importando notas de cargo del : ${fecha.format('dd/MM/yyyy')}" )
        def ids = leerRegistros("select cargo_id from SX_VENTAS where fecha = ? and tipo = ? ",[fecha.format('yyyy-MM-dd'), 'CAR'])
        logger.info('Registros: ' + ids.size())

        ids.each { r ->
            importar(r.cargo_id)
        }
        return 'OK'
    }

    def importar(String sw2){
        String select = QUERY + " where tipo = ? and cargo_id = ? "
        def row = findRegistro(select, ['CAR',sw2])
        def venta = build(row)

    }

    def build(def row){
        logger.info('Importando venta con ROW: ' + row)
        def cargo = NotaDeCargo.where{ sw2 == row.sw2}.find()
        if(!cargo){
            cargo = new NotaDeCargo()
        }
        bindData(cargo,row)
        //venta.sucursal = buscarSucursal(row.sucursal_id)
        Cliente cliente = Cliente.where {sw2 == row.cliente_id}.find()
        if(!cliente){
            cliente = importadorDeClientes.importar(row.cliente_id)
        }
        cargo.cliente = cliente
        //importarPartidas(venta)
        try{
            cargo = cargo.save failOnError:true, flush:true
            return cargo
        }catch (Exception ex){
            logger.error(ExceptionUtils.getRootCauseMessage(ex))
        }

    }
    /*
    def importarPartidas(NotaDeCargo cargo){

        List partidas = leerRegistros(QUERY_PARTIDAS,[cargo.sw2])
        cargo.partidas.clear()
        partidas.each{ row ->
            logger.info('Importando partida: ' + row.clave)
            VentaDet det = new  VentaDet()
            det.sucursal = buscarSucursal(row.sucursal_id)
            Producto producto = Producto.where {sw2 == row.producto_id}.find()
            if(!producto) {
                logger.info("Importando producto $row.producto_id para la venta")
                producto = importadorDeProductos.importar( row.producto_id)
                assert producto, 'No fue posible importar el producto :' +row.producto_id
            }
            det.producto = producto
            bindData(det,row)
            venta.addToPartidas(det)
        }
    }
    */


    static String QUERY = """
       select
        cliente_id,
        clave,
        nombre,
        (SELECT c.rfc FROM sx_clientes c where c.CLIENTE_ID=v.CLIENTE_ID) rfc,
        (case when v.ANTICIPO is true then 'ANT'
            when v.POST_FECHADO is true then 'PSF'
            when v.POST_FECHADO is false and v.origen='CRE' then 'CRE'
            when v.origen='CAM' and V.CE is true then 'COD'
            when v.origen='CAM' and V.CE is false then 'CON'
            when v.origen='MOS' then 'CON' else 'ND'  end     ) tipo,
        v.origen,
        v.docto as folio,
        v.fecha fecha,
        ,(SELECT c.serie FROM sx_cfdi c where c.ORIGEN_ID=v.cargo_id) as serie
        ,(SELECT c.uuid FROM sx_cfdi c where c.ORIGEN_ID=v.cargo_id) as uuid
        ,v.moneda
        ,v.tc as tipoDeCambio
        ,v.importe
        ,v.descuento
        ,v.impuesto
        ,v.total
        ,v.fpago as formaDePago
        ,v.comentario
        ,v.cargo_id as sw2
        ,VTO as     vencimiento
        from sx_ventas v

    """

    static String QUERY_PARTIDAS  = """
    select
        D.sucursal_id,
        D.producto_id,
        D.clave,
        D.descripcion,
        D.unidad_id as unidad,
        D.factorU as factor,
        D.nacional,
        D.documento,
        D.fecha,
        D.cantidad,
        D.kilos,
        D.precio_l AS precioOriginal,
        D.precio_l as precioLista,
        D.precio,
        D.importe,
        D.dscto_orig as desctoOriginal,
        D.dscto as descuento,
        D.importe-D.importe_neto AS importeDescuento,
        D.importe_neto as importeNeto,
        D.cortes,
        D.precio_cortes as precioCortes,
        D.cortes*D.precio_cortes as importeCortes,
        D.cortes_Instruccion as cortesInstruccion,
        D.subtotal,
        D.costo as costoReposicion,
        D.costoP as costoPromedio,
        D.costoU as costoUltimo,
        (case when D.CORTES=0 then 'false' else 'true' end) as cortado,
        D.comentario,
        D.inventario_id as sw2
        from sx_ventasdet D
        where venta_id = ?

    """
}
