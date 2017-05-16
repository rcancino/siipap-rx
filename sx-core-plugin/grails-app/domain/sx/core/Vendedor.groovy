package sx.core

import groovy.transform.EqualsAndHashCode


@EqualsAndHashCode(includes='id')
class Vendedor {

    String	id

    Boolean	activo	 = true

    String	apellido_paterno

    String	apellido_materno

    String	nombres

    String	rfc

    String	curp

    BigDecimal	comision_contado	 = 0

    BigDecimal	comision_credito	 = 0

    Long	sw2	 = 0


    static constraints = {
        sw2 nullable:true
        activo nullable:true
        apellidoPaterno nullable:true
        apellidoMaterno nullable:true
        nombres nullable:true
        curp nullable:true
        rfc nullable:true
    }

    static mapping={
        id generator:'uuid'
    }

    String toString() {
    	return "$nombres $apellidoPaterno"
    }
}
