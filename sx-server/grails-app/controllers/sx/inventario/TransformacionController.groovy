package sx.inventario


import grails.rest.*
import grails.converters.*

class TransformacionController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TransformacionController() {
        super(Transformacion)
    }

    def index(Integer max){

        params.max = Math.min(max ?: 10, 100)
        def query  = Transformacion.where {}

        respond query.list(params)

    }
}
