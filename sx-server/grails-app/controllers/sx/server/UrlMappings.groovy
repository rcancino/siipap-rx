package sx.server

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        // Catalogos principales
        "/api/sucursales"(resources: "sucursal")
        "/api/lineas"(resources: "linea")
        "/api/marcas"(resources: "marca")
        "/api/clases"(resources: "clase")
        "/api/productos"(resources: "producto")
        "/api/proveedores"(resources: "proveedor"){
            "/productos"(resources:'proveedorProducto')
        }
        "/api/clientes"(resources: "cliente")

        //Contabilidad y finanzas
        "/api/sat/bancos"(resources: "SatBanco")
        "/api/sat/cuentas"(resources:"SatCuenta")

        "/api/contabilidad/cuentas"(resources:"cuentaContable")
        "/api/contabilidad/subtipos"(resources:"subTipoDePoliza")
        "/api/contabilidad/polizas"(resources:"poliza")

        // Tesoreria
        "/api/tesoreria/cuentas"(resources: "cuentaDeBanco")
        "/api/tesoreria/requisiciones"(resources:"requisicion"){
            "/partidas"(resources:"requisicionDet")
        }

        // CxP
        "/api/cxp"(resources: "cuentaPorPagar")
        "/api/cxp/importar"(controller:"cuentaPorPagar", action:"importar")

        //Comprobantes fiscales CFDI's
        "/api/cfdis"(resources: "comprobanteFiscal")
        "/api/cfdis/importar"(controller:"comprobanteFiscal", action:"importar")
        "/api/cfdis/mostrarXml/$id?"(controller:"comprobanteFiscal", action:"mostrarXml")

        // CxP
        "/api/cxc/notas"(resources: "notaDeCredito"){
            "/partidas"(resources:"notaDeCreditoDet")
        }
        "/api/cxp/contrarecibos"(resources: "contraRecibo")

        // Compras
        "/api/compras"(resources: "compra"){
            "/partidas"(resources:"compraDet")
        }
        "/api/listaDePreciosPorProveedor"(resources: "listaDePreciosPorProveedor")
        "/api/compras/recepciones"(resources: "recepcionDeCompra") {
            "/partidas"(resource: "recepcionDeCompraDet")
        }
        "/api/compras/devolucionCompra"(resources: "devolucionDeCompra")

        // Ventas
        "/api/ventas/listas"(resources: "listaDePreciosVenta")
        "/api/core/ventas"(resources:"venta")

        // CXC
        "/api/notasDeCargo"(resources: "notaDeCargo")
        "/api/cuentasPorCobrar"(resources: 'cuentaPorCobrar')
        "/api/notasDeCredito"(resources: "notaDeCredito")

        //Inventario
        "/api/inventario"(resources: "inventario")
        "/api/inventario/movimientos"(resources: "movimientoDeAlmacen")
        "/api/inventario/kardex"(controller: "inventario", action: "kardex" )
        "/api/inventario/saveInventario"(controller: "inventario", action: "saveInventario" , method: 'POST')
        "/api/inventario/traslados"(resources: "traslado")
        "/api/inventario/devolucionVenta"(resources: "devolucionDeVenta")
        "/api/inventario/transformacion"(resources: "transformacion")

        // Security
        "/api/security/users"(resources: "user")
        "/api/security/roles"(resources: "role")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
