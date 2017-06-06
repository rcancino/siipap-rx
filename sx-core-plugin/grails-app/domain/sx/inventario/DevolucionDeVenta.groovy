package sx.inventario

import sx.core.Sucursal
import sx.core.Venta

class DevolucionDeVenta {

    String	id

    Venta venta

    Long	documento	 = 0

    Date	fecha

    Sucursal sucursal

    BigDecimal	importe	 = 0

    BigDecimal	impuesto	 = 0

    BigDecimal	total	 = 0

    BigDecimal	importeCortes	 = 0

    String	comentario

    List partidas =[]

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser

    String sw2


    static  hasMany = [partidas:DevolucionDeVentaDet]


    static constraints = {
        comentario nullable: true
        sw2 nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
        createUser nullable: true
        updateUser nullable: true
    }

    static  mapping ={
        id generator:'uuid'
        sucursal index: 'SUCURSAL_IDX'
        fecha index: 'FECHA_IDX'
    }
}
