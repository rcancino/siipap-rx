package sx.core

import grails.rest.RestfulController
import groovy.transform.ToString
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Secured("hasRole('ROLE_POS_USER')")
class VentaController extends RestfulController{

    static responseFormats = ['json']

    def ventaService

    VentaController(){
        super(Venta)
    }


    // def index(VentasFiltro filtro) {
    //     params.max = params.registros ?:10
    //     params.sort = params.sort ?:'lastUpdated'
    //     params.order = params.order ?:'desc'

    //     def query = Venta.where {}

    //     if(filtro.fechaInicial){
    //         Date inicio = filtro.fechaInicial
    //         Date fin = filtro.fechaFinal ?: inicio
    //         query = query.where {fecha >= inicio && fecha <= fin}
    //     }
    //     if (filtro.sucursal) {
    //         query = query.where { sucursal == filtro.sucursal}
    //     }
    //     if (filtro.cliente ) {
    //         query = query.where { cliente == filtro.cliente}
    //     }
    //     respond query.list(params)
    // }

    @Override
    protected List listAllResources(Map params) {
      params.sort = 'lastUpdated'
      params.order = 'desc'
      params.max = 100
      def query = Venta.where {}
      if(params.sucursal){
          query = query.where {sucursal.id ==  params.sucursal}   
      }
      if (params.facturables) {
        query = query.where {facturar !=  null  && cuentaPorCobrar == null}
        if(params.facturables == 'CRE'){
          query = query.where {tipo == params.facturables}
        }
      }
      if (params.facturados) {
        query = query.where {cuentaPorCobrar != null && tipo == params.facturados} 
      }
      def list = query.list(params)
      
      return list
    }

    @Transactional
    def mandarFacturar(Venta venta) {
        if (venta == null) {
            notFound()
            return
        }
        if (venta.facturar != null ){
            resond venta
            return
        }
        venta.facturar = new Date()
        saveResource venta
        respond venta
    }

  protected Venta saveResource(Venta resource) {
    // println 'Salvando venta' + resource
    resource.partidas.each {
        // println 'Partida con corte: ' + it.corte
        if(it.corte)
            it.corte.ventaDet = it;
    }
    def username = getPrincipal().username
    if(resource.id == null) {
        def serie = resource.sucursal.nombre + resource.tipo
        resource.documento = Folio.nextFolio('VENTAS',serie)
        resource.createUser = username
    }
    if(resource.cliente.rfc != 'XAXX010101000') resource.nombre = resource.cliente.nombre
    resource.updateUser = username
    return super.saveResource(resource)
  }

  protected Venta updateResource(Venta resource) {
    if(resource.cliente.rfc != 'XAXX010101000') resource.nombre = resource.cliente.nombre
    def username = getPrincipal().username
    resource.updateUser = username
    return super.updateResource(resource)
  }

  def pendientes(Sucursal sucursal) {
    if (sucursal == null) {
        notFound()
        return
    }
    params.max = params.registros ?:100
    params.sort = params.sort ?:'lastUpdated'
    params.order = params.order ?:'desc'
    def ventas = Venta.where{ sucursal == sucursal && facturar == null}.list(params)
    respond ventas
  }

  def findManiobra() {
    def clave = params.clave
    def found = Producto.where{ clave == clave}.find()
    if(found == null ){
      notFound()
      return
    }
    respond found
  }

  @Transactional
  def facturar(Venta pedido) {
    if(pedido == null ){
      notFound()
      return
    }
    assert !pedido.cuentaPorCobrar, 'Pedido ya facturado'
    pedido = ventaService.facturar(pedido);
    println 'Pedido facturado exitosamente: ' + pedido
    respond pedido
  }

  def cobradas(Sucursal sucursal) {
    if (sucursal == null) {
        notFound()
        return
    }
    params.max = params.registros ?:100
    params.sort = params.sort ?:'lastUpdated'
    params.order = params.order ?:'desc'
    
    def ventas = Venta.where{ sucursal == sucursal && cuentaPorCobrar != null}.list(params)
    // println 'Buscando facturas cobradas: ' + sucursal + ' Found: ' + ventas.size()
    respond ventas
  }
}

@ToString(includeNames=true,includePackage=false)
class VentasFiltro {

  Date fechaInicial
  Date fechaFinal
  Sucursal sucursal
  Cliente cliente
  int registros = 20


  static constraints = {
      fechaInicial nullable:true
      fechaFinal nullable: true
      sucursal nullable:true
      cliente nullable:true
      registros size:(1..500)
  }
}
