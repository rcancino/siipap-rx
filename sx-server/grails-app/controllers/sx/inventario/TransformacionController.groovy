package sx.inventario


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio
import sx.core.Inventario

@Secured("ROLE_INVENTARIO_USER")
class TransformacionController extends RestfulController {

    static responseFormats = ['json']

    TransformacionController() {
        super(Transformacion)
    }

    @Override
    protected List listAllResources(Map params) {

        params.sort = 'lastUpdated'
        params.order = 'desc'
        def query = Transformacion.where {}
        if(params.documento) {
            def documento = params.int('documento')

            query = query.where {documento >=  documento}
        }
        return query.list(params)
    }

    // @Override
    protected Transformacion saveResource(Transformacion resource) {
        def serie = resource.sucursal.clave
        resource.documento = Folio.nextFolio('TRANSFORMACION',serie)
        def username = getPrincipal().username
        resource.createUser = username
        resource.updateUser = username
        return super.saveResource(resource)
    }


    protected Transformacion updateResource(Transformacion resource) {
        println 'Actualizando transformacion params: ' + params

        if(params.inventariar){
            resource.partidas.each { det ->
                Inventario inventario = new Inventario()
                inventario.sucursal = resource.sucursal
                inventario.documento = resource.documento
                inventario.cantidad = det.cantidad
                inventario.comentario = det.comentario
                inventario.Fecha = resource.fecha
                inventario.producto = det.producto
                inventario.tipo = resource.tipo
                det.inventario = inventario
            }
            resource.fechaInventario = new Date()

        }

        return super.updateResource(resource)
    }

    def inventariar(Transformacion trs){

    }
}
