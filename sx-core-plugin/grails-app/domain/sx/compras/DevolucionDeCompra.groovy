package sx.compras

import sx.core.Proveedor
import sx.core.Sucursal
import sx.cxp.NotaCxP

class DevolucionDeCompra {


    String	id

    Sucursal sucursal

    Proveedor proveedor

    NotaCxP notaCxp

    Long	documento = 0

    Date	fecha

    String	referencia

    Date	fechaReferencia

    String	comentario

    List partidas = []

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser

    String sw2

    static hasMany = [partidas:DevolucionDeCompraDet]

    static constraints = {

        notaCxp nullable: true
        referencia nullable: true
        fechaReferencia nullable: true
        comentario nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
        createUser nullable: true
        updateUser nullable: true
        sw2 nullable: true
    }

    static  mapping ={
        id generator: 'uuid'
        sucursal index: 'SUCURSAL_IDX'
        proveedor index: 'PROVEEDOR_ID'
        fecha index: 'FECHA_IDX'
    }
}
