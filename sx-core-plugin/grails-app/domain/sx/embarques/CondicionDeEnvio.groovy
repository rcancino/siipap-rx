package sx.embarques

import sx.core.Direccion

class CondicionDeEnvio {

    String id

    Direccion direccion

    static constraints = {
    }

    static embedded = ['direccion']

    static  mapping={
        id generator:'uuid'
    }

}
