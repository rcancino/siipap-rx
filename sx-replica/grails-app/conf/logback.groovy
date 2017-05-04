import grails.util.BuildSettings
import grails.util.Environment
import org.springframework.boot.logging.logback.ColorConverter
import org.springframework.boot.logging.logback.WhitespaceThrowableProxyConverter

import java.nio.charset.Charset

conversionRule 'clr', ColorConverter
conversionRule 'wex', WhitespaceThrowableProxyConverter

// See http://logback.qos.ch/manual/groovy.html for details on configuration
appender('STDOUT', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        charset = Charset.forName('UTF-8')

        pattern =
                '%clr(%d{HH:mm:ss}){faint} ' + // Date
                '%clr(%5p) ' + // Log level
                '%clr(%logger{0}){cyan} %clr(:){faint} ' + // Logger
                '%m%n%wex' // Message
    }
}

def targetDir = BuildSettings.TARGET_DIR
if (Environment.isDevelopmentMode() && targetDir != null) {
    appender("FULL_STACKTRACE", FileAppender) {
        file = "${targetDir}/stacktrace.log"
        append = true
        encoder(PatternLayoutEncoder) {
            pattern = "%level %logger - %msg%n"
        }
    }
    logger("StackTrace", ERROR, ['FULL_STACKTRACE'], false)
    root(ERROR, ['STDOUT', 'FULL_STACKTRACE'])
}
else {
    root(ERROR, ['STDOUT'])
}

if(Environment.current == Environment.DEVELOPMENT){
    logger("grails.app.services",INFO,['STDOUT'],false)
    logger("grails.app.controllers",INFO,['STDOUT'],false)
    logger("grails.app.jobs",INFO,['STDOUT'],false)
    logger("sx.replica",INFO,['STDOUT'],false)
    logger("sx.server.integracion", INFO, ['STDOUT'], false)
}
