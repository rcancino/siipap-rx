package sx.cxc

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import sx.core.Sucursal

@ToString(excludes = ["id,version,lastUpdated,dateCreated"],includeNames=true,includePackage=false)
@EqualsAndHashCode(includeFields = true,includes = ['id'])
class AplicacionDeCobro {

    String	id

    Cobro	cobro

    NotaDeCredito	notaDeCredito

    CuentaPorCobrar	cuentaPorCobrar

    Date	fecha

    BigDecimal	importe	 = 0

    String	sw2

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser

    static constraints = {
        sw2 nullable: true
        cobro nullable: true
        notaDeCredito nullable: true
        createUser nullable: true
        updateUser nullable: true
    }

    static mapping = {
        id generator:'uuid'
        fecha type: 'date'
    }

    static belongsTo = [cobro: Cobro]
}


