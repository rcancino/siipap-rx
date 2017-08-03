package sx.embarques

import sx.core.Venta
import sx.logistica.Envio

class EnvioComision {

    String	id

    Envio envio

    Venta venta

    BigDecimal	valor	 = 0

    Date	fecha_comision

    String	comentario_de_comision

    BigDecimal	comision_por_tonelada	 = 0

    BigDecimal	importe_comision	 = 0


    static constraints = {
        fecha_comision nullable:true
        comentario_de_comision nullable: true
    }

    static  mapping = {
        id generator:'uuid'
    }
}
