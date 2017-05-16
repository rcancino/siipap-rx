package sx.core

import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(excludes = 'version,dateCreated,lastUpdated,id',includeNames=true,includePackage=false)
@EqualsAndHashCode(includes='nombre,rfc')
class Cliente {

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


	static hasOne=[clienteCredito:ClienteCredito]

	//static hasMany=[contactos:Contacto,telefonos:Telefono,cfdiMails:CfdiMail,direccionDeEntrega:DireccionDeEntrega,direcciones:Direccion]

	static constraints = {

		rfc maxSize:13
		sw2 nullable:true
		vendedor nullable:true
		calle nullable: true
		exterior nullable: true
		interior nullable: true
		colonia nullable:  true
		municipio nullable: true
		estado nullable: true
		pais nullable: true
		dateCreated nullable:true
		lastUpdated nullable:true
        sucursal nullable: true

	}

	static mapping={
		id generator:'uuid'
		//rfcCliente composite: ['rfc', 'grupoRfc'], unique: true
		//contactos cascade:"all-delete-orphan"
		//telefonos cascade:"all-delete-orphan"
		//cfdiMails cascade:"all-delete-orphan"
		//direcciones cascade:"all-delete-orphan"
		//clienteCredito cascade:"all-delete-orphan"
	}
}
