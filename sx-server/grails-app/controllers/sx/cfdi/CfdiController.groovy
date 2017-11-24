package sx.cfdi

import com.luxsoft.cfdix.v33.V33PdfGenerator
import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController
import grails.transaction.Transactional
import groovy.util.slurpersupport.GPathResult
import groovy.xml.XmlUtil
import lx.cfdi.v33.CfdiUtils
import lx.cfdi.v33.Comprobante
import org.apache.commons.io.FileUtils
import sx.ReporteService

@Secured("hasRole('ROLE_POS_USER')")
class CfdiController extends RestfulController{

  CfdiTimbradoService cfdiTimbradoService

  ReporteService reporteService



  static responseFormats = ['json']

  CfdiController(){
    super(Cfdi)
  }

  def mostrarXml(Cfdi cfdi){
    if(cfdi == null ){
      notFound()
      return
    }
    render (file: cfdi.getUrl().newInputStream(), contentType: 'text/xml', filename: cfdi.fileName, encoding: "UTF-8")
  }

  @Transactional
  def print( Cfdi cfdi) {
    def pdf = null
    if(cfdi.versionCfdi == '3.3') {
      pdf = generarImpresionV33(cfdi)
    } else {
      pdf = generarImpresionV32(cfdi)
    }
    render (file: pdf.toByteArray(), contentType: 'application/pdf', filename: cfdi.fileName)
    //render [:]
  }

  private generarImpresionV33( Cfdi cfdi) {
    // Map params = V33PdfGenerator.getParametros(cfdi)
    def realPath = servletContext.getRealPath("/reports")
    // println 'Reports path: ' + realPath
    def data = V33PdfGenerator.getReportData(cfdi)
    // println 'Parametros para el reporte: ' + data['PARAMETROS']
    // println 'Conceptos para el reporte: ' + data['CONCEPTOS']
    Map parametros = data['PARAMETROS']
    parametros.PAPELSA = realPath + '/PAPEL_CFDI_LOGO.jpg'
    parametros.IMPRESO_IMAGEN = realPath + '/Impreso.jpg'
    parametros.FACTURA_USD = realPath + '/facUSD.jpg'
    return reporteService.run('PapelCFDI3conImagenes.jrxml', data['PARAMETROS'], data['CONCEPTOS'])
  }

  private generarImpresionV32( Cfdi cfdi) {

  }


}
