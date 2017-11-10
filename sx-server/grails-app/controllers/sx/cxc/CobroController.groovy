package sx.cxc

import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import sx.core.Venta

@Secured("hasRole('ROLE_CXC_USER')")
class CobroController extends RestfulController{

    def cobroService

    def ventaService

    static responseFormats = ['json']

    CobroController() {
        super(Cobro)
    }

    @Override
    protected List listAllResources(Map params) {
        def query = Cobro.where {}
        params.max = 200
        params.sort = params.sort ?:'lastUpdated'
        params.order = params.order ?:'desc'
        return query.list(params)
    }

    protected Cobro saveResource(Cobro resource) {
        println 'Salvando cobro: ' + resource
        def username = getPrincipal().username
        if(resource.id == null) {
            def serie = resource.sucursal.clave
            resource.createUser = username
        }
        resource.updateUser = username
        resource.aplicaciones.each {
            it.createUser = username
            it.updateUser = username
        }
        return super.saveResource(resource)
    }

    @Transactional
    def cobroContado(CobroContado res) {
        if (res == null) {
            notFound()
            return
        }
        def venta = res.venta
        if(venta.cuentaPorCobrar == null) {
            venta = ventaService.generarCuentaPorCobrar(res.venta)
        }
        def cxc  = venta.cuentaPorCobrar
        if(cxc.saldo > 0 )
            cxc = cobroService.generarCobroDeContado(cxc, res.cobros)
        respond res.venta
    }

}

public class CobroContado {

    Venta venta
    List<Cobro> cobros
}
