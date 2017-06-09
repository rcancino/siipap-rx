package sx.core

import groovy.transform.ToString
import sx.cxc.CuentaPorCobrar


@ToString( includes = "sucursal,documento,fecha,total",includeNames=true,includePackage=false)
class Venta {


    String id

    Cliente	cliente

    Vendedor	vendedor

    Sucursal sucursal

    Sucursal	sucursalVenta

    String	tipo

    Long	documento	 = 0

    BigDecimal	importe	 = 0

    BigDecimal	impuesto	 = 0

    BigDecimal	total	 = 0

    BigDecimal	descuento	 = 0

    BigDecimal	descuentoOriginal	 = 0

    BigDecimal	cargosPorManiobra	 = 0

    BigDecimal	comisionTarjeta	 = 0

    BigDecimal	comisionTarjetaImporte	 = 0

    String	formaDePago

    Currency moneda = Currency.getInstance('MXN')

    BigDecimal	tipoDeCambio	 = 1

    BigDecimal	kilos	 = 0

    Date	puesto

    Date	facturar

    Boolean	vale = false

    Sucursal	sucursalVale

    String	clasificacionVale = 'SIN_VALE'

    Date	impreso

    String	comprador

    String	atencion

    String	manejoEntrega

    String	comentario

    String	sw2

    Date fecha

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser

    CuentaPorCobrar cuentaPorCobrar

    List partidas = []




    static constraints = {
        tipo  inList:['CON','COD','CRE','PSF','INE','OTR','ACF','ANT','AND']
        documento maxSize: 20
        puesto nullable: true
        tipoDeCambio(scale:6)
        impreso nullable:true
        atencion inList:['MOSTRADOR','TELEFONICA','ND']
        clasificacionVale nullable:true,maxSize:30
        comentario nullable:true
        facturar nullable:true
        comprador nullable:true
        sw2 nullable:true
        createUser nullable:true, maxSize: 100
        updateUser nullable:true, maxSize: 100
        sucursalVale nullable:true
        sucursalVenta nullable:true
        clasificacionVale inList: ['SIN_VALE','ENVIA_SUCURSAL','PASA_CAMIONETA','RECOGE_CLIENTE','EXISTENCIA_VENTA']
        manejoEntrega inList:['ORDINARIO','PARCIAL']
        cuentaPorCobrar nullable: true
        vale nullable: true
        updateUser nullable: true

    }

    static mapping = {
        partidas cascade: "all-delete-orphan"
        id generator:'uuid'
        fecha type:'date' ,index: 'VENTA_IDX1'
        cliente index: 'VENTA_IDX3'


    }

    static hasMany =[partidas:VentaDet]



}
