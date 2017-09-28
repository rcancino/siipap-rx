package sx.compras


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_INVENTARIO_USER")
class DevolucionDeCompraController extends RestfulController {

    static responseFormats = ['json']

    DevolucionDeCompraController() {
        super(DevolucionDeCompra)
    }


}
