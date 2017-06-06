package sx.compras

import sx.core.Inventario
import sx.core.Producto
import sx.core.Sucursal

class RecepcionDeCompraDet {

    String id

    Inventario inventario

    RecepcionDeCompra recepcionDeCompra

    CompraDet compraDet

    Producto producto

    BigDecimal cantidad = 0

    BigDecimal kilos = 0

    String comentario

    String sw2

    Date dateCreated

    Date lastUpdated


    static constraints = {
        sw2 nullable:true
        comentario nullable: true
        inventario nullable: true
    }

    static mapping = {
        id generator:'uuid'

    }

    static belongsTo = [recepcion:RecepcionDeCompra]
}
