package sx.cfdi

import grails.transaction.Transactional
import org.apache.commons.compress.archivers.zip.ZipUtil
import org.apache.commons.io.FileUtils
import org.springframework.context.ApplicationContext

import sx.cfdi.providers.edicom.CFDi
/*
import sx.cfdi.providers.cepdi.DatosExtra
import sx.cfdi.providers.cepdi.RespuestaTimbrado
import sx.cfdi.providers.cepdi.WS

*/
/*
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import java.util.zip.ZipInputStream
*/
/**
 * Prueba de service para timbrado
 */
@Transactional
class CfdiTimbradoService {

  // WS cerpiService

  CFDi edicomService

  def timbrar(Cfdi cfdi) {
    timbrarEdicom(cfdi)
    return cfdi
  }

  def timbrarEdicom(Cfdi cfdi) {
    File file = FileUtils.toFile(cfdi.url)
    byte[] res = edicomService.getCfdiTest('PAP830101CR3','yqjvqfofb', file.bytes)
    println('Timbrado exitoso: ', res)
    // FileUtils.writeByteArrayToFile(file, res)
  }
  /*

  def timbrarCerpi() {
    File file = FileUtils.toFile(cfdi.url)
    DatosExtra extra = new DatosExtra()
    RespuestaTimbrado res = cerpiService.timbraXML('clientetimbrado001@mail.com','Demo123#',file.toString(), extra)
    if(res.exitoso) {
      cfdi.uuid = res.UUID
      println 'TFD: ' + res.TFD
      return res.XMLTimbrado
    } else {
      println( 'Error timbrando XML: ' + res.mensajeError + ' Código: ' + res.codigoError)
      return null

    }
  }
  */

  

}
