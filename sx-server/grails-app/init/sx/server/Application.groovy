package sx.server

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

/**
 * Arumentos requeridos -noverify  -Xms2g -Xmx2g -XX:MaxPermSize=512m
 */
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}