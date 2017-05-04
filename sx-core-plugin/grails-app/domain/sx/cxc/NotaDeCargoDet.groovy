package sx.cxc

import sx.core.Venta

/**
 * Created by rcancino on 23/03/17.
 */
class NotaDeCargoDet {

    String id

    String concepto

    BigDecimal cargo = 0.0

    BigDecimal importe = 0.0

    Venta venta


    static constraints = {
        venta nullable:true
    }

    static belongsTo =[nota:NotaDeCargo]
}
