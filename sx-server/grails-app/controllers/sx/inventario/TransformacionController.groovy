package sx.inventario


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio

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
}
