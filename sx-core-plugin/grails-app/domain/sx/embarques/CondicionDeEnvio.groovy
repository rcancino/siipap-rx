package sx.embarques

import sx.core.Direccion
import sx.core.DireccionEntrega
import sx.core.Venta

class CondicionDeEnvio {

    String id

    Venta	venta

    String	condiciones

    Boolean	ocurre	 = false

    Boolean	recoleccion	 = false

    Boolean	asegurado	 = false

    Date	fecha_de_entrega

    String	comentario

    BigDecimal	latitud	 = 0

    BigDecimal	longitud	 = 0


    Direccion direccion

    static constraints = {
    }

    static embedded = ['direccion']

    static  mapping={
        id generator:'uuid'
    }

}
