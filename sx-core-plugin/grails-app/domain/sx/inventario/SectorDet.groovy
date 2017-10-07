package sx.inventario

import sx.core.Producto

class SectorDet {

    String id

    Producto producto

    Sector	sector

    BigDecimal	cantidad	 = 0

    String	comentario

    Long	indice	 = 0


    static constraints = {
        comentario nullable: true
    }


    static mapping = {
        id generator:'uuid'
    }
}
