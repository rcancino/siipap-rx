package sx

import grails.plugins.jasper.JasperExportFormat
import grails.plugins.jasper.JasperReportDef
import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

@Secured("IS_AUTHENTICATED_ANONYMOUSLY")
class ReporteController {

	// static responseFormats = ['json', 'xml']

    def jasperService

    def run(ReportConfig config) {

        // params.ID = '402880e55ea4c4d4015ea4dd71d9050e'
        def repParams = params

        println "Generando  Reporte... con params: " + params
        println "Reporte: " + config
       
        def reportDef= new JasperReportDef(
                name: 'MovGenerico',
                fileFormat: JasperExportFormat.PDF_FORMAT,
                parameters: repParams
        )
        ByteArrayOutputStream pdfStream = jasperService.generateReport(reportDef)
        render (file: pdfStream.toByteArray(), contentType: 'application/pdf', filename: 'MovimientoGenerico')
        /*
        render(contentType: "application/json") {
            reportTask(title: 'Reporte title', fecha: 'fecha')
        }
        */


    }
}

class  ReportConfig {
    
    String name;

    static constraints = {
        
    }

    String toString(){
        return "Reporte ${name}"
    }
}
