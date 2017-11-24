package sx

import grails.transaction.Transactional
import grails.plugins.jasper.JasperExportFormat
import grails.plugins.jasper.JasperReportDef

/**
 * Abstraction layer para ejectuar reportes
 */
class ReporteService {

	def jasperService

    def run(String reportName, def params ) {
        def reportDef= new JasperReportDef(
                name: reportName,
                fileFormat: JasperExportFormat.PDF_FORMAT,
                parameters: params
        )
        ByteArrayOutputStream pdfStream = jasperService.generateReport(reportDef)
        return pdfStream
    }

    def reporteFechaSucursal(String sucursal,String fecha,String name){
        def repParams = [:]

        fileFormat: JasperExportFormat.PDF_FORMAT

        repParams['SUCURSAL'] = sucursal
        repParams['FECHA'] = fecha
        println 'Ejecutando reporte con parametros: ' + repParams +"---"+name
        def pdf = run(name, repParams)
        return pdf
    }

    ByteArrayOutputStream run(String reportName, Map params, def data){
        log.info('Ejecutando reporte: ' + reportName)
        def reportDef=new JasperReportDef(
                name:reportName,
                fileFormat: JasperExportFormat.PDF_FORMAT,
                parameters:params,
                reportData:data
        )
        ByteArrayOutputStream  stream=jasperService.generateReport(reportDef)
        return stream
    }


}
