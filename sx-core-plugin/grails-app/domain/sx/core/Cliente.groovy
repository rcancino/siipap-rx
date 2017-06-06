package sx.core

import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(excludes = 'version,dateCreated,lastUpdated,id',includeNames=true,includePackage=false)
@EqualsAndHashCode(includes='nombre,rfc')
class Cliente {

    static  auditable=true

	String	id

	Boolean	activo	 = true

	String	rfc

	String	nombre

	Boolean	permiteCheque	 = false

	BigDecimal	chequeDevuelto	 = 0

	Boolean	juridico	 = false

	Long	folioRFC	 = 1

	Long	formaDePago	 = 1

	Long	sw2

	Sucursal	sucursal

	Vendedor	vendedor

    Direccion direccion

	Date dateCreated

	Date lastUpdated


	static constraints = {

		rfc maxSize:13
		sw2 nullable:true
		vendedor nullable:true
		dateCreated nullable:true
		lastUpdated nullable:true
        sucursal nullable: true
        direccion nullable: true


	}

    static embedded = ['direccion']

	static mapping={
		id generator:'uuid'
		
	}
}
