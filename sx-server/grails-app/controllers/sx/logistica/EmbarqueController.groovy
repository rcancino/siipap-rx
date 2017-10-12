package sx.logistica

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio
import sx.core.Sucursal

@Secured("ROLE_INVENTARIO_USER")
class EmbarqueController extends RestfulController {
    
    static responseFormats = ['json']

    EmbarqueController() {
        super(Embarque)
    }

    @Override
    protected List listAllResources(Map params) {
        params.sort = 'documento'
        params.order = 'asc'
        def query = Embarque.where {}
        if(params.sucursal){
            query = query.where {sucursal.id ==  params.sucursal}   
        }
        if(params.documento) {
            def documento = params.int('documento')
            query = query.where {documento >=  documento}
        }
        return query.list(params)
    }

    protected Embarque saveResource(Embarque resource) {
        def username = getPrincipal().username
        if(resource.id == null) {
            def serie = resource.sucursal.clave
            resource.documento = Folio.nextFolio('EMBARQUES',serie)
            resource.createUser = username
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }

    protected Embarque updateResource(Embarque resource) {
        println 'Actualizando '
        resource.updateUser = getPrincipal().username
        return super.updateResource(resource)
    }

}
