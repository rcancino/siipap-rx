package sx.core

class Inventario {


    String	id

    Sucursal	sucursal

    Producto	producto

    Date	Fecha

    Long	documento	 = 0

    String	tipo

    String tipoVenta

    BigDecimal	cantidad	 = 0

    BigDecimal	kilos	 = 0

    Boolean	nacional	 = true

    BigDecimal	costo	 = 0

    BigDecimal	costoPromedio	 = 0

    BigDecimal	costoUltimaCompra	 = 0

    BigDecimal	costoReposicion	 = 0

    String	comentario

    String sw2


    static constraints = {
        tipo nullable: true
        comentario nullable: true
        sw2 nullable: true
        tipoVenta nullable: true

    }

    static mapping ={
        id generator:'uuid'
        producto index:'PRODUCTO_IDX'
        sucursal index:'SUCURSAL_IDX'
        fecha index: 'FECHA_IDX'
    }
}