package sx.compras


import grails.rest.*
import grails.converters.*

class DevolucionDeCompraController extends RestfulController {
    static responseFormats = ['json', 'xml']
    DevolucionDeCompraController() {
        super(DevolucionDeCompra)
    }
}
