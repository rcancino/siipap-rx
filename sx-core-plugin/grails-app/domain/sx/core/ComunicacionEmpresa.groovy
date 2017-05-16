package sx.core

class ComunicacionEmpresa {

    String	id

    Boolean	activo	 = true

    String	tipo

    String	descripcion

    String	comentario

    Long	sw2	 = 0


    static constraints = {
        tipo inList:['TIPO','TEL','CEL','FAX','MAIL','WEB']
        descripcion nullable:true
        comentario  nullable:true
        sw2 nullable: true

    }
    static  mapping={
        id generator:'uuid'
    }

}
