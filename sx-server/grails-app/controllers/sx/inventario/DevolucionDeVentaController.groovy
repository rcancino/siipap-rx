package sx.inventario


import grails.rest.*
import grails.converters.*

class DevolucionDeVentaController extends RestfulController {

    static responseFormats = ['json', 'xml']
    DevolucionDeVentaController() {
        super(DevolucionDeVenta)
    }


}
