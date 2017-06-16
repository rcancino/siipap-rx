package sx.replica

import org.springframework.beans.factory.annotation.Autowired
import sx.server.integracion.ImportadorAuditLogIntegracion

class ImportadorIntegracionJob {
    static triggers = {
      //simple repeatInterval: 5000l // execute job once in 5 seconds
        cron name:'importadorAudit', startDelay:10000, cronExpression: '0 0/20 8-20 * * ?'
    }

    @Autowired
    ImportadorAuditLogIntegracion importadorAuditLogIntegracion

    def execute() {

       // println "Job Run!"

        //importadorAuditLogIntegracion.importar()

    }
}
