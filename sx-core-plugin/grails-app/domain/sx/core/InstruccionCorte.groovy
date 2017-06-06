package sx.core

class InstruccionCorte {

    String id

    Long	cortes = 0

    BigDecimal	precioCortes = 0

    BigDecimal cortesAncho = 0

    BigDecimal cortesLargo = 0

    Integer tamaños = 0

    Boolean refinado = false

    String seleccionCalculo

    String cortesTipo = 'CALCULADO'

    String	cortesInstruccion

    String instruccionEmpacado

    VentaDet ventaDet

    static constraints = {
        seleccionCalculo nullable: true
        cortesTipo inList:['CALCULADO','CRUZ','CARTA','MITAD','1/8','CROQUIS','DOBLE_CARTA','MEDIA_CARTA','OFICIO']
        cortesInstruccion nullable: true
        instruccionEmpacado nullable: true

    }

    static  mapping ={
        id generator:'uuid'
    }

}
