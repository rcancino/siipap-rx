package sx.core


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured


// @Secured("ROLE_INVENTARIO_USER")
@Secured("IS_AUTHENTICATED_ANONYMOUSLY")
class ExistenciaController extends RestfulController {

    static responseFormats = ['json']

    ExistenciaController() {
        super(Existencia)
    }

    def existenciasPorSucursal(ExistenciaFilter filter) {
        println 'Buscando existencias....' + filter
        println 'Params: ' + params
        params.max = params.max ?: 20
        def query = Existencia.where { }
        if(filter.sucursal) {
            query = Existencia.where { sucursal == filter.sucursal}
        }

        if(filter.ejercicio) {
            query = query.where { anio == filter.ejercicio}
        }
        if(filter.mes ) {
            query = query.where { mes == filter.mes}
        }

        if(filtro.producto) {
            def search = '%' + params.prducto + '%'
            query = query.where { producto.clave =~ search || producto.descripcion =~ search}
        }
    }


    @Override
    protected List listAllResources(Map params) {

        // println 'Buscando existencias: ' + params
        params.max = params.max ?: 20
        // ExistenciaFilter filter = new ExistenciaFilter()
        // bindData(filter, params)
        // println 'Filtro: ' + filter

        def query = Existencia.where {}
        if( params.ejercicio) {
            query = query.where { anio == params.int('ejercicio')}
        }
        if( params.int('mes')) {
            query = query.where { mes == params.int('mes')}
        }
        if (params.activos) {
            query = query.where { producto.activo == true}
        }
        if(params.conexistencia) {
            query = query.where { cantidad > 0}
        }
        if(params.term) {
            def search = '%' + params.term + '%'
            query = query.where { producto.clave =~ search || producto.descripcion =~ search}
        }

        if(params.sucursal) {
            query = query.where { sucursal.id == params.sucursal }
        }
        return query.list(params)
    }
}

class ExistenciaFilter {
    Sucursal sucursal
    Integer ejercicio
    Integer mes
    String producto = '%'

    ExistenciaFilter() {
        Date today= new Date();
        //Calendar.getAt(Calendar.YEAR)
        //this.mes = today[Calendar.MONTH]
    }

    static constraints = {
        sucursal nullable: true
        mes nullable: true
        ejercicio nullable: true
    }

    String toString(){
        "$sucursal $ejercicio $mes"
    }
}
