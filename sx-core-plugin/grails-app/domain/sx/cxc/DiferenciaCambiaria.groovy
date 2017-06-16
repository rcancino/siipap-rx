package sx.cxc

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(excludes = ["id,lastUpdated,dateCreated"],includeNames=true,includePackage=false)
@EqualsAndHashCode(includeFields = true,includes = ['id'])
class DiferenciaCambiaria {


    String	id

    CuentaPorCobrar	cuentaPorCobrar

    Cobro	cobro

    Long	anio

    Long	mes

    String	moneda

    Long	tipoDeCambio

    BigDecimal	Variacion

    Date dateCreated

    Date lastUpdated


    static mappin ={
        id generator: 'uuid'
    }

    static constraints = {
        cobro nullable: true
        cuentaPorCobrar nullable: true
    }
}
