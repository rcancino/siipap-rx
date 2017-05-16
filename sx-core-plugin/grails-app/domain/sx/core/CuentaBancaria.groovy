package sx.core

class CuentaBancaria {

    String	id

    Boolean	activo	 = true

    String	cuentaHabiente

    String	numeroDeCuenta

    String	pagoReferenciado

    Long	sw2	 = 0

    static constraints = {
        pagoReferenciado nullable:true
    }

    static mapping ={
        id generator:'uuid'
    }
}
