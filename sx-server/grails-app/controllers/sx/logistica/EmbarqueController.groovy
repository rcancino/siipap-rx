package sx.logistica

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import sx.core.Folio
import sx.core.Sucursal
import sx.core.Venta
import grails.transaction.Transactional



@Secured("ROLE_INVENTARIO_USER")
class EmbarqueController extends RestfulController {
    
    static responseFormats = ['json']

    
    def reporteService

    EmbarqueController() {
        super(Embarque)
    }

    @Override
    protected List listAllResources(Map params) {
        params.sort = 'documento'
        params.order = 'desc'
        params.max = 500
        def query = Embarque.where {}
        if(params.sucursal){
            query = query.where {sucursal.id ==  params.sucursal}   
        }
        if(params.documento) {
            def documento = params.int('documento')
            query = query.where {documento >=  documento}
        }
        if(params.transito) {
            query = query.where{regreso == null && salida != null}
        }
        return query.list(params)
    }

    protected Embarque saveResource(Embarque resource) {
        def username = getPrincipal().username
        if(resource.id == null) {
            def serie = resource.sucursal.clave
            resource.documento = Folio.nextFolio('EMBARQUES',serie)
            resource.createUser = username
        }
        resource.updateUser = username
        return super.saveResource(resource)
    }

    protected Embarque updateResource(Embarque resource) {
        // Actualizar la condicion asignado
        /*
        resources.partidas.each { it ->
            condicion = CondicionDeEnvio.where{venta.id == it.origen}.find()
            if(condicion) {
                def venta = it.venta
                def pendiente = venta.partidas.sum {det -> (det.cantidad.abs() - det.enviado)}
                if(pendiente <= 0) {
                    condicion.asignado = resource.fecha    
                }
                
            } 
            condicion.save()
        }
        */
        resource.updateUser = getPrincipal().username
        return super.updateResource(resource)
    }

    public buscarDocumento(DocumentSearchCommand command){
        println 'Buscando documento con: ' + params
        println 'Buscando documento con: ' + command
        command.validate()
        if (command.hasErrors()) {
            respond command.errors, view:'create' // STATUS CODE 422
            return
        }
        
        def q = CondicionDeEnvio.where{
            venta.sucursal == command.sucursal && venta.documento == command.documento && venta.fecha == command.fecha
        }
        CondicionDeEnvio res = q.find()
        if (res == null) {
            notFound()
            return
        }
        // println 'Condicion encontrada: ' + res.venta
        def venta = res.venta
        // determinando si la venta ya tiene envios
        def isParcial = venta.partidas.find { it.enviado} ? true : false
        println 'El envio debe ser parcial: ' + isParcial
        def envio = new Envio()
        envio.cliente = venta.cliente
        envio.tipoDocumento = venta.tipo
        envio.origen = venta.id
        envio.entidad = 'VENTA'
        envio.documento = venta.documento
        envio.fechaDocumento = venta.fecha
        envio.totalDocumento = venta.total
        envio.formaPago = venta.formaDePago
        envio.nombre = venta.cliente.nombre
        envio.kilos = venta.kilos
        envio.parcial = isParcial
        respond envio, status: 200
    }

    public buscarVenta(DocumentSearchCommand command){
        command.validate()
        if (command.hasErrors()) {
            respond command.errors, view:'create' // STATUS CODE 422
            return
        }
        
        def q = CondicionDeEnvio.where{
            venta.sucursal == command.sucursal && venta.documento == command.documento && venta.fecha == command.fecha
        }
        CondicionDeEnvio res = q.find()
        if (res == null) {
            notFound()
            return
        }
        respond res.venta, status: 200
    }

    public buscarPartidasDeVenta(DocumentSearchCommand command){
        command.validate()
        if (command.hasErrors()) {
            respond command.errors, view:'create' // STATUS CODE 422
            return
        }
        
        def q = CondicionDeEnvio.where{
            venta.sucursal == command.sucursal && venta.documento == command.documento && venta.fecha == command.fecha
        }
        CondicionDeEnvio res = q.find()
        if (res == null) {
            notFound()
            return
        }
        respond res.venta.partidas, status: 200
    }


    @Transactional
    def registrarSalida(Embarque res) {
        if (res == null) {
            notFound()
            return
        }
        res.salida = new Date()
        res.save()
        respond res
    }

    @Transactional
    def registrarRegreso(Embarque res) {
        if (res == null) {
            notFound()
            return
        }
        def found = res.partidas.find { it.recepcion == null}
        if(found ) {
            respond([message: 'Faltan envios por recibir no se puede marcar regreso'], status: 422)
            return
        }
        res.regreso = new Date()
        res.save()
        respond res
    }

    def print() {
        // println 'Generando impresion para trs: '+ params
        def pdf = this.reporteService.run('AsignacionDeEnvio', params)
        def fileName = "AsignacionDeEnvio.pdf"
        render (file: pdf.toByteArray(), contentType: 'application/pdf', filename: fileName)
    }

    def reporteDeEntregasPorChofer() {
        println 'Ejecutando reporte: ' + params;
        def pdf = this.reporteService.run('EntregaPorChofer', params)
        def fileName = "EntregaPorChofer.pdf"
        render (file: pdf.toByteArray(), contentType: 'application/pdf', filename: fileName)
    }

    def documentosEnTransito() {
        def envios = Envio.where{ embarque.regreso ==null && embarque.salida != null}.list()
        println 'Envios pendientes: ' + envios
        respond envios
    }


    def enviosPendientes() {
        def q = CondicionDeEnvio.where{
            asignado == null
        }
        def  list = q.find().list()
        respond list 
    }

}

class DocumentSearchCommand {
    String tipo
    Date fecha
    Sucursal sucursal
    Long documento

    String toString(){
        "Tipo:$tipo Docto:$documento Fecha:${fecha.format('dd/MM/yyyy')} Sucursal:$sucursal"
    }
}