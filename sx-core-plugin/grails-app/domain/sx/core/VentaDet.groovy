package sx.core

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

class VentaDet {

	String	id

	Producto	producto

	Sucursal	sucursal

	Venta	venta

	Inventario	inventario

	BigDecimal	cantidad = 0

	BigDecimal	precioLista = 0

	BigDecimal	precioOriginal = 0

	BigDecimal	precio = 0

    BigDecimal	importe = 0

	BigDecimal	desctoOriginal = 0

	BigDecimal	descuento = 0

	BigDecimal	importeDescuento = 0

	BigDecimal	importeNeto = 0

	BigDecimal	subtotal = 0

	Boolean	nacional = true

	BigDecimal	kilos = 0

	String	comentario

	Boolean	conVale = false

	Boolean	cortado = false

    BigDecimal	importeCortes = 0

	BigDecimal devuelto

  BigDecimal enviado = 0

	String	sw2

    Date dateCreated

    Date lastUpdated


    static constraints = {
        sw2 nullable:true

		comentario nullable: true
        inventario nullable: true

    }

    static mapping = {
        id generator:'uuid'
        producto index: 'VENTADET_IDX2'
        devuelto formula:'(select COALESCE(sum(x.cantidad),0) from devolucion_de_venta_det x where x.venta_det_id=id)'
        enviado formula:'(select COALESCE(sum(abs(x.cantidad)),0) from envio_det x where x.venta_det_id=id)'
    }

    static belongsTo = [venta:Venta]

}
