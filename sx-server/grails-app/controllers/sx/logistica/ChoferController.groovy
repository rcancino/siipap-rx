package sx.logistica


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Sucursal

@Secured("ROLE_EMBARQUES_USER")
class ChoferController extends RestfulController {
    
    static responseFormats = ['json']

    ChoferController() {
        super(Chofer)
    }

    @Override
    protected List listAllResources(Map params) {
        params.sort = 'lastUpdated'
        params.order = 'desc'
        return Chofer.list(params)
    }

    protected Chofer saveResource(Chofer resource) {
        def username = getPrincipal().username
        resource.createUser = username
        resource.updateUser = username
        return super.saveResource(resource)
    }

    protected Chofer updateResource(Chofer resource) {
        resource.updateUser = getPrincipal().username
        return super.updateResource(resource)
    }

}
