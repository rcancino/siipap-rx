package sx.inventario


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured


import grails.transaction.Transactional

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
            resource.createUser = username
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }

    protected Sector updateResource(Sector resource) {
        def username = getPrincipal().username
        resource.updateUser = username
        this.fixIndice resource
        return super.updateResource(resource)
    }

    private fixIndice(Sector sector){
        def renglon = 1;
        sector.partidas.each { det ->
            det.indice = renglon++;

        }
        return sector
    }

    @Transactional
    def generarConteo() {
        def username = getPrincipal().username
        def result = [:]
        def sectores = Sector.list([sort:'sectorFolio', order:'asc']);
        sectores.each { sector ->
            Conteo conteo = Conteo.where{ sector == sector}.find()
            if(!conteo){
                conteo = new Conteo([
                sucursal: sector.sucursal,
                documento: sector.sectorFolio,
                fecha: new Date(),
                sector: sector,
                createUser: username
                ])
            }
            conteo.partidas.clear()
            sector.partidas.each { det ->
                conteo.addToPartidas(new ConteoDet([producto: det.producto]))
            }
            conteo.updateUser = username
            conteo.save failOnError: true, flush:true
        }
        result.message = 'Conteos generados exitosamente'
        result.conteos = sectores.size
        respond(result, status: 200)
    }
    

}


