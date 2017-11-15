package sx

import grails.transaction.Transactional
import grails.plugins.jasper.JasperExportFormat
import grails.plugins.jasper.JasperReportDef


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


}
