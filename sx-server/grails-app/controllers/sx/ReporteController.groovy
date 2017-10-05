package sx

import grails.plugins.jasper.JasperExportFormat
import grails.plugins.jasper.JasperReportDef
import grails.rest.*
import grails.converters.*

class ReporteController {

	// static responseFormats = ['json', 'xml']

    def jasperService

    def run(ReportConfig config) {

        def repParams = params

        println "Generando  Reporte... con params: " + params

        def reportDef= new JasperReportDef(
                name: 'MovGenerico',
                fileFormat: JasperExportFormat.PDF_FORMAT,
                parameters: repParams
        )
        ByteArrayOutputStream pdfStream = jasperService.generateReport(reportDef)
        render (file: pdfStream.toByteArray(), contentType: 'application/pdf', filename: 'MovimientoGenerico')

    }
}

class  ReportConfig {
    
    String name;

    static constraints = {
        
    }
}
