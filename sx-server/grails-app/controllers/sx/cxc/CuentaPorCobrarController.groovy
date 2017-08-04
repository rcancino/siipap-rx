package sx.cxc

import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured

@Secured("hasRole('ROLE_CXC_USER')")
class CuentaPorCobrarController extends RestfulController{

    static responseFormats = ['json']

    CuentaPorCobrarController() {
        super(CuentaPorCobrar)
    }

    @Override
    protected List listAllResources(Map params) {
      println 'Cxcx para ' + params
        def query = CuentaPorCobrar.where {}
        params.sort = params.sort ?:'lastUpdated'
        params.order = params.order ?:'desc'

        // if(params.term){
        //     def search = '%' + params.term + '%'
        //     query = query.where { cliente.nombre =~ search && documento.toString() == search}
        // }
        if(params.documento){
          int documento = params.int('documento')
          query = query.where { documento >= documento }
        }
        if(params.cliente){
            query = query.where { cliente.id == params.cliente}
        }

        return query.list(params)
    }

}
