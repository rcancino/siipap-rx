package sx.cxc

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import sx.core.Cliente
import sx.core.Sucursal
import sx.tesoreria.Banco
import sx.tesoreria.CuentaDeBanco

@ToString(excludes = ["id,lastUpdated,dateCreated"],includeNames=true,includePackage=false)
@EqualsAndHashCode(includeFields = true,includes = ['id'])
class SolicitudDeDeposito {

    String	id

    Sucursal sucursal

    Cliente cliente

    Cobro	cobro

    Banco banco

    CuentaDeBanco cuenta

    String	tipo

    Integer	folio	 = 0

    Date	fecha

    Date	fecha_deposito

    String	referencia

    BigDecimal	importe_cheque	 = 0

    BigDecimal	importe_efectivo	 = 0

    BigDecimal	importe_tarjeta	 = 0

    BigDecimal	total	 = 0

    String	comentario

    Date	cancelacion

    String	comentario_cancelacion

    Boolean	enviado	 = false

    String sw2

    Date dateCreated

    Date lastUpdated

    String createUser

    String updateUser



    static mapping={
        id generator: 'uuid'
    }


    static constraints = {
        sw2 nullable: true
    }
}
