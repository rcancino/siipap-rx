package sx.core

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

class VentaDet {

	String	id

	Producto	producto

	Sucursal	sucursal

	Venta	venta

	Inventario	inventario

	Long	documento

	Date	fecha

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

	String	sw2

    Date dateCreated

    Date lastUpdated

    String updateUser

    String createUser

    static constraints = {
        sw2 nullable:true
        createUser nullable: true
        updateUser nullable: true
		comentario nullable: true
        inventario nullable: true

    }

    static mapping = {
        id generator:'uuid'
        fecha index: 'VENTADET_IDX1'
        producto index: 'VENTADET_IDX2'
    }

    static belongsTo = [venta:Venta]

}
