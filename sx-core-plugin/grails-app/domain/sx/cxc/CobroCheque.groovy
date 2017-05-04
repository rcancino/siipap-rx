package sx.cxc

import sx.tesoreria.Banco


class CobroCheque extends  Cobro{

    String id

    Banco bancoOrigen

    String numerDeCuenta

    String emisor

    Long numero = 0

    Boolean postFechado = false

    Boolean cambipoPorEfectivo = false

    Date vencimiento

    static constraints = {

        emisor nullable:true
        vencimiento nullable:true
    }

    static mapping={
        vencimiento type: 'date'
    }

    
}
