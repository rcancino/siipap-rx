package sx.cxc

import sx.core.Cliente
import sx.core.Sucursal

class DevolucionCliente {

    String	id

    Cliente cliente

    Sucursal sucursal

    Long	documento	 = 0

    BigDecimal	importe	 = 0

    BigDecimal	impuesto	 = 0

    BigDecimal	total	 = 0

    String	formaDePago

    Currency moneda = Currency.getInstance('MXN')

    BigDecimal	tipoDeCambio	 = 1

    String	comentario

    CuentaPorCobrar cuenta

    String	sw2

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser




    static constraints = {
        tipoDeCambio(scale:6)
        comentario nullable:true
        sw2 nullable:true
        cuenta nullable: true
    }


    static mapping = {
        id generator:'uuid'
        cliente index: 'DEVOLUCION_IDX3'
    }
}
