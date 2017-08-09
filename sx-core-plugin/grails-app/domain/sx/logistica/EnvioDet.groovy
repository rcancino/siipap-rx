package sx.logistica

import sx.core.Producto
import sx.core.VentaDet

class EnvioDet {


    String	id

    Envio	envio

    VentaDet ventaDet

    VentaParcialDet	parcialDet	 = null

    Producto producto

    BigDecimal	cantidad	 = 0

    BigDecimal	valor	 = 0

    String	instruccionDeEntregaParcial

    Long	partidasIdx	 = 0


    static  mapping ={
        id generator:'uuid'
    }

    static constraints = {
        instruccionDeEntregaParcial nullable: true
    }
}
