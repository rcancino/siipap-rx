package sx.cxc

import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured

@Secured("hasRole('ROLE_CXC_USER')")
class CobroController extends RestfulController{

    def cobroService

    static responseFormats = ['json']

    CobroController() {
        super(Cobro)
    }

    @Override
    protected List listAllResources(Map params) {
        def query = Cobro.where {}
        params.max = 200
        params.sort = params.sort ?:'lastUpdated'
        params.order = params.order ?:'desc'
        return query.list(params)
    }

    protected Cobro saveResource(Cobro resource) {
        println 'Salvando cobro: ' + resource
        def username = getPrincipal().username
        if(resource.id == null) {
            def serie = resource.sucursal.clave
            resource.createUser = username
        }
        resource.updateUser = username
        resource.aplicaciones.each {
            it.createUser = username
            it.updateUser = username
        }
        return super.saveResource(resource)
    }



}
