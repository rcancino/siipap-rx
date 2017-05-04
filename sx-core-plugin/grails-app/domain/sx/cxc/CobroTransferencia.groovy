package sx.cxc

import sx.tesoreria.Banco
import sx.tesoreria.CuentaDeBanco
import sx.tesoreria.MovimientoDeCuenta

class CobroTransferencia extends Cobro{

    Banco bancoOrigen

    CuentaDeBanco cuentaDestino

    Boolean conciliado = false

    Long folio = 0

    Date fechaDeposito

    MovimientoDeCuenta ingreso

    static constraints = {
        ingreso nullable:true
    }


    static mapping={
        fechaDeposito type:'date' ,index: 'COBRO_TRANS_IDX1'

    }
}
