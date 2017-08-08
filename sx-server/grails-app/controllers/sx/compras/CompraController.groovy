package sx.compras

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController
import grails.transaction.Transactional
import grails.web.http.HttpHeaders
import sx.core.Folio

import static org.springframework.http.HttpStatus.CREATED

@Secured("IS_AUTHENTICATED_ANONYMOUSLY")
class CompraController extends RestfulController{


    static responseFormats = ['json']

    CompraController(){
        super(Compra)
    }

    @Override
    protected List listAllResources(Map params) {
        def query = Compra.where {}
        
        if(params.pendientes){
            query = query.where {pendiente == true}
        }
        return query.list(params)
    }

    @Override
    protected Integer countResources() {
        return super.countResources()
    }

    @Override
    protected Object saveResource(Compra compraInstance) {
        compraInstance.folio = Folio.nextFolio('COMPRA',ser)
        compraInstance.save flush: true
    }

}
