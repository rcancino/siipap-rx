package sx.cfdi

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.validation.Validateable

/**
 * Created by rcancino on 09/09/16.
 */
@ToString(includeNames=true,includePackage=false, excludes = ['dateCreated', 'lastUpdated'])
@EqualsAndHashCode(includeFields = true,includes = ['uuid'])
class Cfdi {

    //Datos de CFDI...
    String id

    URL url

    String emisor

    String emisorRfc

    String receptorRfc

    String tipoDeComprobante

    String fileName

    String uuid

    Date fecha

    String rfc

    String serie

    String folio

    String metodoDePago

    String formaDePago

    BigDecimal total

    String sw2

    Date dateCreated

    Date lastUpdated


    static constraints = {
        emisorRfc minSize: 12, maxSize:13
        receptorRfc minSize: 12, maxSize:13
        uuid unique:true , nullable: true
        url url:true
        fileName maxSize:150
        rfc nullable:true
        serie nullable:true,maxSize:30
        folio nullable:true,maxSize:30
        tipoDeComprobante inList:['INGRESO','EGRESO','TRASLADO','PAGO','NOMINA']
        formaDePago maxSize:50
        metodoDePago maxSize:30
        sw2 nullable: true
    }

    static  mapping={
        id generator:'uuid'
    }
}

