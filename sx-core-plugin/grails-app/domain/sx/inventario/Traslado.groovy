package sx.inventario

import sx.core.Inventario
import sx.core.Sucursal
import sx.embarques.Chofer

class Traslado {

    String	id

    SolicitudDeTraslado	solicitudDeTraslado

    Inventario inventario

    Sucursal sucursal

    Chofer chofer

    String	tipo

    Long	Documento = 0

    Date	fecha

    Boolean	porInventario = false

    String	clasificacionVale

    String	comentario

    List partidas =[]

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser

    String sw2

    static hasMany = [partidas:TrasladoDet]

    static constraints = {
        sw2 nullable:true
        chofer nullable:true
        tipo nullable: true
        clasificacionVale nullable: true
        comentario nullable: true
        inventario nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
        createUser nullable: true
        updateUser nullable: true
        porInventario nullable: true
    }

    static mapping = {
        id generator:'uuid'
        sucursal index:'SUCURSAL_IDX'
        fecha index: 'FECHA_IDX'

    }
}