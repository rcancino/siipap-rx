package sx.cxc

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import sx.core.Cliente
import sx.core.Sucursal

@ToString(includes = ["cliente,fecha,sucursal,formaDePago,total"],includeNames=true,includePackage=false)
@EqualsAndHashCode(includeFields = true,includes = ['id,clave,fecha,total'])
class  Cobro {

    String id

    Cliente cliente

    Sucursal sucursal

    String tipo

    Date fecha

    String formaDePago

    Currency moneda = Currency.getInstance('MXN')

    BigDecimal tipoDeCambio = 1.0

    BigDecimal importe

    String referencia

    Date primeraAplicacion

    Boolean anticipo = false

    Boolean enviado = false

    Date dateCreated

    Date lastUpdated

    String creadoPor

    String modificadoPor
    

    String sw2

    static hasOne = [cheque: CobroCheque, deposito: CobroDeposito, transferencia: CobroTransferencia]

    static constraints = {
        tipo inList:['CAM','MOS','CRE','CHE','JUR']
        referencia nullable:true
        sw2 nullable:true, unique:true
        creadoPor nullable:true
        modificadoPor nullable:true
        cheque nullable:true
        deposito nullable:true
        transferencia nullable:true

    }

    static mapping={
        id generator:'uuid'
        fecha type:'date' ,index: 'COBRO_IDX1'
        cliente index: 'COBRO_IDX2'
        formaDePago index: 'COBRO_IDX3'
    }


}
