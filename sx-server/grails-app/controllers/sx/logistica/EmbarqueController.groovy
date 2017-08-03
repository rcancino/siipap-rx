package sx.logistica


import grails.rest.*
import grails.converters.*

class EmbarqueController extends RestfulController {
    static responseFormats = ['json', 'xml']
    EmbarqueController() {
        super(Embarque)

    }

    @Override
    Object index() {
        println "Accesando al embarque"
    }
/*
    @Override
    protected List listAllResources(Map params) {
        return super.listAllResources(params)
    }
    */
}
