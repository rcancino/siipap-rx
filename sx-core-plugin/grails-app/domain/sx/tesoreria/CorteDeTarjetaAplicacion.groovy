package sx.tesoreria

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import sx.tesoreria.MovimientoDeCuenta
import sx.core.Sucursal

@ToString(includes = ['sucursal,importe'],includeNames=true,includePackage=false)
@EqualsAndHashCode(includeFields = true,includes = ['id','orden'])
class CorteDeTarjetaAplicacion {

	String id

	MovimientoDeCuenta ingreso

	TipoDeAplicacion tipo

	BigDecimal importe = 0.0
	
	String comentario
	
	int orden = 0

	Boolean	debitoCredito	 = true


	Boolean	visaMaster	 = true

	String	sw2

	CorteDeTarjeta corte

	static belongsTo = [corte: CorteDeTarjeta]


    static constraints = {
    	comentario nullable:true
    }

	static mapping = {
		id generator: 'uuid'
	}
}

enum TipoDeAplicacion {
	
	INGRESO,COMISION_CREDITO,COMISION_DEBITO,COMISION_AMEX,IMPUESTO

}
