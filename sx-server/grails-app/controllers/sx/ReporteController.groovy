package sx

import grails.plugins.jasper.JasperExportFormat
import grails.plugins.jasper.JasperReportDef
import grails.rest.*
import grails.converters.*

class ReporteController {
	static responseFormats = ['json', 'xml']

    def jasperService

    def index() {

        def repParams = [:]
        repParams['ID'] = ''

        println "Generando  Reporte..."

        def reportDef= new JasperReportDef(
                name: 'MovGenerico',
                fileFormat: JasperExportFormat.PDF_FORMAT,
                parameters: repParams
        )
        ByteArrayOutputStream pdfStream = jasperService.generateReport(reportDef)
        render (file: pdfStream.toByteArray(), contentType: 'application/pdf', filename: 'MovimientoGenerico')

    }
}
