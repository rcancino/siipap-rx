package sx.cxc

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import sx.cfdi.Cfdi
import sx.core.Cliente
import sx.core.Cobrador
import sx.core.Socio
import sx.core.Sucursal
import sx.core.Venta

@ToString(excludes = ['id,version,sw2,dateCreated,lastUpdated'],includeNames=true,includePackage=false)
@EqualsAndHashCode(includeFields = true,includes = ['id,cliente,fecha,total'])
class CuentaPorCobrar {

    String	id

    Cliente	cliente

    Sucursal sucursal

    String tipoDocumento

    Long	documento	 = 0

    BigDecimal	importe	 = 0

    BigDecimal	impuesto	 = 0

    BigDecimal	total	 = 0

    String	formaDePago

    Currency moneda = Currency.getInstance('MXN')

    BigDecimal	tipoDeCambio	 = 1

    BigDecimal	cargo	 = 0

    String	comentario

    String	sw2

    String	uuid

    Cfdi cfdi

    Date fecha

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser

    static belongsTo=[venta:Venta,notaCargo:NotaDeCargo,cheque:ChequeDevuelto,devolucion:DevolucionCliente]

    static constraints = {
        tipoDocumento inList:['VENTA','CHEQUE_DEVUELTO','DEVOLUCION_CLIENTE','NOTA_DE_CARGO']
        documento maxSize: 20
        uuid nullable:true, unique:true
        tipoDeCambio(scale:6)
        uuid nullable: true
        comentario nullable:true
        sw2 nullable:true
        cfdi nullable: true
    }


    static mapping = {
        id generator:'uuid'
        fecha type:'date' ,index: 'CXC_IDX1'
        cliente index: 'CXC_IDX3'

    }


}
