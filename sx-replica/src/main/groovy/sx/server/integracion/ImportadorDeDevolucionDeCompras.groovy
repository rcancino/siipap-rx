package sx.server.integracion

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Luis on 01/06/17.
 *
 **/
 @Component
class ImportadorDeDevolucionDeCompras implements  Importador,SW2Lookup{
     @Autowired
     ImportadorDeProductos importadorDeProductos
}
