package sx.core

/**
 *
 */
class UserLog {

    String creado;

    String modificado;

    static constraints = {
        creado nullable: true;
        modificado nullable: true;
    }

    String toString(){
        return "Creado por ${creado} Ultimo en modificar: ${modificado}"
    }

}
