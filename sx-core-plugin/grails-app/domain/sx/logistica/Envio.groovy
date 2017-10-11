package sx.logistica

import sx.core.Cliente

class Envio {

    String	id

    Embarque	embarque

    Cliente cliente

    String	origen

    String	entidad

    BigDecimal	porCobrar	 = 0

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

    Date	fechaDocumento

    BigDecimal	totalDocumento	 = 0

    String	nombre

    String	tipoDocumento

    BigDecimal	arriboLatitud	 = 0

    BigDecimal	arriboLongitud	 = 0

    BigDecimal	recepcionLatitud	 = 0

    BigDecimal	recepcionLongitud	 = 0

    String	area

    String	formaPago

    Boolean	entregado	 = false

    String	motivo

    Boolean	completo	 = false

    Boolean	matratado	 = false

    Boolean	impreso	 = false

    Boolean	cortado	 = false

    String	reportoNombre

    String	reportoPuesto

    List partidas = []

    Date dateCreated

    Date lastUpdated

    static  hasMany= [partidas : EnvioDet]


    static mapping ={
        id generator:'uuid'
        partidas cascade: 'all-delete-orphan'
    }

    static constraints = {
        area inList:['COMPRAS','ALMACEN','MERCANCIAS','ENCARGADO','DUEÑO','OTRA']
        formaPago inList: ['EFECTIVO','CHEQUE']
        motivo inList: ['CERRADO','SALIO_A_COMER','NO_PAGO','DIRECCION_INCORRECTA','ERROR EN MOSTRADOR']
        reportoPuesto inList: ['ENCARGADO_EMBARQUES','ENCARGADO_SUCURSAL','MOSTRADOR',]
        reportoNombre nullable: true
        arribo nullable: true
        recepcion nullable: true
        recibio nullable: true
        comentario nullable: true

    }

}
