package sx.compras

import grails.rest.RestfulController
import grails.transaction.Transactional
import grails.web.http.HttpHeaders
import sx.core.Folio

import static org.springframework.http.HttpStatus.CREATED

class CompraController extends RestfulController{


    static responseFormats = ['json']

    CompraController(){
        super(Compra)
    }

     @Override
    protected List listAllResources(Map params) {
        params.max=500
        def query = Compra.where {}
        
        if(params.pendientes){
            query = query.where {pendiente == true}
        }
        return query.list(params)
    }

    @Transactional
    def save(Compra compraInstance) {
        compraInstance.folio = Folio.nextFolio('COMPRA',ser)
        compraInstance.validate()
        if (compraInstance.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond compraInstance.errors, view:'create' // STATUS CODE 422
            return
        }

        saveResource compraInstance

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [classMessageArg, compraInstance.id])
                redirect compraInstance
            }
            '*' {
                response.addHeader(HttpHeaders.LOCATION,
                        grailsLinkGenerator.link( resource: this.controllerName, action: 'show',id: compraInstance.id, absolute: true,
                                namespace: hasProperty('namespace') ? this.namespace : null ))
                respond compraInstance, [status: CREATED, view:'show']
            }
        }
    }
}
