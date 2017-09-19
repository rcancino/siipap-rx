package sx.inventario


import grails.rest.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio

@Secured("ROLE_INVENTARIO_USER")
class MovimientoDeAlmacenController extends RestfulController {

    static responseFormats = ['json']

    MovimientoDeAlmacenController() {
        super(MovimientoDeAlmacen)
    }

    @Override
    protected List listAllResources(Map params) {

        params.sort = 'lastUpdated'
        params.order = 'desc'
        def query = MovimientoDeAlmacen.where {}

        if(params.documento) {
            def documento = params.int('documento')

            query = query.where {documento >=  documento}
        }
        if(params.comentario){
            query = query.where {comentario =~ params.comentario}
        }
        return query.list(params)
    }

    // @Override
    protected MovimientoDeAlmacen saveResource(MovimientoDeAlmacen resource) {
        def serie = resource.sucursal.clave
        resource.documento = Folio.nextFolio('MOVIMIENTO',serie)
        def username = getPrincipal().username
        resource.createUser = username
        resource.updateUser = username
        return super.saveResource(resource)
    }
}
