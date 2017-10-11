package sx.logistica

import sx.embarques.Chofer

class Embarque {


    String	id

    Date	cerrado

    Chofer	chofer

    String	comentario

    Integer	documento	 = 0

    Date	fecha

    BigDecimal	kilos	 = 0

    Date	regreso

    Date	salida

    String	sucursal

    BigDecimal	valor	 = 0

    List partidas = []

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser


    static hasMany = [partidas : Envio ]

    static constraints = {
        cerrado  nullable: true
        chofer nullable: true
        comentario nullable: true
        documento nullable: true
        regreso nullable: true
        salida nullable: true
    }

    static mapping= {
        id generator: 'uuid'
        partidas cascade: "all-delete-orphan"
    }
}
