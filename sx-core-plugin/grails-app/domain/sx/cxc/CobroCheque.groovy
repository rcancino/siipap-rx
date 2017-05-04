package sx.cxc

import sx.tesoreria.Banco
import sx.tesoreria.Ficha


class CobroCheque {

    String id

    Banco bancoOrigen

    String numerDeCuenta

    String emisor

    Long numero = 0

    Boolean postFechado = false

    Boolean cambipoPorEfectivo = false

    Date vencimiento

    Ficha ficha

    static belongsTo = [cobro: Cobro]

    static constraints = {
        emisor nullable:true
        vencimiento nullable:true
        ficha nullable:true

    }

    static mapping={
        vencimiento type: 'date'
    }

    
}
