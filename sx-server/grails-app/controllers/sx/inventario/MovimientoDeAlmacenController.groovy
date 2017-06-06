package sx.inventario


import grails.rest.*
import grails.converters.*

class MovimientoDeAlmacenController extends RestfulController {
    static responseFormats = ['json', 'xml']
    MovimientoDeAlmacenController() {
        super(MovimientoDeAlmacen)
    }
}
