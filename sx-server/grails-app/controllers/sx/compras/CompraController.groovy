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
        params.sort = 'lastUpdated'
        params.order = 'desc'
        def query = Compra.where {}
        if(params.sucursal) {
            query = query.where { sucursal.id == params.sucursal }
            //query = query.where { sucursal.id == params.sucursal || sucursal.nombre =='OFICINAS'}
        }
        if(params.pendientes){
            query = query.where {pendiente == true}
        }
        if( params.folio) {
            query = query.where {folio == params.int('folio') }
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
