package sx.core

class ComunicacionEmpresa {

    String	id

    Boolean	activo	 = true

    String	tipo

    String	descripcion

    String	comentario

    Boolean cfdi = false

    Long	sw2	 = 0

    Cliente cliente



    static constraints = {
        tipo inList:['TEL','CEL','FAX','MAIL','WEB']
        descripcion nullable:true
        comentario  nullable:true
        sw2 nullable: true

    }
    static  mapping={
        id generator:'uuid'
    }

}
