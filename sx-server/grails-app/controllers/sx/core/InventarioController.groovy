package sx.core


import grails.rest.*
import grails.converters.*

class InventarioController extends RestfulController {

    static responseFormats = ['json', 'xml']
    InventarioController() {
        super(Inventario)
    }
}
