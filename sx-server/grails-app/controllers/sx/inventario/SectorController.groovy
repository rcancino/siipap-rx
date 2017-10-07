package sx.inventario


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio

@Secured("ROLE_INVENTARIO_USER")
class SectorController extends RestfulController {

    static responseFormats = ['json']

    SectorController() {
        super(Sector)
    }

    @Override
    protected List listAllResources(Map params) {

        params.sort = 'lastUpdated'
        params.order = 'desc'
        def query = Sector.where {}
        if(params.documento) {
            def documento = params.int('documento')
            query = query.where {sectorFolio >=  documento}
        }
        if(params.sucursal) {
            query = query.where { sucursal.id == params.sucursal}
        }
        return query.list(params)
    }

    // @Override
    protected Sector saveResource(Sector resource) {
        def username = getPrincipal().username
        if(resource.id == null) {
            def serie = resource.sucursal.clave
            resource.documento = Folio.nextFolio('SECTOR',serie)
            resource.createUser = username
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }

}


