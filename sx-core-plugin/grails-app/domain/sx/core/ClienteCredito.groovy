package sx.core

class ClienteCredito {

    String	id

    // Cliente cliente

    Boolean	creditoActivo	 = true

    BigDecimal	descuentoFijo	 = 0

    BigDecimal	lineaDeCredito	 = 0

    Long	plazo	 = 1

    Boolean	venceFactura	 = true

    Long	diaRevision	 = 0

    Long	diaCobro	 = 0

    Boolean	revision	 = true

    BigDecimal	saldo	 = 0

    Long	atrasoMaximo	 = 0

    Boolean	postfechado	 = false

    Long	operador	 = 0

    Cobrador	cobrador

    Socio	socio

    Long	sw2


    static constraints = {
        cobrador nullable:true
        socio nullable: true
        sw2 nullable: true
    }

    static belongsTo = [cliente: Cliente]

    static mapping= {
        id generator: 'uuid'
    }
}
