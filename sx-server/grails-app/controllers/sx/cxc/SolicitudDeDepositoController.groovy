package sx.cxc

import grails.rest.RestfulController
import groovy.transform.ToString
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Sucursal

@Secured("hasRole('ROLE_POS_USER')")
class SolicitudDeDepositoController extends RestfulController{

    static responseFormats = ['json']

    SolicitudDeDepositoController(){
        super(SolicitudDeDeposito)
    }
    

    protected SolicitudDeDeposito saveResource(SolicitudDeDeposito resource) {
        def username = getPrincipal().username
        if(resource.id == null) {
            def serie = resource.sucursal.nombre
            resource.documento = Folio.nextFolio('SOLICITUDES_DEPOSITO',serie)
            resource.createUser = username
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }

    protected SolicitudDeDeposito updateResource(SolicitudDeDeposito resource) {
        def username = getPrincipal().username
        resource.updateUser = username
        return super.updateResource(resource)
    }

    def pendientes(Sucursal sucursal) {
        if (sucursal == null) {
            notFound()
            return
        }
        params.max = params.registros ?:10
        params.sort = params.sort ?:'lastUpdated'
        params.order = params.order ?:'desc'
        def sols = SolicitudDeDeposito.where{ sucursal == sucursal && cobro == null}.list(params)
        respond sols
    }
    
}

