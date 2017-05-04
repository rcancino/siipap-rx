package sx.cxc

import groovy.transform.ToString
import sx.core.Cliente
//import sx.core.Sucursal

/**
 * Created by rcancino on 23/03/17.
 */
@ToString( includes = "clave,nombre,fecha,serie,folio,total",includeNames=true,includePackage=false)
class NotaDeCargo {

    String id

    //Sucursal sucursal

    Cliente cliente

    String clave

    String rfc

    String nombre

    Date fecha

    String tipo

    String serie

    String folio

    String uuid

    Currency moneda = Currency.getInstance('MXN')

    BigDecimal tipoDeCambio = 1.0

    String comentario

    List partidas = []

    String sw2

    Date dateCreated

    Date lastUpdated

    static constraints = {
        tipo  inList:['CON','COD','CRE','PSF','INE','OTR','ACF','ANT','AND']
        uuid nullable:true, unique:true
        serie nullable:true, maxSize: 20
        folio nullable:true, unique:'serie', maxSize: 20
        rfc minSize:12, maxSize:13
        tipoDeCambio(scale:6)
        comentario nullable:true
        sw2 nullable:true
    }

    static hasMany =[partidas:NotaDeCargoDet]

    static mapping = {
        id generator:'uuid'
        partidas cascade: "all-delete-orphan"
        fecha type:'date' ,index: 'NCARGO_IDX1'
        serie index: 'NCARGO_IDX2'
        folio index: 'NCARGO_IDX2'
        cliente index: 'NCARGO_IDX3'
    }
}
