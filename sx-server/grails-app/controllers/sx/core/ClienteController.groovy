package sx.core

import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio

@Secured("IS_AUTHENTICATED_ANONYMOUSLY")
class ClienteController extends RestfulController{

    static responseFormats = ['json']

    ClienteController(){
        super(Cliente)
    }

    
    @Override
    protected List listAllResources(Map params) {
        def query = Cliente.where {}
        params.sort = params.sort ?:'lastUpdated'
        params.order = params.order ?:'desc'

        if(params.term){
            def search = '%' + params.term + '%'
            //query = query.where { clave =~ search || nombre =~ search}
            query = query.where { nombre =~ search}
        }
        if(params.activo){
            query = query.where { activo == params.activo}
        }

        return query.list(params)
    }

    protected Cliente saveResource(Cliente resource) {
        def username = getPrincipal().username
        
        if(resource.id == null) {
            def sucursal = Sucursal.get(params.sucursal)
            assert sucursal, 'No existe la sucursal ' + params.sucursal
            def serie = sucursal.nombre
            def fol = Folio.nextFolio('CLIENTES',serie).toString()
            fol = fol.padLeft(7, '0')
            def clave = "SX${serie.substring(0,2)}${fol}"
            println 'Clave generada para nuevo cliente: ' + clave 
            resource.clave = clave
            resource.createUser = username
            if (resource.vendedor == null) {
                resource.vendedor = Vendedor.where { nombres == 'CASA'}.find()
            }
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }




}
