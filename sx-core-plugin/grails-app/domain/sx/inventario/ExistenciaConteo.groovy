package sx.inventario

import sx.core.Existencia
import sx.core.Producto
import sx.core.Sucursal

class ExistenciaConteo {

    String id

    Existencia existencia

    Sucursal sucursal

    Producto producto

    Date	fecha

    BigDecimal	cantidad	 = 0

    BigDecimal	conteo

    BigDecimal	Diferencia	 = 0

    BigDecimal	ajuste	 = 0

    BigDecimal	existenciaFinal	 = 0

    String	sectores

    Date	fijado

    BigDecimal	existenciaOriginal	 = 0

    Boolean	conteoParcial	 = false

    
    static constraints = {
        fijado nullable: true
    }

    static  mapping ={
        id generator: 'uuid'
    }
}
