package sx.logistica

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

    Boolean parcial = false

    Date asignado

    Direccion direccion

    String zona
    String municipio
    String grupo
    

    static constraints = {
        asignado nullable: true
        zona nullable: true, maxSize:20
        municipio nullable: true, maxSize: 100
        grupo nullable: true, maxSize:10

    }

    static embedded = ['direccion']

    static  mapping={
        id generator:'uuid'
    }

}
