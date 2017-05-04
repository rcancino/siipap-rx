package sx.compras

import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode
import sx.core.*
import sx.cxc.NotaDeCreditoDet


@ToString(excludes = 'dateCreated,lastUpdated,version,partidas',includeNames=true,includePackage=false)
@EqualsAndHashCode(includes='serie,folio')
class Compra {

	String id

    String tipo

	Proveedor proveedor

    Sucursal sucursal

    String serie                   /******** ? *****/

	Long folio

    Date fecha

    Date entrega

	String comentario

	Date depuracion

    Date cierre

	BigDecimal importeBruto = 0.0

	BigDecimal importeNeto = 0.0

	BigDecimal importeDescuento = 0.0
    
	BigDecimal impuestos = 0.0

	BigDecimal total = 0.0

    Currency moneda = Currency.getInstance('MXN')

	BigDecimal tipoDeCambio = 1.0

	Boolean especial= false

    Boolean consolidada = false

    Boolean importacion = false

    List partidas  = []

    String sw2

	Date dateCreated

	Date lastUpdated

    static constraints = {
        tipo inList:['NACIONAL','IMPORTADO']
    	comentario nullable:true
    	depuracion nullable:true
        cierre nullable:true
    	entrega nullable:true
        folio unique:'serie'
        sw2 nullable:true

    }

    static hasMany =[partidas:CompraDet]

    static mapping = {
    	id generator:'uuid'
        partidas cascade: "all-delete-orphan"
        fecha type:'date', index: 'COMPRA_IDX1'
        entrega type:'date'
        folio index: 'COMPRA_IDX2'
        serie index: 'COMPRA_IDX2'
    }

}
