package sx.compras

import sx.core.Producto
import sx.core.Sucursal

class RecepcionDeCompraDet {

    String id

    CompraDet compraDet

    Producto producto

    BigDecimal cantidad

    BigDecimal kilos = 0.0

    String comentario

    String sw2

    Date dateCreated
    Date lastUpdated

    static constraints = {
        sw2 nullable:true
        comentario nullable: true
    }

    static mapping = {
        id generator:'uuid'

    }

    static belongsTo = [recepcion:RecepcionDeCompra]
}
