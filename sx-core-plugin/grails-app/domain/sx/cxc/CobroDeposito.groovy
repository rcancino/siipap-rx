package sx.cxc

import sx.tesoreria.Banco
import sx.tesoreria.CuentaDeBanco
import sx.tesoreria.MovimientoDeCuenta

class CobroDeposito {

    Banco bancoOrigen

    CuentaDeBanco cuentaDestino

    Boolean conciliado = false

    Long folio = 0

    Date fechaDeposito
    
    BigDecimal totalCheque = 0.0

    BigDecimal totalEfectivo = 0.0

    BigDecimal totalTarjeta = 0.0

    MovimientoDeCuenta ingreso

    static belongsTo = [cobro: Cobro]

    static constraints = {
        ingreso nullable:true
    }

    static mapping={
        fechaDeposito type:'date' ,index: 'COBRO_TRANS_IDX1'

    }
}
