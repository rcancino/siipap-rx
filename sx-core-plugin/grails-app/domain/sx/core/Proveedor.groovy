package sx.core

import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(excludes ='id,version,dateCreated,lastUpdated,sw2,direccion',includeNames=true,includePackage=false)
@EqualsAndHashCode(includes='id')
class Proveedor {

    String	id

    Boolean	activo	 = true

    String	rfc

    String	nombre

    String	tipo

    String  CuentaBancaria

    Long	sw2	 = 0

    String	calle

    String	exterior

    String	interior

    String	colonia

    String	cp

    String	municipio

    String	estado

    String	pais

	Date dateCreated

	Date lastUpdated

    static constraints = {
        rfc size:12..13
    	nombre unique: true
    	tipo inList:['COMPRAS','GASTOS']		
    	sw2 nullable: true

    }

    static embedded = ['direccion']

    static mapping={
    	id generator:'uuid'
    }


}
