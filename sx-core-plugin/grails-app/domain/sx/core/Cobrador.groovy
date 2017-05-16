package sx.core

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includes='id')
class Cobrador {

    String	id

    Boolean	activo

    String	apellido_paterno

    String	apellido_materno

    String	rfc

    String	curp

    BigDecimal	comision

    Long	sw2


    Date dateCreated

    Date lastUpdated

    static  hasMany=[clienteCredito : ClienteCredito]


    static constraints = {
        sw2 nullable:true
        clave nullable:true
        apellidoMaterno nullable:true
        apellidoPaterno nullable:true
        nombres nullable:true
        curp nullable:true
        rfc nullable:true
        comision nullable:true
        dateCreated nullable:true
        lastUpdated nullable:true
    }

    static mapping ={
        id generator:'uuid'
    }

    String toString() {
    	return "$nombres $apellidoPaterno"
    }
}


