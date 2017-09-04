package sx.compras

import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio

@Secured("ROLE_COMPRAS_USER")
class CompraController extends RestfulController{

    static responseFormats = ['json']

    CompraController(){
        super(Compra)
    }

    @Override
    protected List listAllResources(Map params) {
        def query = Compra.where {}
        
        if(params.pendientes){
            query = query.where {pendiente == true}
        }
        return query.list(params)
    }

    @Override
    protected Object saveResource(Object resource) {
        resource.folio = Folio.nextFolio('COMPRA','OFICINAS')
        resource.createdBy = getPrincipal().username
        return super.saveResource(resource)
    }

}
