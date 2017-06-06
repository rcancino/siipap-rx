package sx.core

class Existencia {

    String	id

    Sucursal	sucursal

    Producto	producto

    Long	anio	 = 0

    Long	mes	 = 0

    Boolean	nacional	 = true

    BigDecimal	kilos	 = 0

    BigDecimal	pedidosPendiente	 = 0

    BigDecimal	entradaCompra	 = 0

    BigDecimal	devolucionCompra	 = 0

    BigDecimal	venta	 = 0

    BigDecimal	devolucionVenta	 = 0

    BigDecimal	movimientoAlmacen	 = 0

    BigDecimal	traslado	 = 0

    BigDecimal	transformacion	 = 0

    BigDecimal	cantidad	 = 0

    BigDecimal	recorte	 = 0

    String	recorteComentario

    Date	recorteFecha

    String sw2


    static constraints = {

        recorteComentario nullable: true
        recorteFecha nullable:  true
        pedidosPendiente nullable: true
        entradaCompra nullable: true
        devolucionCompra nullable: true
        venta nullable: true
        devolucionVenta nullable: true
        movimientoAlmacen nullable: true
        traslado nullable: true
        transformacion nullable: true
        recorte nullable: true
        sw2 nullable: true
    }

    static mapping={
        id generator:'uuid'
        sucursal index: 'SUCURSAL_IDX'
        anio index: 'YEAR_IDX'
        mes index: 'MES_IDX'

    }
}
