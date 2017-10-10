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

        params.sort = 'sectorFolio'
        params.order = 'asc'
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
        resource.partidas = resource.partidas.sort { it.indice}
        def username = getPrincipal().username
        resource.updateUser = username
        return super.updateResource(resource)
    }

    

    // @Transactional
    // def generarConteo() {
    //     def username = getPrincipal().username
    //     def today = new Date()
    //     def result = [:]
    //     def sectores = Sector.list([sort:'sectorFolio', order:'asc']);
    //     def conteos = [];
    //     sectores.each { sector ->
    //         Conteo conteo = Conteo.where{ sector == sector && fecha == today}.find()
    //          // println "Encontro conteo para sector ${sector.sectorFolio} y fecha ${today}"
    //         if( !conteo ){
    //             println "No encontro conteo para sector ${sector.sectorFolio} y fecha ${today}"
    //             conteo = new Conteo([
    //             sucursal: sector.sucursal,
    //             documento: sector.sectorFolio,
    //             fecha: new Date(),
    //             sector: sector,
    //             createUser: username
    //             ])
    //             sector.partidas.each { det ->
    //                 conteo.addToPartidas(new ConteoDet([producto: det.producto]))
    //             }
    //             conteo.updateUser = username
    //             conteo.save failOnError: true, flush:true
    //             conteos << conteo
    //         }   
            
    //     }
    //     result.message = 'Conteos generados exitosamente'
    //     result.conteos = conteos
    //     // println 'Res: '+ result
    //     respond(result, status: 200)
    // }
    

}


