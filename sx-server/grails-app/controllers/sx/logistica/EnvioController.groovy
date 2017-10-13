package sx.logistica

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio
import sx.core.Sucursal
import sx.core.Venta
import grails.transaction.Transactional



@Secured("ROLE_INVENTARIO_USER")
class EnvioController extends RestfulController {
    
    static responseFormats = ['json']
    
    def reporteService

    EnvioController() {
        super(Envio)
    }

    // @Override
    // protected List listAllResources(Map params) {
    //     params.sort = 'documento'
    //     params.order = 'desc'
    //     params.max = 500
    //     def query = Embarque.where {}
    //     if(params.sucursal){
    //         query = query.where {sucursal.id ==  params.sucursal}   
    //     }
    //     if(params.documento) {
    //         def documento = params.int('documento')
    //         query = query.where {documento >=  documento}
    //     }
    //     if(params.transito) {
    //         query = query.where{regreso == null && salida != null}
    //     }
    //     return query.list(params)
    // }

    // protected Embarque saveResource(Embarque resource) {
    //     def username = getPrincipal().username
    //     if(resource.id == null) {
    //         def serie = resource.sucursal.clave
    //         resource.documento = Folio.nextFolio('EMBARQUES',serie)
    //         resource.createUser = username
    //     }
    //     resource.updateUser = username
    //     return super.saveResource(resource)
    // }

    protected Envio updateResource(Envio resource) {
        /*
        resources.partidas.each { it ->
            condicion = CondicionDeEnvio.where{venta.id == it.origen}.find()
            if(condicion) {
                condicion.asignado = new Date()
            } 
            condicion.save()
        }
        */
        // resource.updateUser = getPrincipal().username
        return super.updateResource(resource)
    }

    

    // @Transactional
    // def registrarSalida(Embarque res) {
    //     if (res == null) {
    //         notFound()
    //         return
    //     }
    //     res.salida = new Date()
    //     res.save()
    //     respond res
    // }


}

