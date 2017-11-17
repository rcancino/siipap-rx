package sx.cfdi

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController
import groovy.util.slurpersupport.GPathResult
import groovy.xml.XmlUtil

@Secured("hasRole('ROLE_POS_USER')")
class CfdiController extends RestfulController{

  CfdiTimbradoService cfdiTimbradoService

  static responseFormats = ['json']

  CfdiController(){
    super(Cfdi)
  }

  def mostrarXml(Cfdi cfdi){
    if(cfdi == null ){
      notFound()
      return
    }

    // def comprobante = new XmlSlurper().parse(cfdi.getUrl().newInputStream())

    println 'Mostrando XML para: ' + cfdi.url.file
    // def file = new File(cfdi.url.file)
    // println 'File: ' +file.getPath()
    // def res = parse(file.bytes)
    // println 'Res: ' + res
    // render(text: res, contentType: "text/xml", encoding: "UTF-8")
    render (file: cfdi.getUrl().newInputStream(), contentType: 'text/xml', filename: cfdi.fileName, encoding: "UTF-8")
  }

  def timbrar(Cfdi cfdi) {

  }

  private String parse(byte[] xmlData){
    ByteArrayInputStream is=new ByteArrayInputStream(xmlData)
    GPathResult xmlResult = new XmlSlurper().parse(is)
    return XmlUtil.serialize(xmlResult)
  }
}
