package sx.cfdi

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.validation.Validateable

/**
 * Created by rcancino on 09/09/16.
 */
@ToString(includeNames=true,includePackage=false, excludes = ['dateCreated', 'lastUpdated'])
@EqualsAndHashCode(includeFields = true, includes = ['serie', 'folio', 'uuid', 'id'])
class Cfdi {

  String id

  String versionCfdi = '3.3'

  Date fecha

  String serie

  String folio

  String emisor

  String emisorRfc

  String receptor

  String receptorRfc

  String tipoDeComprobante

  String fileName

  String uuid

  BigDecimal total

  URL url

  String sw2

  Date dateCreated

  Date lastUpdated

  CfdiTimbre timbre

  String origen = 'VENTA'

  static constraints = {
    emisorRfc minSize: 12, maxSize:13
    receptorRfc minSize: 12, maxSize:13
    uuid unique:true , nullable: true
    url url:true
    fileName maxSize:150
    serie nullable:true,maxSize:30
    folio nullable:true,maxSize:30
    tipoDeComprobante inList:['I','E','T','P','N']
    sw2 nullable: true
    versionCfdi inList: ['3.2', '3.3']
    origen inList:['VENTA','NOTA_CARGO','NOTA_CREDITO','TRASLADO']
  }

  static  mapping={
      id generator:'uuid'
  }

  static transients = ['timbre']


}

