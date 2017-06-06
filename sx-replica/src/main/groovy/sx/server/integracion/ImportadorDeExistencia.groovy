package sx.server.integracion

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Luis on 01/06/17.
 */
@Component
class ImportadorDeExistencia implements Importador,SW2Lookup {
    @Autowired
    ImportadorDeProductos importadorDeProductos

    def importar(def year,def mes){
           def existencias=leerRegistros(QUERY,[year,mes])

            existencias.each {row()

            }

    }






    static String QUERY="""
    SELECT
        sucursal_id,
        producto_id,
        year as anio,
        mes,
        nacional,
        kilos,
        e.PED_PENDTE as pedidosPendiente,
        cantidad,
        recorte,
        e.RECORTE_COMENTARIO as recorteComentario,
        e.RECORTE_FECHA as recorteFecha
    FROM sx_existencias e
    where year=? and mes=?
    """
}
