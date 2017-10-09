package sx.inventario

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Secured("ROLE_INVENTARIO_USER")
class ConteoController extends RestfulController {

    static responseFormats = ['json']

    ConteoController() {
        super(Conteo)
    }

    @Override
    protected List listAllResources(Map params) {
        params.sort = 'lastUpdated'
        params.order = 'desc'
        def query = Conteo.where {}
        if(params.sucursal) {
            query = query.where { sucursal.id == params.sucursal}
        }
        return query.list(params)
    }

    // @Override
    protected Conteo saveResource(Conteo resource) {
        def username = getPrincipal().username
        if(resource.id == null) {
            resource.createUser = username
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }

    protected Conteo updateResource(Conteo resource) {
        def username = getPrincipal().username
        resource.updateUser = username
        this.fixIndice resource
        return super.updateResource(resource)
    }

    private fixIndice(Conteo conteo){
        def renglon = 1;
        conteo.partidas.each { det ->
            det.indice = renglon++;
        }
        return conteo
    }
    

}


