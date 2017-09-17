package sx.tesoreria


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

@Secured("ROLE_TESORERIA_USER")
class CuentaDeBancoController extends RestfulController {

    static responseFormats = ['xml']

    CuentaDeBancoController() {
        super(CuentaDeBanco)
    }
}
