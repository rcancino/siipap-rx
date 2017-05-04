package sx.contabilidad

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='ejercicio,mes,tipo,folio')
@ToString(includes='ejercicio,mes,subTipo,folio',includeNames=true,includePackage=false)
class PolizaFolio {

    Integer ejercicio
    Integer mes
    String subTipo
    Long folio=0

    Date dateCreated
    Date lastUpdated

    static constraints = {
        subTipo maxSize:50
        mes inList:(1..13)
        folio nullable:false,unique:['subTipo','mes','ejercicio']
    }

    Long next(){
        folio++
        return folio
    }

}

