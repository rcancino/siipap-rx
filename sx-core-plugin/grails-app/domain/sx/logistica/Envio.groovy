package sx.logistica

import sx.core.Cliente

class Envio {

    String	id

    Embarque	embarque

    Cliente cliente

    String	origen

    String	entidad

    BigDecimal	por_cobrar	 = 0

    Integer	paquetes	 = 0

    BigDecimal	kilos	 = 0

    Boolean	parcial	 = false

    BigDecimal	comision	 = 0

    BigDecimal	valor	 = 0

    Date	arribo

    Date	recepcion

    String	recibio

    String	comentario

    String	documento

    Date	fecha_de_documento

    BigDecimal	total_documento	 = 0

    String	nombre

    String	tipo_de_documento

    BigDecimal	arriboLatitud	 = 0

    BigDecimal	arriboLongitud	 = 0

    BigDecimal	recepcionLatitud	 = 0

    BigDecimal	recepcionLongitud	 = 0

    String	area

    String	formaDePago

    Boolean	entregado	 = false

    String	motivo

    Boolean	completo	 = false

    Boolean	matratado	 = false

    Boolean	impreso	 = false

    Boolean	cortado	 = false

    String	reportoNombre

    String	reportoPuesto



    static mapping ={
        id generator:'uuid'
    }

    static constraints = {
        area inList:['COMPRAS','ALMACEN','MERCANCIAS','ENCARGADO','DUEÑO','OTRA']
        formaDePago inList: ['EFECTIVO','CHEQUE']
        motivo inList: ['CERRADO','SALIO_A_COMER','NO_PAGO','DIRECCION_INCORRECTA','ERROR EN MOSTRADOR']
        reportoPuesto inList: ['ENCARGADO_EMBARQUES','ENCARGADO_SUCURSAL','MOSTRADOR',]
        reportoNombre nullable: true

    }

}
