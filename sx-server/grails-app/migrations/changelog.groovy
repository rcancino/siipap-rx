databaseChangeLog = {

    changeSet(author: "rcancino (generated)", id: "1501963400865-1") {
        createTable(tableName: "abono_cxp") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "class", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "egreso_id", type: "VARCHAR(255)")

            column(name: "requisicion_id", type: "VARCHAR(255)")

            column(name: "comprobante_id", type: "BIGINT")

            column(name: "concepto", type: "VARCHAR(255)")

            column(name: "importe", type: "DECIMAL(19, 4)")

            column(name: "impuesto", type: "DECIMAL(19, 4)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-2") {
        createTable(tableName: "acuse") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "codigo_estatus", type: "VARCHAR(100)") {
                constraints(nullable: "false")
            }

            column(name: "comprobante_fiscal_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "estado", type: "VARCHAR(100)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "url", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "uuid", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-3") {
        createTable(tableName: "alcance") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "devolucion_venta", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "existencia", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "fin", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "inicio", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "pedidos_pendiente", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "venta", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-4") {
        createTable(tableName: "analisis_de_factura") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "factura_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-5") {
        createTable(tableName: "analisis_de_factura_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "analisis_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "costo_unitario", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "desc1", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "desc2", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "desc3", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "desc4", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "entrada_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "precio_de_lista", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-6") {
        createTable(tableName: "analisis_devolucion_compra") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-7") {
        createTable(tableName: "aplicacion_cxp") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "abono_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cxp_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "class", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "aplicaciones_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-8") {
        createTable(tableName: "aplicacion_de_cobro") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nota_de_credito_id", type: "BIGINT")

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-9") {
        createTable(tableName: "autorizacion") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "autorizo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha_de_autorizacion", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "solicito", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-10") {
        createTable(tableName: "banco") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "banco_sat_id", type: "VARCHAR(255)")

            column(name: "nacional", type: "BOOLEAN")

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-11") {
        createTable(tableName: "banco_sat") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "nombre_corto", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "razon_social", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-12") {
        createTable(tableName: "cancelacion_cfdi") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-13") {
        createTable(tableName: "cfdi") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "emisor", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "emisor_rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "file_name", type: "VARCHAR(150)") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "VARCHAR(30)")

            column(name: "forma_de_pago", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "metodo_de_pago", type: "VARCHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "receptor_rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "rfc", type: "VARCHAR(255)")

            column(name: "serie", type: "VARCHAR(30)")

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo_de_comprobante", type: "VARCHAR(8)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "url", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "uuid", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-14") {
        createTable(tableName: "cheque") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cancelacion", type: "datetime")

            column(name: "comentario_cancelacion", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "devolucion_id", type: "VARCHAR(255)")

            column(name: "egreso_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "fecha_devolucion", type: "datetime")

            column(name: "folio", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "impresion", type: "datetime")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-15") {
        createTable(tableName: "cheque_devuelto") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cheque_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_documento", type: "VARCHAR(255)")

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-16") {
        createTable(tableName: "chofer") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-17") {
        createTable(tableName: "clase") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activa", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "clase", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-18") {
        createTable(tableName: "cliente") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cheque_devuelto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime")

            column(name: "foliorfc", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "juridico", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "permite_cheque", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "vendedor_id", type: "VARCHAR(255)")

            column(name: "direccion_calle", type: "VARCHAR(200)")

            column(name: "direccion_codigo_postal", type: "VARCHAR(255)")

            column(name: "direccion_colonia", type: "VARCHAR(255)")

            column(name: "direccion_estado", type: "VARCHAR(255)")

            column(name: "direccion_municipio", type: "VARCHAR(255)")

            column(name: "direccion_numero_exterior", type: "VARCHAR(50)")

            column(name: "direccion_numero_interior", type: "VARCHAR(50)")

            column(name: "direccion_pais", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-19") {
        createTable(tableName: "cliente_contactos") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "email", type: "VARCHAR(255)")

            column(name: "nombre", type: "VARCHAR(255)")

            column(name: "puesto", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "telefono", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-20") {
        createTable(tableName: "cliente_credito") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "atraso_maximo", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cobrador_id", type: "VARCHAR(255)")

            column(name: "credito_activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "descuento_fijo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "dia_cobro", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "dia_revision", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "linea_de_credito", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "operador", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "plazo", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "postfechado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "revision", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "saldo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "socio_id", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "vence_factura", type: "BOOLEAN") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-21") {
        createTable(tableName: "cobrador") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "apellido_materno", type: "VARCHAR(255)")

            column(name: "apellido_paterno", type: "VARCHAR(255)")

            column(name: "clave", type: "VARCHAR(255)")

            column(name: "comision", type: "DECIMAL(19, 2)")

            column(name: "curp", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "last_updated", type: "datetime")

            column(name: "nombres", type: "VARCHAR(255)")

            column(name: "rfc", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-22") {
        createTable(tableName: "cobro") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "anticipo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "enviado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "primera_aplicacion", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "referencia", type: "VARCHAR(255)")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(3)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-23") {
        createTable(tableName: "cobro_cheque") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "banco_origen_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cambipo_por_efectivo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "emisor", type: "VARCHAR(255)")

            column(name: "ficha_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "numero", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "numero_de_cuenta", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "post_fechado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "vencimiento", type: "date")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-24") {
        createTable(tableName: "cobro_deposito") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "banco_origen_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "conciliado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_destino_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha_deposito", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ingreso_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "total_cheque", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "total_efectivo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "total_tarjeta", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-25") {
        createTable(tableName: "cobro_tarjeta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comision", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "corte_de_tarjeta_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "debito_credito", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "validacion", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "visa_master", type: "BOOLEAN") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-26") {
        createTable(tableName: "cobro_transferencia") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "banco_origen_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "conciliado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_destino_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha_deposito", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ingreso_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-27") {
        createTable(tableName: "comision_bancaria") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(200)")

            column(name: "comision", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cxp_id", type: "VARCHAR(255)")

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "referencia_bancaria", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-28") {
        createTable(tableName: "comision_bancaria_movimiento_de_cuenta") {
            column(name: "comision_bancaria_movimientos_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "movimiento_de_cuenta_id", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-29") {
        createTable(tableName: "compra") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "centralizada", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "consolidada", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "entrega", type: "date")

            column(name: "especial", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "importe_bruto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_neto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuestos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "pendiente", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "ultima_depuracion", type: "datetime")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-30") {
        createTable(tableName: "compra_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "compra_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "costo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "depuracion", type: "datetime")

            column(name: "depurado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento1", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento2", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento3", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento4", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento_financiero", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_bruto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_neto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "precio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "recibido", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "solicitado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-31") {
        createTable(tableName: "comprobante_fiscal") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "emisor", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "emisor_rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "file_name", type: "VARCHAR(150)") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "VARCHAR(30)")

            column(name: "forma_de_pago", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "metodo_de_pago", type: "VARCHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "original_name", type: "VARCHAR(150)") {
                constraints(nullable: "false")
            }

            column(name: "receptor_rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "rfc", type: "VARCHAR(255)")

            column(name: "serie", type: "VARCHAR(30)")

            column(name: "tipo_de_comprobante", type: "VARCHAR(8)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "url", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "uuid", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-32") {
        createTable(tableName: "comunicacion_empresa") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cfdi", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "descripcion", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo", type: "VARCHAR(4)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-33") {
        createTable(tableName: "concepto_de_gasto") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "concepto", type: "VARCHAR(255)")

            column(name: "cuenta_contable", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "gasto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "producto_servicio_id", type: "VARCHAR(255)")

            column(name: "sucursal_id", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-34") {
        createTable(tableName: "condicion_de_envio") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "direccion_calle", type: "VARCHAR(200)")

            column(name: "direccion_codigo_postal", type: "VARCHAR(255)")

            column(name: "direccion_colonia", type: "VARCHAR(255)")

            column(name: "direccion_estado", type: "VARCHAR(255)")

            column(name: "direccion_municipio", type: "VARCHAR(255)")

            column(name: "direccion_numero_exterior", type: "VARCHAR(50)")

            column(name: "direccion_numero_interior", type: "VARCHAR(50)")

            column(name: "direccion_pais", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-35") {
        createTable(tableName: "contra_recibo") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-36") {
        createTable(tableName: "contra_recibo_cuenta_por_pagar") {
            column(name: "contra_recibo_cuentas_por_pagar_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_pagar_id", type: "VARCHAR(255)")

            column(name: "cuentas_por_pagar_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-37") {
        createTable(tableName: "corte_de_tarjeta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "corte", type: "date")

            column(name: "cuenta_de_banco_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "visa_master", type: "BOOLEAN") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-38") {
        createTable(tableName: "corte_de_tarjeta_aplicacion") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "corte_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "corte_de_tarjeta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "debito_credito", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "ingreso_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "orden", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "visa_master", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "aplicaciones_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-39") {
        createTable(tableName: "corte_de_tarjeta_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "corte_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-40") {
        createTable(tableName: "cuenta_bancaria") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_habiente", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "numero_de_cuenta", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "pago_referenciado", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-41") {
        createTable(tableName: "cuenta_contable") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(100)")

            column(name: "cuenta_sat_id", type: "BIGINT")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "de_resultado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(300)") {
                constraints(nullable: "false")
            }

            column(name: "detalle", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "naturaleza", type: "VARCHAR(9)") {
                constraints(nullable: "false")
            }

            column(name: "padre_id", type: "VARCHAR(255)")

            column(name: "presentacion_contable", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "presentacion_financiera", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "presentacion_fiscal", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "presentacion_presupuestal", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "suspendida", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(7)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-42") {
        createTable(tableName: "cuenta_de_banco") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "banco_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "impresion_template", type: "VARCHAR(50)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "numero", type: "VARCHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "sub_cuenta_operativa", type: "VARCHAR(4)")

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo", type: "VARCHAR(9)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-43") {
        createTable(tableName: "cuenta_por_cobrar") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cargo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cfdi_id", type: "VARCHAR(255)")

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_documento", type: "VARCHAR(18)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "uuid", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-44") {
        createTable(tableName: "cuenta_por_pagar") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "comprobante_id", type: "BIGINT")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuentof", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuentof_vto", type: "date")

            column(name: "documento", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "requisitado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_isr", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_isr_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_iva", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_iva_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo", type: "VARCHAR(7)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "vencimiento", type: "date") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-45") {
        createTable(tableName: "cuenta_sat") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "codigo", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "nivel", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-46") {
        createTable(tableName: "devolucion_cliente") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_documento", type: "VARCHAR(255)")

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-47") {
        createTable(tableName: "devolucion_de_compra") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha_referencia", type: "datetime")

            column(name: "last_updated", type: "datetime")

            column(name: "nota_cxp_id", type: "VARCHAR(255)")

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "referencia", type: "VARCHAR(255)")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "update_user", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-48") {
        createTable(tableName: "devolucion_de_compra_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "analisis_devolucion_id", type: "VARCHAR(255)")

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "compra_det_id", type: "VARCHAR(255)")

            column(name: "costo_dec", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "devolucion_de_compra_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe_costo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-49") {
        createTable(tableName: "devolucion_de_venta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_cortes", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "nota_de_credito_id", type: "BIGINT")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)")

            column(name: "venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-50") {
        createTable(tableName: "devolucion_de_venta_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "costo_dev", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime")

            column(name: "devolucion_de_venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe_costo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime")

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "venta_det_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-51") {
        createTable(tableName: "diferencia_cambiaria") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "anio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)")

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "mes", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_cambio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "variacion", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-52") {
        createTable(tableName: "empresa") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "certificado_digital", type: "BLOB")

            column(name: "certificado_digital_pfx", type: "BLOB")

            column(name: "clave", type: "VARCHAR(15)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "llave_privada", type: "BLOB")

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "numero_de_certificado", type: "VARCHAR(20)")

            column(name: "password_pac", type: "VARCHAR(255)")

            column(name: "password_pfx", type: "VARCHAR(255)")

            column(name: "regimen", type: "VARCHAR(300)") {
                constraints(nullable: "false")
            }

            column(name: "rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "timbrado_de_prueba", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "usuario_pac", type: "VARCHAR(255)")

            column(name: "direccion_calle", type: "VARCHAR(200)")

            column(name: "direccion_codigo_postal", type: "VARCHAR(255)")

            column(name: "direccion_colonia", type: "VARCHAR(255)")

            column(name: "direccion_estado", type: "VARCHAR(255)")

            column(name: "direccion_municipio", type: "VARCHAR(255)")

            column(name: "direccion_numero_exterior", type: "VARCHAR(50)")

            column(name: "direccion_numero_interior", type: "VARCHAR(50)")

            column(name: "direccion_pais", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-53") {
        createTable(tableName: "existencia") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "anio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "devolucion_compra", type: "DECIMAL(19, 2)")

            column(name: "devolucion_venta", type: "DECIMAL(19, 2)")

            column(name: "entrada_compra", type: "DECIMAL(19, 2)")

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "mes", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "movimiento_almacen", type: "DECIMAL(19, 2)")

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "pedidos_pendiente", type: "DECIMAL(19, 2)")

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "recorte", type: "DECIMAL(19, 2)")

            column(name: "recorte_comentario", type: "VARCHAR(255)")

            column(name: "recorte_fecha", type: "datetime")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "transformacion", type: "DECIMAL(19, 2)")

            column(name: "traslado", type: "DECIMAL(19, 2)")

            column(name: "venta", type: "DECIMAL(19, 2)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-54") {
        createTable(tableName: "ficha") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cancelada", type: "datetime")

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cuenta_de_banco_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "envio_foraneo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "envio_valores", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "fecha_corte", type: "datetime")

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ingreso_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "origen", type: "VARCHAR(3)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_ficha", type: "VARCHAR(12)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-55") {
        createTable(tableName: "ficha_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "banco", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }

            column(name: "cheque", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "efectivo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "ficha_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-56") {
        createTable(tableName: "folio") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "entidad", type: "VARCHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "serie", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-57") {
        createTable(tableName: "gasto") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cxp_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)")

            column(name: "importe", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "retencion_isr", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_isr_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_iva", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "retencion_iva_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "tasa_iva", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "unidad", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "valor_unitario", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "gastos_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-58") {
        createTable(tableName: "ine_entidad") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ambito", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "complementoine_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "contabilidades", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-59") {
        createTable(tableName: "instruccion_corte") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cortes", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cortes_ancho", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cortes_instruccion", type: "VARCHAR(255)")

            column(name: "cortes_largo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cortes_tipo", type: "VARCHAR(11)") {
                constraints(nullable: "false")
            }

            column(name: "instruccion_empacado", type: "VARCHAR(255)")

            column(name: "precio_cortes", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "refinado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "seleccion_calculo", type: "VARCHAR(255)")

            column(name: "tamaños", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "venta_det_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-60") {
        createTable(tableName: "inventario") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "costo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "costo_promedio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "costo_reposicion", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "costo_ultima_compra", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(255)")

            column(name: "tipo_venta", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-61") {
        createTable(tableName: "linea") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activa", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "linea", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-62") {
        createTable(tableName: "lista_de_precios_por_proveedor") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)")

            column(name: "descuento_financiero", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "fecha_final", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "fecha_inicial", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "linea", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-63") {
        createTable(tableName: "lista_de_precios_por_proveedor_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuento1", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento2", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento3", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento4", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento_financiero", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "lista_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "neto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_anterior", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-64") {
        createTable(tableName: "lista_de_precios_venta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "aplicada", type: "datetime")

            column(name: "autorizacion", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "inicio", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "linea", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo_de_cambio_dolar", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-65") {
        createTable(tableName: "lista_de_precios_venta_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "costo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "costo_ultimo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "factor_contado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "factor_credito", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "incremento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "lista_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "precio_anterior_contado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_anterior_credito", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_contado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_credito", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-66") {
        createTable(tableName: "marca") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activa", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "marca", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-67") {
        createTable(tableName: "movimiento_de_almacen") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "por_inventario", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-68") {
        createTable(tableName: "movimiento_de_almacen_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime")

            column(name: "movimiento_de_almacen_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipocis", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-69") {
        createTable(tableName: "movimiento_de_cuenta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "afavor", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "concepto", type: "VARCHAR(50)")

            column(name: "cuenta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "referencia", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-70") {
        createTable(tableName: "movimiento_de_tesoreria") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-71") {
        createTable(tableName: "nota_de_cargo") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cargo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_documento", type: "VARCHAR(255)")

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-72") {
        createTable(tableName: "nota_de_cargo_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cargo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "concepto", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nota_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-73") {
        createTable(tableName: "nota_de_credito") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "aplicado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "autorizacion_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cfdi_id", type: "BIGINT")

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "diferencia", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "diferencia_fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "disponible", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impreso", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto_tasa", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "modo_de_calculo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "primera_aplicacion", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "serie", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tc", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(12)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_operacion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-74") {
        createTable(tableName: "nota_de_credito_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "concepto", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nota_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "numero_de_identificacion", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }

            column(name: "unidad", type: "VARCHAR(100)") {
                constraints(nullable: "false")
            }

            column(name: "valor_unitario", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-75") {
        createTable(tableName: "otros_productos") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "diferencia", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "diferencia_fecha", type: "datetime")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-76") {
        createTable(tableName: "poliza") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cierre", type: "datetime")

            column(name: "concepto", type: "VARCHAR(300)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "debe", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "ejercicio", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "haber", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "manual", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "mes", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "subtipo", type: "VARCHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(7)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-77") {
        createTable(tableName: "poliza_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "asiento", type: "VARCHAR(20)")

            column(name: "concepto", type: "VARCHAR(300)")

            column(name: "cuenta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "debe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)")

            column(name: "entidad", type: "VARCHAR(50)")

            column(name: "haber", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "origen", type: "VARCHAR(20)")

            column(name: "poliza_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "referencia", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-78") {
        createTable(tableName: "poliza_folio") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "ejercicio", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "mes", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "sub_tipo", type: "VARCHAR(50)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-79") {
        createTable(tableName: "producto") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "acabado", type: "VARCHAR(20)")

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "ajuste", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ancho", type: "DECIMAL(19, 2)")

            column(name: "calibre", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "caras", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "clase_id", type: "VARCHAR(255)")

            column(name: "clave", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "codigo", type: "VARCHAR(255)")

            column(name: "color", type: "VARCHAR(15)")

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "de_linea", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "fecha_lista", type: "datetime")

            column(name: "gramos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "inventariable", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "largo", type: "DECIMAL(19, 2)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "linea_id", type: "VARCHAR(255)")

            column(name: "m2xmillar", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "marca_id", type: "VARCHAR(255)")

            column(name: "modo_venta", type: "VARCHAR(1)") {
                constraints(nullable: "false")
            }

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "precio_contado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_credito", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "presentacion", type: "VARCHAR(9)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_favorito_id", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")

            column(name: "unidad", type: "VARCHAR(10)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-80") {
        createTable(tableName: "producto_servicio") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_contable", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-81") {
        createTable(tableName: "proveedor") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_bancaria", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "rfc", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "telefono1", type: "VARCHAR(30)")

            column(name: "telefono2", type: "VARCHAR(30)")

            column(name: "telefono3", type: "VARCHAR(30)")

            column(name: "tipo", type: "VARCHAR(26)") {
                constraints(nullable: "false")
            }

            column(name: "direccion_calle", type: "VARCHAR(200)")

            column(name: "direccion_codigo_postal", type: "VARCHAR(255)")

            column(name: "direccion_colonia", type: "VARCHAR(255)")

            column(name: "direccion_estado", type: "VARCHAR(255)")

            column(name: "direccion_municipio", type: "VARCHAR(255)")

            column(name: "direccion_numero_exterior", type: "VARCHAR(50)")

            column(name: "direccion_numero_interior", type: "VARCHAR(50)")

            column(name: "direccion_pais", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-82") {
        createTable(tableName: "proveedor_compras") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_contable", type: "VARCHAR(255)")

            column(name: "descuentof", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "diasdf", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha_revision", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "imprimir_costo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "plazo", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-83") {
        createTable(tableName: "proveedor_comunicacion_empresa") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "descripcion", type: "VARCHAR(255)")

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(4)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-84") {
        createTable(tableName: "proveedor_contactos") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "email", type: "VARCHAR(255)")

            column(name: "nombre", type: "VARCHAR(255)")

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "puesto", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "telefono", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-85") {
        createTable(tableName: "proveedor_de_flete") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-86") {
        createTable(tableName: "proveedor_producto") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clave_proveedor", type: "VARCHAR(255)")

            column(name: "codigo_proveedor", type: "VARCHAR(255)")

            column(name: "descripcion_proveedor", type: "VARCHAR(255)")

            column(name: "paquete_tarima", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "pieza_paquete", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-87") {
        createTable(tableName: "recepcion_de_compra") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "compra_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "fecha_remision", type: "datetime")

            column(name: "last_updated", type: "datetime")

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "remision", type: "VARCHAR(255)")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "update_user", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-88") {
        createTable(tableName: "recepcion_de_compra_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "compra_det_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "recepcion_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-89") {
        createTable(tableName: "requisicion") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "afavor", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "autorizacion_id", type: "VARCHAR(255)")

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuento_financiero", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "fecha_de_pago", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(13)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "proveedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "tipo", type: "VARCHAR(7)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 4)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-90") {
        createTable(tableName: "requisicion_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "a_pagar", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "analizado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cxp_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuento_financiero", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "requisicion_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-91") {
        createTable(tableName: "role") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "rolePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "authority", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-92") {
        createTable(tableName: "saldo_por_cuenta_de_banco") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cierre", type: "datetime")

            column(name: "cuenta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "egresos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "ejercicio", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "ingresos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "mes", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "saldo_final", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "saldo_inicial", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-93") {
        createTable(tableName: "sat_banco") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "nombre_corto", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "razon_social", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-94") {
        createTable(tableName: "sat_cuenta") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "codigo", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "nivel", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "tipo", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-95") {
        createTable(tableName: "socio") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comision_cobrador", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comision_vendedor", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "direccion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "vendedor_id", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-96") {
        createTable(tableName: "solicitud_de_deposito") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "banco_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cancelacion", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cobro_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario_cancelacion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "enviado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha_deposito", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "folio", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "importe_cheque", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_efectivo", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_tarjeta", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "referencia", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-97") {
        createTable(tableName: "solicitud_de_traslado") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clasificacion_vale", type: "VARCHAR(255)")

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "no_atender", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "referencia", type: "VARCHAR(255)")

            column(name: "sucursal_atiende_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_solicita_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "update_user", type: "VARCHAR(255)")

            column(name: "venta_id", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-98") {
        createTable(tableName: "solicitud_de_traslado_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cortes", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cortes_instruccion", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "recibido", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "solicitado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "solicitud_de_traslado_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-99") {
        createTable(tableName: "sub_tipo_de_poliza") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "descripcion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "orden", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "procesador", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(7)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-100") {
        createTable(tableName: "sucursal") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activa", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "clave", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "BIGINT")

            column(name: "direccion_calle", type: "VARCHAR(200)")

            column(name: "direccion_codigo_postal", type: "VARCHAR(255)")

            column(name: "direccion_colonia", type: "VARCHAR(255)")

            column(name: "direccion_estado", type: "VARCHAR(255)")

            column(name: "direccion_municipio", type: "VARCHAR(255)")

            column(name: "direccion_numero_exterior", type: "VARCHAR(50)")

            column(name: "direccion_numero_interior", type: "VARCHAR(50)")

            column(name: "direccion_pais", type: "VARCHAR(100)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-101") {
        createTable(tableName: "tarjeta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-102") {
        createTable(tableName: "transformacion") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "autorizacion_id", type: "VARCHAR(255)")

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime")

            column(name: "por_inventario", type: "BOOLEAN")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(255)")

            column(name: "update_user", type: "VARCHAR(255)")

            column(name: "venta_id", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-103") {
        createTable(tableName: "transformacion_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cortes", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cortes_instruccion", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "destino_id", type: "VARCHAR(255)")

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime")

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "transformacion_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-104") {
        createTable(tableName: "traslado") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "chofer_id", type: "VARCHAR(255)")

            column(name: "clasificacion_vale", type: "VARCHAR(255)")

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime")

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime")

            column(name: "por_inventario", type: "BOOLEAN")

            column(name: "solicitud_de_traslado_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(255)")

            column(name: "update_user", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-105") {
        createTable(tableName: "traslado_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "cortes", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cortes_instruccion", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "solicitado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "traslado_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-106") {
        createTable(tableName: "traspaso") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comision", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_destino_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "cuenta_origen_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "class", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe_isr", type: "DECIMAL(19, 2)")

            column(name: "plazo", type: "INT")

            column(name: "rendimiento_calculado", type: "DECIMAL(19, 2)")

            column(name: "rendimiento_fecha", type: "date")

            column(name: "rendimiento_impuesto", type: "DECIMAL(19, 2)")

            column(name: "rendimiento_real", type: "DECIMAL(19, 2)")

            column(name: "tasa", type: "DECIMAL(19, 2)")

            column(name: "tasa_isr", type: "DECIMAL(19, 2)")

            column(name: "vencimiento", type: "datetime")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-107") {
        createTable(tableName: "traspaso_movimiento_de_cuenta") {
            column(name: "traspaso_movimientos_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "movimiento_de_cuenta_id", type: "VARCHAR(255)")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-108") {
        createTable(tableName: "user") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "userPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "account_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "account_locked", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "apellido_materno", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "apellido_paterno", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "email", type: "VARCHAR(255)")

            column(name: "enabled", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "nombre", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "nombres", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "numero_de_empleado", type: "INT")

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password_expired", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "puesto", type: "VARCHAR(30)")

            column(name: "sucursal", type: "VARCHAR(20)")

            column(name: "username", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-109") {
        createTable(tableName: "user_role") {
            column(name: "user_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "role_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-110") {
        createTable(tableName: "vendedor") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "activo", type: "BOOLEAN")

            column(name: "apellido_materno", type: "VARCHAR(255)")

            column(name: "apellido_paterno", type: "VARCHAR(255)")

            column(name: "comision_contado", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comision_credito", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "curp", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nombres", type: "VARCHAR(255)")

            column(name: "rfc", type: "VARCHAR(255)")

            column(name: "sw2", type: "BIGINT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-111") {
        createTable(tableName: "venta") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "atencion", type: "VARCHAR(10)") {
                constraints(nullable: "false")
            }

            column(name: "cargos_por_maniobra", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "clasificacion_vale", type: "VARCHAR(30)")

            column(name: "cliente_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "comision_tarjeta", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comision_tarjeta_importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comprador", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(100)")

            column(name: "cuenta_por_cobrar_id", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento_original", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "documento", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "facturar", type: "datetime")

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "forma_de_pago", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "impreso", type: "datetime")

            column(name: "impuesto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "manejo_entrega", type: "VARCHAR(9)") {
                constraints(nullable: "false")
            }

            column(name: "moneda", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "puesto", type: "datetime")

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_vale_id", type: "VARCHAR(255)")

            column(name: "sucursal_venta_id", type: "VARCHAR(255)")

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "tipo", type: "VARCHAR(3)") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_cambio", type: "DECIMAL(19, 6)") {
                constraints(nullable: "false")
            }

            column(name: "total", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(100)")

            column(name: "vale", type: "BOOLEAN")

            column(name: "vendedor_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-112") {
        createTable(tableName: "venta_anticipo") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-113") {
        createTable(tableName: "venta_cancelada") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "autorizacion", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "fecha", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "usuario", type: "VARCHAR(255)")

            column(name: "venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-114") {
        createTable(tableName: "venta_credito") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cobrador_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "comentario_reprogramar_pago", type: "VARCHAR(255)")

            column(name: "create_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "dia_pago", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "dia_revision", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "fecha_pago", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "fecha_recepcion_cxc", type: "date")

            column(name: "fecha_revision", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "fecha_revision_cxc", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "operador", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "plazo", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "reprogramar_pago", type: "date")

            column(name: "revisada", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "revision", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "socio_id", type: "VARCHAR(255)")

            column(name: "sw2", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "update_user", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "vencimiento", type: "date") {
                constraints(nullable: "false")
            }

            column(name: "vencimiento_factura", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-115") {
        createTable(tableName: "venta_det") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cantidad", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "comentario", type: "VARCHAR(255)")

            column(name: "con_vale", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "cortado", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "descto_original", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_cortes", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_descuento", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "importe_neto", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "inventario_id", type: "VARCHAR(255)")

            column(name: "kilos", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "nacional", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "precio", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_lista", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "precio_original", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "producto_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "subtotal", type: "DECIMAL(19, 2)") {
                constraints(nullable: "false")
            }

            column(name: "sucursal_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "sw2", type: "VARCHAR(255)")

            column(name: "venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "partidas_idx", type: "INT")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-116") {
        createTable(tableName: "venta_ine") {
            column(name: "id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cfdi_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "contabilidad", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "tipo_de_comite", type: "VARCHAR(255)")

            column(name: "tipo_de_proceso", type: "VARCHAR(255)")

            column(name: "venta_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-117") {
        addPrimaryKey(columnNames: "id", constraintName: "abono_cxpPK", tableName: "abono_cxp")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-118") {
        addPrimaryKey(columnNames: "id", constraintName: "acusePK", tableName: "acuse")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-119") {
        addPrimaryKey(columnNames: "id", constraintName: "alcancePK", tableName: "alcance")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-120") {
        addPrimaryKey(columnNames: "id", constraintName: "analisis_de_facturaPK", tableName: "analisis_de_factura")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-121") {
        addPrimaryKey(columnNames: "id", constraintName: "analisis_de_factura_detPK", tableName: "analisis_de_factura_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-122") {
        addPrimaryKey(columnNames: "id", constraintName: "analisis_devolucion_compraPK", tableName: "analisis_devolucion_compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-123") {
        addPrimaryKey(columnNames: "id", constraintName: "aplicacion_cxpPK", tableName: "aplicacion_cxp")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-124") {
        addPrimaryKey(columnNames: "id", constraintName: "aplicacion_de_cobroPK", tableName: "aplicacion_de_cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-125") {
        addPrimaryKey(columnNames: "id", constraintName: "autorizacionPK", tableName: "autorizacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-126") {
        addPrimaryKey(columnNames: "id", constraintName: "bancoPK", tableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-127") {
        addPrimaryKey(columnNames: "id", constraintName: "banco_satPK", tableName: "banco_sat")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-128") {
        addPrimaryKey(columnNames: "id", constraintName: "cancelacion_cfdiPK", tableName: "cancelacion_cfdi")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-129") {
        addPrimaryKey(columnNames: "id", constraintName: "cfdiPK", tableName: "cfdi")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-130") {
        addPrimaryKey(columnNames: "id", constraintName: "chequePK", tableName: "cheque")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-131") {
        addPrimaryKey(columnNames: "id", constraintName: "cheque_devueltoPK", tableName: "cheque_devuelto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-132") {
        addPrimaryKey(columnNames: "id", constraintName: "choferPK", tableName: "chofer")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-133") {
        addPrimaryKey(columnNames: "id", constraintName: "clasePK", tableName: "clase")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-134") {
        addPrimaryKey(columnNames: "id", constraintName: "clientePK", tableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-135") {
        addPrimaryKey(columnNames: "id", constraintName: "cliente_contactosPK", tableName: "cliente_contactos")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-136") {
        addPrimaryKey(columnNames: "id", constraintName: "cliente_creditoPK", tableName: "cliente_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-137") {
        addPrimaryKey(columnNames: "id", constraintName: "cobradorPK", tableName: "cobrador")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-138") {
        addPrimaryKey(columnNames: "id", constraintName: "cobroPK", tableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-139") {
        addPrimaryKey(columnNames: "id", constraintName: "cobro_chequePK", tableName: "cobro_cheque")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-140") {
        addPrimaryKey(columnNames: "id", constraintName: "cobro_depositoPK", tableName: "cobro_deposito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-141") {
        addPrimaryKey(columnNames: "id", constraintName: "cobro_tarjetaPK", tableName: "cobro_tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-142") {
        addPrimaryKey(columnNames: "id", constraintName: "cobro_transferenciaPK", tableName: "cobro_transferencia")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-143") {
        addPrimaryKey(columnNames: "id", constraintName: "comision_bancariaPK", tableName: "comision_bancaria")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-144") {
        addPrimaryKey(columnNames: "id", constraintName: "compraPK", tableName: "compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-145") {
        addPrimaryKey(columnNames: "id", constraintName: "compra_detPK", tableName: "compra_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-146") {
        addPrimaryKey(columnNames: "id", constraintName: "comprobante_fiscalPK", tableName: "comprobante_fiscal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-147") {
        addPrimaryKey(columnNames: "id", constraintName: "comunicacion_empresaPK", tableName: "comunicacion_empresa")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-148") {
        addPrimaryKey(columnNames: "id", constraintName: "concepto_de_gastoPK", tableName: "concepto_de_gasto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-149") {
        addPrimaryKey(columnNames: "id", constraintName: "condicion_de_envioPK", tableName: "condicion_de_envio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-150") {
        addPrimaryKey(columnNames: "id", constraintName: "contra_reciboPK", tableName: "contra_recibo")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-151") {
        addPrimaryKey(columnNames: "id", constraintName: "corte_de_tarjetaPK", tableName: "corte_de_tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-152") {
        addPrimaryKey(columnNames: "id", constraintName: "corte_de_tarjeta_aplicacionPK", tableName: "corte_de_tarjeta_aplicacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-153") {
        addPrimaryKey(columnNames: "id", constraintName: "corte_de_tarjeta_detPK", tableName: "corte_de_tarjeta_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-154") {
        addPrimaryKey(columnNames: "id", constraintName: "cuenta_bancariaPK", tableName: "cuenta_bancaria")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-155") {
        addPrimaryKey(columnNames: "id", constraintName: "cuenta_contablePK", tableName: "cuenta_contable")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-156") {
        addPrimaryKey(columnNames: "id", constraintName: "cuenta_de_bancoPK", tableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-157") {
        addPrimaryKey(columnNames: "id", constraintName: "cuenta_por_cobrarPK", tableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-158") {
        addPrimaryKey(columnNames: "id", constraintName: "cuenta_por_pagarPK", tableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-159") {
        addPrimaryKey(columnNames: "id", constraintName: "cuenta_satPK", tableName: "cuenta_sat")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-160") {
        addPrimaryKey(columnNames: "id", constraintName: "devolucion_clientePK", tableName: "devolucion_cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-161") {
        addPrimaryKey(columnNames: "id", constraintName: "devolucion_de_compraPK", tableName: "devolucion_de_compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-162") {
        addPrimaryKey(columnNames: "id", constraintName: "devolucion_de_compra_detPK", tableName: "devolucion_de_compra_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-163") {
        addPrimaryKey(columnNames: "id", constraintName: "devolucion_de_ventaPK", tableName: "devolucion_de_venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-164") {
        addPrimaryKey(columnNames: "id", constraintName: "devolucion_de_venta_detPK", tableName: "devolucion_de_venta_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-165") {
        addPrimaryKey(columnNames: "id", constraintName: "diferencia_cambiariaPK", tableName: "diferencia_cambiaria")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-166") {
        addPrimaryKey(columnNames: "id", constraintName: "empresaPK", tableName: "empresa")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-167") {
        addPrimaryKey(columnNames: "id", constraintName: "existenciaPK", tableName: "existencia")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-168") {
        addPrimaryKey(columnNames: "id", constraintName: "fichaPK", tableName: "ficha")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-169") {
        addPrimaryKey(columnNames: "id", constraintName: "ficha_detPK", tableName: "ficha_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-170") {
        addPrimaryKey(columnNames: "id", constraintName: "folioPK", tableName: "folio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-171") {
        addPrimaryKey(columnNames: "id", constraintName: "gastoPK", tableName: "gasto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-172") {
        addPrimaryKey(columnNames: "id", constraintName: "ine_entidadPK", tableName: "ine_entidad")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-173") {
        addPrimaryKey(columnNames: "id", constraintName: "instruccion_cortePK", tableName: "instruccion_corte")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-174") {
        addPrimaryKey(columnNames: "id", constraintName: "inventarioPK", tableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-175") {
        addPrimaryKey(columnNames: "id", constraintName: "lineaPK", tableName: "linea")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-176") {
        addPrimaryKey(columnNames: "id", constraintName: "lista_de_precios_por_proveedorPK", tableName: "lista_de_precios_por_proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-177") {
        addPrimaryKey(columnNames: "id", constraintName: "lista_de_precios_por_proveedor_detPK", tableName: "lista_de_precios_por_proveedor_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-178") {
        addPrimaryKey(columnNames: "id", constraintName: "lista_de_precios_ventaPK", tableName: "lista_de_precios_venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-179") {
        addPrimaryKey(columnNames: "id", constraintName: "lista_de_precios_venta_detPK", tableName: "lista_de_precios_venta_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-180") {
        addPrimaryKey(columnNames: "id", constraintName: "marcaPK", tableName: "marca")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-181") {
        addPrimaryKey(columnNames: "id", constraintName: "movimiento_de_almacenPK", tableName: "movimiento_de_almacen")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-182") {
        addPrimaryKey(columnNames: "id", constraintName: "movimiento_de_almacen_detPK", tableName: "movimiento_de_almacen_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-183") {
        addPrimaryKey(columnNames: "id", constraintName: "movimiento_de_cuentaPK", tableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-184") {
        addPrimaryKey(columnNames: "id", constraintName: "movimiento_de_tesoreriaPK", tableName: "movimiento_de_tesoreria")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-185") {
        addPrimaryKey(columnNames: "id", constraintName: "nota_de_cargoPK", tableName: "nota_de_cargo")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-186") {
        addPrimaryKey(columnNames: "id", constraintName: "nota_de_cargo_detPK", tableName: "nota_de_cargo_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-187") {
        addPrimaryKey(columnNames: "id", constraintName: "nota_de_creditoPK", tableName: "nota_de_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-188") {
        addPrimaryKey(columnNames: "id", constraintName: "nota_de_credito_detPK", tableName: "nota_de_credito_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-189") {
        addPrimaryKey(columnNames: "id", constraintName: "otros_productosPK", tableName: "otros_productos")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-190") {
        addPrimaryKey(columnNames: "id", constraintName: "polizaPK", tableName: "poliza")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-191") {
        addPrimaryKey(columnNames: "id", constraintName: "poliza_detPK", tableName: "poliza_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-192") {
        addPrimaryKey(columnNames: "id", constraintName: "poliza_folioPK", tableName: "poliza_folio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-193") {
        addPrimaryKey(columnNames: "id", constraintName: "productoPK", tableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-194") {
        addPrimaryKey(columnNames: "id", constraintName: "producto_servicioPK", tableName: "producto_servicio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-195") {
        addPrimaryKey(columnNames: "id", constraintName: "proveedorPK", tableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-196") {
        addPrimaryKey(columnNames: "id", constraintName: "proveedor_comprasPK", tableName: "proveedor_compras")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-197") {
        addPrimaryKey(columnNames: "id", constraintName: "proveedor_comunicacion_empresaPK", tableName: "proveedor_comunicacion_empresa")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-198") {
        addPrimaryKey(columnNames: "id", constraintName: "proveedor_contactosPK", tableName: "proveedor_contactos")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-199") {
        addPrimaryKey(columnNames: "id", constraintName: "proveedor_de_fletePK", tableName: "proveedor_de_flete")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-200") {
        addPrimaryKey(columnNames: "id", constraintName: "proveedor_productoPK", tableName: "proveedor_producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-201") {
        addPrimaryKey(columnNames: "id", constraintName: "recepcion_de_compraPK", tableName: "recepcion_de_compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-202") {
        addPrimaryKey(columnNames: "id", constraintName: "recepcion_de_compra_detPK", tableName: "recepcion_de_compra_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-203") {
        addPrimaryKey(columnNames: "id", constraintName: "requisicionPK", tableName: "requisicion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-204") {
        addPrimaryKey(columnNames: "id", constraintName: "requisicion_detPK", tableName: "requisicion_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-205") {
        addPrimaryKey(columnNames: "id", constraintName: "saldo_por_cuenta_de_bancoPK", tableName: "saldo_por_cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-206") {
        addPrimaryKey(columnNames: "id", constraintName: "sat_bancoPK", tableName: "sat_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-207") {
        addPrimaryKey(columnNames: "id", constraintName: "sat_cuentaPK", tableName: "sat_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-208") {
        addPrimaryKey(columnNames: "id", constraintName: "socioPK", tableName: "socio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-209") {
        addPrimaryKey(columnNames: "id", constraintName: "solicitud_de_depositoPK", tableName: "solicitud_de_deposito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-210") {
        addPrimaryKey(columnNames: "id", constraintName: "solicitud_de_trasladoPK", tableName: "solicitud_de_traslado")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-211") {
        addPrimaryKey(columnNames: "id", constraintName: "solicitud_de_traslado_detPK", tableName: "solicitud_de_traslado_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-212") {
        addPrimaryKey(columnNames: "id", constraintName: "sub_tipo_de_polizaPK", tableName: "sub_tipo_de_poliza")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-213") {
        addPrimaryKey(columnNames: "id", constraintName: "sucursalPK", tableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-214") {
        addPrimaryKey(columnNames: "id", constraintName: "tarjetaPK", tableName: "tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-215") {
        addPrimaryKey(columnNames: "id", constraintName: "transformacionPK", tableName: "transformacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-216") {
        addPrimaryKey(columnNames: "id", constraintName: "transformacion_detPK", tableName: "transformacion_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-217") {
        addPrimaryKey(columnNames: "id", constraintName: "trasladoPK", tableName: "traslado")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-218") {
        addPrimaryKey(columnNames: "id", constraintName: "traslado_detPK", tableName: "traslado_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-219") {
        addPrimaryKey(columnNames: "id", constraintName: "traspasoPK", tableName: "traspaso")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-220") {
        addPrimaryKey(columnNames: "user_id, role_id", constraintName: "user_rolePK", tableName: "user_role")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-221") {
        addPrimaryKey(columnNames: "id", constraintName: "vendedorPK", tableName: "vendedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-222") {
        addPrimaryKey(columnNames: "id", constraintName: "ventaPK", tableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-223") {
        addPrimaryKey(columnNames: "id", constraintName: "venta_anticipoPK", tableName: "venta_anticipo")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-224") {
        addPrimaryKey(columnNames: "id", constraintName: "venta_canceladaPK", tableName: "venta_cancelada")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-225") {
        addPrimaryKey(columnNames: "id", constraintName: "venta_creditoPK", tableName: "venta_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-226") {
        addPrimaryKey(columnNames: "id", constraintName: "venta_detPK", tableName: "venta_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-227") {
        addPrimaryKey(columnNames: "id", constraintName: "venta_inePK", tableName: "venta_ine")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-228") {
        addUniqueConstraint(columnNames: "comprobante_id", constraintName: "UC_ABONO_CXPCOMPROBANTE_ID_COL", tableName: "abono_cxp")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-229") {
        addUniqueConstraint(columnNames: "uuid", constraintName: "UC_ACUSEUUID_COL", tableName: "acuse")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-230") {
        addUniqueConstraint(columnNames: "nombre", constraintName: "UC_BANCONOMBRE_COL", tableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-231") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_BANCO_SATCLAVE_COL", tableName: "banco_sat")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-232") {
        addUniqueConstraint(columnNames: "uuid", constraintName: "UC_CFDIUUID_COL", tableName: "cfdi")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-233") {
        addUniqueConstraint(columnNames: "clase", constraintName: "UC_CLASECLASE_COL", tableName: "clase")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-234") {
        addUniqueConstraint(columnNames: "sw2", constraintName: "UC_COBROSW2_COL", tableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-235") {
        addUniqueConstraint(columnNames: "uuid", constraintName: "UC_COMPROBANTE_FISCALUUID_COL", tableName: "comprobante_fiscal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-236") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_CUENTA_CONTABLECLAVE_COL", tableName: "cuenta_contable")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-237") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_CUENTA_DE_BANCOCLAVE_COL", tableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-238") {
        addUniqueConstraint(columnNames: "uuid", constraintName: "UC_CUENTA_POR_COBRARUUID_COL", tableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-239") {
        addUniqueConstraint(columnNames: "comprobante_id", constraintName: "UC_CUENTA_POR_PAGARCOMPROBANTE_ID_COL", tableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-240") {
        addUniqueConstraint(columnNames: "codigo", constraintName: "UC_CUENTA_SATCODIGO_COL", tableName: "cuenta_sat")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-241") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_EMPRESACLAVE_COL", tableName: "empresa")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-242") {
        addUniqueConstraint(columnNames: "nombre", constraintName: "UC_EMPRESANOMBRE_COL", tableName: "empresa")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-243") {
        addUniqueConstraint(columnNames: "linea", constraintName: "UC_LINEALINEA_COL", tableName: "linea")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-244") {
        addUniqueConstraint(columnNames: "folio", constraintName: "UC_LISTA_DE_PRECIOS_VENTAFOLIO_COL", tableName: "lista_de_precios_venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-245") {
        addUniqueConstraint(columnNames: "marca", constraintName: "UC_MARCAMARCA_COL", tableName: "marca")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-246") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_PROVEEDORCLAVE_COL", tableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-247") {
        addUniqueConstraint(columnNames: "nombre", constraintName: "UC_PROVEEDORNOMBRE_COL", tableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-248") {
        addUniqueConstraint(columnNames: "authority", constraintName: "UC_ROLEAUTHORITY_COL", tableName: "role")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-249") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_SAT_BANCOCLAVE_COL", tableName: "sat_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-250") {
        addUniqueConstraint(columnNames: "codigo", constraintName: "UC_SAT_CUENTACODIGO_COL", tableName: "sat_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-251") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_SUB_TIPO_DE_POLIZACLAVE_COL", tableName: "sub_tipo_de_poliza")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-252") {
        addUniqueConstraint(columnNames: "clave", constraintName: "UC_SUCURSALCLAVE_COL", tableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-253") {
        addUniqueConstraint(columnNames: "nombre", constraintName: "UC_SUCURSALNOMBRE_COL", tableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-254") {
        addUniqueConstraint(columnNames: "username", constraintName: "UC_USERUSERNAME_COL", tableName: "user")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-255") {
        addUniqueConstraint(columnNames: "serie, folio", constraintName: "UK1896eb6e1663b0c10481a7158d1b", tableName: "nota_de_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-256") {
        addUniqueConstraint(columnNames: "mes, ejercicio, cuenta_id", constraintName: "UK2c9624a8c7f60a82bb8882ae5f3c", tableName: "saldo_por_cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-257") {
        addUniqueConstraint(columnNames: "serie, entidad, folio", constraintName: "UK41c5c95adf8381dfc4604f2c63e2", tableName: "folio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-258") {
        addUniqueConstraint(columnNames: "subtipo, mes, ejercicio, folio", constraintName: "UKa6fa0cd9b4618151cdeb9fb5b5f4", tableName: "poliza")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-259") {
        addUniqueConstraint(columnNames: "ejercicio, mes, sub_tipo, folio", constraintName: "UKe2ade972cd1918f1207b2c799afe", tableName: "poliza_folio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-260") {
        addUniqueConstraint(columnNames: "sucursal_id, folio", constraintName: "UKeadda55b4dd94744b4f5efb2969c", tableName: "compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-261") {
        createIndex(indexName: "ABONO_CXP_IDX1", tableName: "abono_cxp") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-262") {
        createIndex(indexName: "ALC_SUCURSAL_IDX", tableName: "alcance") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-263") {
        createIndex(indexName: "ANALISIS_IDX1", tableName: "analisis_de_factura") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-264") {
        createIndex(indexName: "AUT_IDX1", tableName: "autorizacion") {
            column(name: "fecha_de_autorizacion")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-265") {
        createIndex(indexName: "AUT_IDX2", tableName: "autorizacion") {
            column(name: "solicito")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-266") {
        createIndex(indexName: "AUT_IDX3", tableName: "autorizacion") {
            column(name: "autorizo")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-267") {
        createIndex(indexName: "CHEQUE_IDX3", tableName: "cheque_devuelto") {
            column(name: "cliente_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-268") {
        createIndex(indexName: "COBRO_IDX1", tableName: "cobro") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-269") {
        createIndex(indexName: "COBRO_IDX2", tableName: "cobro") {
            column(name: "cliente_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-270") {
        createIndex(indexName: "COBRO_IDX3", tableName: "cobro") {
            column(name: "forma_de_pago")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-271") {
        createIndex(indexName: "COBRO_TRANS_IDX1", tableName: "cobro_deposito") {
            column(name: "fecha_deposito")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-272") {
        createIndex(indexName: "COBRO_TRANS_IDX1", tableName: "cobro_transferencia") {
            column(name: "fecha_deposito")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-273") {
        createIndex(indexName: "COMPRA_IDX1", tableName: "compra") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-274") {
        createIndex(indexName: "COMPRA_IDX2", tableName: "compra") {
            column(name: "folio")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-275") {
        createIndex(indexName: "CRIBO_IDX1", tableName: "contra_recibo") {
            column(name: "fecha")

            column(name: "proveedor_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-276") {
        createIndex(indexName: "CXC_IDX1", tableName: "cuenta_por_cobrar") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-277") {
        createIndex(indexName: "CXC_IDX3", tableName: "cuenta_por_cobrar") {
            column(name: "cliente_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-278") {
        createIndex(indexName: "CXP_APLICACION_IDX1", tableName: "aplicacion_cxp") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-279") {
        createIndex(indexName: "CXP_IDX2", tableName: "cuenta_por_pagar") {
            column(name: "fecha")

            column(name: "vencimiento")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-280") {
        createIndex(indexName: "DEVOLUCION_IDX3", tableName: "devolucion_cliente") {
            column(name: "cliente_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-281") {
        createIndex(indexName: "FECHA_IDX", tableName: "devolucion_de_compra") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-282") {
        createIndex(indexName: "FECHA_IDX", tableName: "devolucion_de_venta") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-283") {
        createIndex(indexName: "FECHA_IDX", tableName: "inventario") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-284") {
        createIndex(indexName: "FECHA_IDX", tableName: "movimiento_de_almacen") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-285") {
        createIndex(indexName: "FECHA_IDX", tableName: "solicitud_de_traslado") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-286") {
        createIndex(indexName: "FECHA_IDX", tableName: "transformacion") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-287") {
        createIndex(indexName: "FECHA_IDX", tableName: "traslado") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-288") {
        createIndex(indexName: "FICHA_IDX1", tableName: "ficha") {
            column(name: "fecha")

            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-289") {
        createIndex(indexName: "LPV_DET_IDX1", tableName: "lista_de_precios_venta") {
            column(name: "aplicada")

            column(name: "inicio")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-290") {
        createIndex(indexName: "MES_IDX", tableName: "existencia") {
            column(name: "mes")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-291") {
        createIndex(indexName: "MOV_CTA_IDX1", tableName: "movimiento_de_cuenta") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-292") {
        createIndex(indexName: "MOV_CTA_IDX2", tableName: "movimiento_de_cuenta") {
            column(name: "afavor")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-293") {
        createIndex(indexName: "MOV_CTA_IDX3", tableName: "movimiento_de_cuenta") {
            column(name: "forma_de_pago")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-294") {
        createIndex(indexName: "NCARGO_IDX3", tableName: "nota_de_cargo") {
            column(name: "cliente_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-295") {
        createIndex(indexName: "PRODUCTO_IDX", tableName: "devolucion_de_venta_det") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-296") {
        createIndex(indexName: "PRODUCTO_IDX", tableName: "inventario") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-297") {
        createIndex(indexName: "PRODUCTO_IDX", tableName: "movimiento_de_almacen_det") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-298") {
        createIndex(indexName: "PRODUCTO_IDX", tableName: "solicitud_de_traslado_det") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-299") {
        createIndex(indexName: "PRODUCTO_IDX", tableName: "transformacion_det") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-300") {
        createIndex(indexName: "PRODUCTO_IDX", tableName: "traslado_det") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-301") {
        createIndex(indexName: "PROVEEDOR_ID", tableName: "devolucion_de_compra") {
            column(name: "proveedor_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-302") {
        createIndex(indexName: "RECOMPRA_IDX1", tableName: "recepcion_de_compra") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-303") {
        createIndex(indexName: "REQ_IDX1", tableName: "requisicion") {
            column(name: "afavor")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-304") {
        createIndex(indexName: "REQ_IDX2", tableName: "requisicion") {
            column(name: "fecha_de_pago")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-305") {
        createIndex(indexName: "REQ_IDX3", tableName: "requisicion") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-306") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "devolucion_de_compra") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-307") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "devolucion_de_venta") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-308") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "existencia") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-309") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "inventario") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-310") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "movimiento_de_almacen") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-311") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "transformacion") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-312") {
        createIndex(indexName: "SUCURSAL_IDX", tableName: "traslado") {
            column(name: "sucursal_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-313") {
        createIndex(indexName: "VENTACANCELADA_IDX1", tableName: "venta_cancelada") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-314") {
        createIndex(indexName: "VENTACRE_IDX1", tableName: "venta_credito") {
            column(name: "fecha_recepcion_cxc")

            column(name: "fecha_revision")

            column(name: "fecha_revision_cxc")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-315") {
        createIndex(indexName: "VENTACRE_IDX2", tableName: "venta_credito") {
            column(name: "fecha_pago")

            column(name: "vencimiento")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-316") {
        createIndex(indexName: "VENTADET_IDX2", tableName: "venta_det") {
            column(name: "producto_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-317") {
        createIndex(indexName: "VENTA_IDX1", tableName: "venta") {
            column(name: "fecha")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-318") {
        createIndex(indexName: "VENTA_IDX3", tableName: "venta") {
            column(name: "cliente_id")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-319") {
        createIndex(indexName: "YEAR_IDX", tableName: "existencia") {
            column(name: "anio")
        }
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-320") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "cliente_contactos", constraintName: "FK18nmd6nkwrft6x9sjnnq14931", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-321") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "cuenta_por_cobrar", constraintName: "FK1f5khqv6voh4c82t3m1gejjwh", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-322") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "cuenta_bancaria", constraintName: "FK1glau61vtdmqeeuauk2hs814q", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-323") {
        addForeignKeyConstraint(baseColumnNames: "compra_id", baseTableName: "recepcion_de_compra", constraintName: "FK1n6f2fmdsp3bgv215ov189psx", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-324") {
        addForeignKeyConstraint(baseColumnNames: "ingreso_id", baseTableName: "corte_de_tarjeta_aplicacion", constraintName: "FK1nemwk56sebjl4q8foe89rlxr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-325") {
        addForeignKeyConstraint(baseColumnNames: "solicitud_de_traslado_id", baseTableName: "solicitud_de_traslado_det", constraintName: "FK1ssrunktexeqoateb1f5e3bde", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "solicitud_de_traslado")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-326") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "contra_recibo", constraintName: "FK1wiioi86j54fgq07va9edgqm", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-327") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_venta_id", baseTableName: "venta", constraintName: "FK21yn1iwcebd05m9onsodafuev", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-328") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "aplicacion_de_cobro", constraintName: "FK24mc7qd29lpyd8mw0b623si7u", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-329") {
        addForeignKeyConstraint(baseColumnNames: "producto_servicio_id", baseTableName: "concepto_de_gasto", constraintName: "FK2dbkc8v8poq0t8q6b6smubcug", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto_servicio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-330") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_pagar_id", baseTableName: "contra_recibo_cuenta_por_pagar", constraintName: "FK2e0me9t3ws9gng7wcryl1s68", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-331") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "inventario", constraintName: "FK2jpmjsxwl42blfea24vda6fs6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-332") {
        addForeignKeyConstraint(baseColumnNames: "gasto_id", baseTableName: "concepto_de_gasto", constraintName: "FK2rb6s7f86k3yg3217ahgglwvc", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "gasto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-333") {
        addForeignKeyConstraint(baseColumnNames: "socio_id", baseTableName: "venta_credito", constraintName: "FK2w4qlo8gdbw8ijnufdpd9365", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "socio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-334") {
        addForeignKeyConstraint(baseColumnNames: "comprobante_id", baseTableName: "cuenta_por_pagar", constraintName: "FK3cmfpec0nlg5t396qopwg4e0j", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "comprobante_fiscal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-335") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "movimiento_de_almacen_det", constraintName: "FK3edox6pds3gvouewqmt3n5iv1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-336") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "devolucion_de_compra", constraintName: "FK3mp6c1gjdlrnp2aqv0p49c8l6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-337") {
        addForeignKeyConstraint(baseColumnNames: "nota_de_credito_id", baseTableName: "aplicacion_de_cobro", constraintName: "FK3mr6qf9ac4xcwrmr3nm8heuwv", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "nota_de_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-338") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "cobro_tarjeta", constraintName: "FK3omq39p9xyj6ho5imnd67184d", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-339") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "ficha", constraintName: "FK3ptne130y9x7yc977qoj8vaqp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-340") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "compra", constraintName: "FK3sl07ywhdqtoav3dlpf6qlvi2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-341") {
        addForeignKeyConstraint(baseColumnNames: "devolucion_de_compra_id", baseTableName: "devolucion_de_compra_det", constraintName: "FK3wwuug5u3yr3ex46k8cxvxhqu", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "devolucion_de_compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-342") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "devolucion_cliente", constraintName: "FK3xptl0ju4fsl355s6617ipohu", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-343") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "devolucion_de_compra_det", constraintName: "FK40ib9rp7gdjl5u3ny5aleb88w", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-344") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_origen_id", baseTableName: "traspaso", constraintName: "FK4476x0rlo5r1xknm7inv38tt0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-345") {
        addForeignKeyConstraint(baseColumnNames: "corte_id", baseTableName: "corte_de_tarjeta_det", constraintName: "FK4bcsq6afs07py0n09i3te8k1e", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "corte_de_tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-346") {
        addForeignKeyConstraint(baseColumnNames: "autorizacion_id", baseTableName: "requisicion", constraintName: "FK4o589s6d05m6qn59g6ew28ftd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "autorizacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-347") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "corte_de_tarjeta", constraintName: "FK4ra94wwy30hd401hy429nc3hw", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-348") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "compra", constraintName: "FK5rv6m306dgdn4cn14eyhpexwu", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-349") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "nota_de_credito_det", constraintName: "FK5w2qvr6g2kn2v62x00491qpp2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-350") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "cliente", constraintName: "FK6hhdnjhs8h4c30f77lcug51xi", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-351") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "cobro", constraintName: "FK6ldivykrrysfvmpiy4ysksj9k", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-352") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "venta_det", constraintName: "FK6pvck1mei2vpl004oa6375dbr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-353") {
        addForeignKeyConstraint(baseColumnNames: "banco_origen_id", baseTableName: "cobro_cheque", constraintName: "FK6uy7sbom53ygi3f52xn5qq3v8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-354") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "transformacion_det", constraintName: "FK6x1fuv3gnbeu7v82lekhxphxs", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-355") {
        addForeignKeyConstraint(baseColumnNames: "ficha_id", baseTableName: "ficha_det", constraintName: "FK708wseprhuqhen0b9itbqd23m", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "ficha")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-356") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "proveedor_producto", constraintName: "FK78jycb5jwcjrwokq8fcbjnpw8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-357") {
        addForeignKeyConstraint(baseColumnNames: "vendedor_id", baseTableName: "socio", constraintName: "FK7bcjxc3whx0882r4kq6k8y66o", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "vendedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-358") {
        addForeignKeyConstraint(baseColumnNames: "analisis_id", baseTableName: "analisis_de_factura_det", constraintName: "FK7hqwwwie7c8xnkmqwxjkdryfp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "analisis_de_factura")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-359") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "devolucion_de_compra_det", constraintName: "FK80w94pk4yenbl5b759pguim5l", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-360") {
        addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK859n2jvi8ivhui0rl0esws6o", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-361") {
        addForeignKeyConstraint(baseColumnNames: "marca_id", baseTableName: "producto", constraintName: "FK868tnrt85f21kgcvt9bftgr8r", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "marca")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-362") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "lista_de_precios_por_proveedor", constraintName: "FK8puu4ghsegh14cp7xn07o16yu", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-363") {
        addForeignKeyConstraint(baseColumnNames: "cfdi_id", baseTableName: "nota_de_credito", constraintName: "FK8r05ta189iqnclh2b2g5n73al", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "comprobante_fiscal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-364") {
        addForeignKeyConstraint(baseColumnNames: "cxp_id", baseTableName: "aplicacion_cxp", constraintName: "FK8xdy4n7immksrsnc3q3eis1vc", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-365") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "cobro_cheque", constraintName: "FK92xcaobu6btfu61fsk64ji40q", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-366") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "venta_det", constraintName: "FK98i65tknlhsdcjyvnl4ogi6ul", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-367") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "venta_cancelada", constraintName: "FK99h7449g4r30siyke6uoj5ugo", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-368") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "compra_det", constraintName: "FK9cm59b41ck65ayvh2dhsgb84q", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-369") {
        addForeignKeyConstraint(baseColumnNames: "banco_id", baseTableName: "cuenta_de_banco", constraintName: "FK9h30038s8esfvy2h5jx4pxp6x", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-370") {
        addForeignKeyConstraint(baseColumnNames: "banco_origen_id", baseTableName: "cobro_transferencia", constraintName: "FK9oo7l2q6ri1bmf59c7tw28adg", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-371") {
        addForeignKeyConstraint(baseColumnNames: "movimiento_de_cuenta_id", baseTableName: "comision_bancaria_movimiento_de_cuenta", constraintName: "FK9p3q53gprn811cdytuu82iutt", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-372") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_de_banco_id", baseTableName: "ficha", constraintName: "FK9q9dso8s53kldv0f6hgllj237", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-373") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "requisicion", constraintName: "FK9qpywh78jy05ipal85py107vn", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-374") {
        addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FKa68196081fvovjhkek5m97n3y", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-375") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "venta", constraintName: "FKa7yaj59nfh3gft0h38o5bv472", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-376") {
        addForeignKeyConstraint(baseColumnNames: "lista_id", baseTableName: "lista_de_precios_venta_det", constraintName: "FKade8vl86gw81t6i0ofax1gjdy", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "lista_de_precios_venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-377") {
        addForeignKeyConstraint(baseColumnNames: "recepcion_id", baseTableName: "recepcion_de_compra_det", constraintName: "FKai8o8nbethxpgobcuuaxno4f8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recepcion_de_compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-378") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_destino_id", baseTableName: "cobro_deposito", constraintName: "FKakm6fyyjb4yk68yhq7tk8vuuj", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-379") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "devolucion_cliente", constraintName: "FKap4wuge15ds8ls2jl3gfsarjg", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-380") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_favorito_id", baseTableName: "producto", constraintName: "FKau5a7gg5vi714rgpckvo0iyu5", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-381") {
        addForeignKeyConstraint(baseColumnNames: "cfdi_id", baseTableName: "venta_ine", constraintName: "FKb5xh3w7nad70xa8q8a515mmqa", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cfdi")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-382") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "cheque_devuelto", constraintName: "FKb9qrxo7s6y6250o1glfpe28jk", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-383") {
        addForeignKeyConstraint(baseColumnNames: "autorizacion_id", baseTableName: "nota_de_credito", constraintName: "FKbafgiginbc9yrpj38pgkrgd1w", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "autorizacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-384") {
        addForeignKeyConstraint(baseColumnNames: "egreso_id", baseTableName: "cheque", constraintName: "FKbb7lwb9tjg5yaget7oddh11xs", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-385") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "recepcion_de_compra_det", constraintName: "FKblssumjw4la4096qalfrf0kic", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-386") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "traslado", constraintName: "FKbx2fhkqitje2i12vgml2m05eo", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-387") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "recepcion_de_compra_det", constraintName: "FKbxxsaissevsdm2dgux2uipx3n", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-388") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "venta_credito", constraintName: "FKc27mo9p6xkged74nv06613jrx", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-389") {
        addForeignKeyConstraint(baseColumnNames: "traslado_id", baseTableName: "traslado_det", constraintName: "FKcdbg7p4nrm70jfppcbnedr3v7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "traslado")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-390") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_vale_id", baseTableName: "venta", constraintName: "FKcfqtfegonnxoce1ryp3hlqgk4", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-391") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "solicitud_de_deposito", constraintName: "FKcgjsh9hvxun4l04s4gnu9m1d9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-392") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_de_banco_id", baseTableName: "corte_de_tarjeta", constraintName: "FKckck1ulojfna6t05urdquifgf", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-393") {
        addForeignKeyConstraint(baseColumnNames: "compra_id", baseTableName: "compra_det", constraintName: "FKco2wob2pgkrshskjbtb2g6oyx", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-394") {
        addForeignKeyConstraint(baseColumnNames: "cfdi_id", baseTableName: "cuenta_por_cobrar", constraintName: "FKcvv6u1uydjs9jscfcvloe5ph2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cfdi")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-395") {
        addForeignKeyConstraint(baseColumnNames: "comprobante_id", baseTableName: "abono_cxp", constraintName: "FKd02ky579ve4sd7ciijclje3er", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "comprobante_fiscal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-396") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "proveedor_producto", constraintName: "FKd2m12d4vydmdop7y1gqd5ndmj", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-397") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "venta_anticipo", constraintName: "FKd493yd238n2shicrco05max65", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-398") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "nota_de_cargo", constraintName: "FKd82yo1r10kdv702vlq51qg9ay", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-399") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_id", baseTableName: "solicitud_de_deposito", constraintName: "FKd9xqts7vsqupakf7mcqs3twvl", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-400") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "proveedor_contactos", constraintName: "FKdba5toledcnjg5hy2ash9td47", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-401") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "inventario", constraintName: "FKdhn4c9hhwayu1vmcbamfv96xs", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-402") {
        addForeignKeyConstraint(baseColumnNames: "devolucion_de_venta_id", baseTableName: "devolucion_de_venta_det", constraintName: "FKdj46w82b6ufr4lsai9yi0iiyq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "devolucion_de_venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-403") {
        addForeignKeyConstraint(baseColumnNames: "comision_bancaria_movimientos_id", baseTableName: "comision_bancaria_movimiento_de_cuenta", constraintName: "FKe3yr46mlsqlotgwvd0f790m6l", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "comision_bancaria")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-404") {
        addForeignKeyConstraint(baseColumnNames: "compra_det_id", baseTableName: "recepcion_de_compra_det", constraintName: "FKehm5ki1bffwfre9sesrjwki4r", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "compra_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-405") {
        addForeignKeyConstraint(baseColumnNames: "cxp_id", baseTableName: "gasto", constraintName: "FKejci6v6t5usn6e32neplcbevd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-406") {
        addForeignKeyConstraint(baseColumnNames: "transformacion_id", baseTableName: "transformacion_det", constraintName: "FKeob4rgquhfnnfhmbop2bn0jcw", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "transformacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-407") {
        addForeignKeyConstraint(baseColumnNames: "ingreso_id", baseTableName: "cobro_transferencia", constraintName: "FKep41bbehmu84meglo90n03s0j", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-408") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "concepto_de_gasto", constraintName: "FKeqhlxedldei2ap2ilxr16tqre", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-409") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "proveedor_comunicacion_empresa", constraintName: "FKexsgml1s6ra3tnp2ig8ylo73j", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-410") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "lista_de_precios_venta_det", constraintName: "FKf1wfw4fkiiuupboqxyqhn8gvu", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-411") {
        addForeignKeyConstraint(baseColumnNames: "ingreso_id", baseTableName: "ficha", constraintName: "FKf612il9bqga4r77hrbantwqo7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-412") {
        addForeignKeyConstraint(baseColumnNames: "devolucion_id", baseTableName: "cheque", constraintName: "FKf6a1v3rafw87gkyg5nuna8qwh", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-413") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "alcance", constraintName: "FKf77siv2i5btg1mfn72lxhfcg6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-414") {
        addForeignKeyConstraint(baseColumnNames: "corte_de_tarjeta_id", baseTableName: "corte_de_tarjeta_aplicacion", constraintName: "FKfe2yny3a9rbrjlgj29153qmw6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "corte_de_tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-415") {
        addForeignKeyConstraint(baseColumnNames: "requisicion_id", baseTableName: "requisicion_det", constraintName: "FKfhx1xollkll8yhwb7ohco9kvb", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "requisicion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-416") {
        addForeignKeyConstraint(baseColumnNames: "ingreso_id", baseTableName: "cobro_deposito", constraintName: "FKfobju2gvubrjiwhnir5ry56t9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-417") {
        addForeignKeyConstraint(baseColumnNames: "autorizacion_id", baseTableName: "transformacion", constraintName: "FKfodv0gjahpbjp56vtp9hbjja9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "autorizacion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-418") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "venta_ine", constraintName: "FKfphd3fr96jn83p7ibbssfxbdn", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-419") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "nota_de_credito", constraintName: "FKfs1qaewh7stvda0bgwss3cf07", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-420") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "venta", constraintName: "FKft9dnqbkhlcp943swksx6l352", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-421") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "traslado", constraintName: "FKg6lwixc00j4mhox7hh3f17eu7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-422") {
        addForeignKeyConstraint(baseColumnNames: "lista_id", baseTableName: "lista_de_precios_por_proveedor_det", constraintName: "FKgg38n0nef9vwvmdrebkh5lh23", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "lista_de_precios_por_proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-423") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "devolucion_cliente", constraintName: "FKgh68au52a88pmf2858a6ro4od", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-424") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "nota_de_cargo_det", constraintName: "FKghbswl7rsrid0n8cgsrsbac7q", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-425") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "solicitud_de_deposito", constraintName: "FKgiy0j4s0ykypx0njclif362p7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-426") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "traslado_det", constraintName: "FKgwsmes74h6h3cxd39qb5vbe34", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-427") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "existencia", constraintName: "FKgxrljnqd2x79yu9txkksfq456", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-428") {
        addForeignKeyConstraint(baseColumnNames: "venta_det_id", baseTableName: "devolucion_de_venta_det", constraintName: "FKgyj4cdx8yyr6abl4y0bx0msl0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-429") {
        addForeignKeyConstraint(baseColumnNames: "cheque_id", baseTableName: "cheque_devuelto", constraintName: "FKh27fq7w70bv7gb47jj7noo65e", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro_cheque")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-430") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "recepcion_de_compra", constraintName: "FKh2rhsi1n8xudyqqoqtwpxvrdx", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-431") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "cobro", constraintName: "FKh8t4mxg2shlrwahsgfmtko3bq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-432") {
        addForeignKeyConstraint(baseColumnNames: "vendedor_id", baseTableName: "cliente", constraintName: "FKhewilppvtrncti9mupmlppm61", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "vendedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-433") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "corte_de_tarjeta_det", constraintName: "FKi39fj96kp8yfir48wlap5gob5", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-434") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "ficha_det", constraintName: "FKib3iap9iu6904h33xjiolth43", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-435") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "cuenta_por_pagar", constraintName: "FKibv1pfiedayd3s3hb07mv1mr6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-436") {
        addForeignKeyConstraint(baseColumnNames: "chofer_id", baseTableName: "traslado", constraintName: "FKibwtkd5ljajx6c1gb8klk4blu", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "chofer")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-437") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_destino_id", baseTableName: "cobro_transferencia", constraintName: "FKiehtsreq8at7wg20kuki5rgy6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-438") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "solicitud_de_traslado_det", constraintName: "FKigukbr1s21qwrb3tyye1kfbqd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-439") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "venta_det", constraintName: "FKil9etbuyr5177c8qil48lrno7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-440") {
        addForeignKeyConstraint(baseColumnNames: "comprobante_fiscal_id", baseTableName: "acuse", constraintName: "FKipd4wsk20qtlsk0lfriclnlem", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "comprobante_fiscal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-441") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "solicitud_de_traslado", constraintName: "FKiq83jyssrq2s5o3exnqr35jak", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-442") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "comunicacion_empresa", constraintName: "FKitfg9lvb2lmlvvy9579udol4y", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-443") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "traslado_det", constraintName: "FKiuc9fnmtvj7xkt9kvvx8891e0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-444") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "compra_det", constraintName: "FKj3udl15jh04bijfb1vyatwedp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-445") {
        addForeignKeyConstraint(baseColumnNames: "cxp_id", baseTableName: "requisicion_det", constraintName: "FKja8l2opyyk5sh70ku0u2n5te8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-446") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "movimiento_de_almacen_det", constraintName: "FKjhcrvhqqr7wsv8tlnjmtil70u", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-447") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_id", baseTableName: "saldo_por_cuenta_de_banco", constraintName: "FKjik37344tmyq0aeice7yjr43r", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-448") {
        addForeignKeyConstraint(baseColumnNames: "egreso_id", baseTableName: "abono_cxp", constraintName: "FKjorwx51oi74jl9tl19qlwtfoj", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-449") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_atiende_id", baseTableName: "solicitud_de_traslado", constraintName: "FKjpdxbvc5l1hc8cb049jt7pi1e", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-450") {
        addForeignKeyConstraint(baseColumnNames: "cobrador_id", baseTableName: "venta_credito", constraintName: "FKjywtpb3aexguf7uchvk1lxri0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobrador")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-451") {
        addForeignKeyConstraint(baseColumnNames: "nota_id", baseTableName: "nota_de_credito_det", constraintName: "FKk0dtiy96f50ycvxxbd48q7a49", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "nota_de_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-452") {
        addForeignKeyConstraint(baseColumnNames: "clase_id", baseTableName: "producto", constraintName: "FKk1w0arquk4r96cmn87vh7k5vx", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "clase")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-453") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "abono_cxp", constraintName: "FKk414poxdrdr6ya8yisp9hik5a", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-454") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "devolucion_de_venta", constraintName: "FKk6htyaj0x2ge6fjwdvn896tb9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-455") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "nota_de_credito", constraintName: "FKkf8s7q639t4c4nfxs16ftsswk", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-456") {
        addForeignKeyConstraint(baseColumnNames: "cxp_id", baseTableName: "comision_bancaria", constraintName: "FKkx110r14wvwpky1a7vpa6uoks", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-457") {
        addForeignKeyConstraint(baseColumnNames: "banco_sat_id", baseTableName: "banco", constraintName: "FKl3vl0cfj047dr7f6hf7wwi5i9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "banco_sat")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-458") {
        addForeignKeyConstraint(baseColumnNames: "banco_origen_id", baseTableName: "cobro_deposito", constraintName: "FKlcb2p3nb1h3bvfw14mu3y95on", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-459") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "socio", constraintName: "FKleyfm2flp35gsx11dbv795hss", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-460") {
        addForeignKeyConstraint(baseColumnNames: "nota_de_credito_id", baseTableName: "devolucion_de_venta", constraintName: "FKlgbgi4f9wyy7yt1ed8lxa7vlk", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "nota_de_credito")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-461") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "recepcion_de_compra", constraintName: "FKlhfmob120vuo8bloxwxngpjtj", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-462") {
        addForeignKeyConstraint(baseColumnNames: "analisis_devolucion_id", baseTableName: "devolucion_de_compra_det", constraintName: "FKloghnuq7y3rcnvdesk6d9r516", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "analisis_devolucion_compra")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-463") {
        addForeignKeyConstraint(baseColumnNames: "corte_id", baseTableName: "corte_de_tarjeta_aplicacion", constraintName: "FKlqauy0lsdmoqlcvcjhhkv672q", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "corte_de_tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-464") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "nota_de_cargo", constraintName: "FKm2us23hwdt7rbavlgq8wm2ek2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-465") {
        addForeignKeyConstraint(baseColumnNames: "movimiento_de_almacen_id", baseTableName: "movimiento_de_almacen_det", constraintName: "FKm9gy76h8oiwgt70nm8pdn7qh7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_almacen")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-466") {
        addForeignKeyConstraint(baseColumnNames: "poliza_id", baseTableName: "poliza_det", constraintName: "FKmecx7jpbhf1b3cvhifir82a8v", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "poliza")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-467") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "diferencia_cambiaria", constraintName: "FKmpaiw2x7jv0e8gkjmunkb38yt", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-468") {
        addForeignKeyConstraint(baseColumnNames: "factura_id", baseTableName: "analisis_de_factura", constraintName: "FKmv8i2gxqyxmaraavlm45ds4no", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_pagar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-469") {
        addForeignKeyConstraint(baseColumnNames: "abono_id", baseTableName: "aplicacion_cxp", constraintName: "FKmvbndjjdvrqs2jwhw0p06xhmd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "abono_cxp")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-470") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "cobro_transferencia", constraintName: "FKmvgy46qb9oscugxvx0mkchv8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-471") {
        addForeignKeyConstraint(baseColumnNames: "proveedor_id", baseTableName: "proveedor_compras", constraintName: "FKn1djkbup83eji9exrimnb0o11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "proveedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-472") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "venta_det", constraintName: "FKn3nhixdyntjq8jmcclldps7u3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-473") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "devolucion_de_venta", constraintName: "FKn67p5pe2fv1x8mev5pu9mrf1e", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-474") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_destino_id", baseTableName: "traspaso", constraintName: "FKn76t9nlnsx1bp241g33ac7tjq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-475") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "solicitud_de_deposito", constraintName: "FKnb1fsd2akkch4hwaj8vu07xj1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-476") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "lista_de_precios_por_proveedor_det", constraintName: "FKnl19x8c7j7e936ci4ey9rad2f", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-477") {
        addForeignKeyConstraint(baseColumnNames: "ficha_id", baseTableName: "cobro_cheque", constraintName: "FKnmf7fdep3wwkc20vn8ova5xyt", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "ficha")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-478") {
        addForeignKeyConstraint(baseColumnNames: "corte_de_tarjeta_id", baseTableName: "cobro_tarjeta", constraintName: "FKo66gp0a8y6r7w6c29qak5k0a", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "corte_de_tarjeta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-479") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "alcance", constraintName: "FKo6fhq6nod5tjiq737ot26iv1u", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-480") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "otros_productos", constraintName: "FKo9gurpo43emh4lfvhuchnc16j", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-481") {
        addForeignKeyConstraint(baseColumnNames: "traspaso_movimientos_id", baseTableName: "traspaso_movimiento_de_cuenta", constraintName: "FKoh4e37xcmosdbhbhb1rl8wb76", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "traspaso")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-482") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "aplicacion_de_cobro", constraintName: "FKolkxp6jshglbe5i9i5ncimyrw", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-483") {
        addForeignKeyConstraint(baseColumnNames: "requisicion_id", baseTableName: "abono_cxp", constraintName: "FKosv9v5oqjmnjvdcp0ruqkjmrs", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "requisicion")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-484") {
        addForeignKeyConstraint(baseColumnNames: "venta_det_id", baseTableName: "instruccion_corte", constraintName: "FKovugr33mre5s2hmupqkdx7gjy", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-485") {
        addForeignKeyConstraint(baseColumnNames: "banco_id", baseTableName: "solicitud_de_deposito", constraintName: "FKp0ulx50np2q89bir2nj1m6x92", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-486") {
        addForeignKeyConstraint(baseColumnNames: "destino_id", baseTableName: "transformacion_det", constraintName: "FKp7ohne69ge6it9fp4gry943mk", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "transformacion_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-487") {
        addForeignKeyConstraint(baseColumnNames: "nota_id", baseTableName: "nota_de_cargo_det", constraintName: "FKp8qxj5ysctjh9ua033iqcwlud", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "nota_de_cargo")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-488") {
        addForeignKeyConstraint(baseColumnNames: "linea_id", baseTableName: "producto", constraintName: "FKp9mg960e99epe6nnfn34ijqh3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "linea")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-489") {
        addForeignKeyConstraint(baseColumnNames: "solicitud_de_traslado_id", baseTableName: "traslado", constraintName: "FKpkpmhrlmkk2m1x451a5u2jx4u", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "solicitud_de_traslado")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-490") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "cuenta_por_cobrar", constraintName: "FKpq20md35onwx92t8ex4eif62q", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-491") {
        addForeignKeyConstraint(baseColumnNames: "padre_id", baseTableName: "cuenta_contable", constraintName: "FKpvy2cg2butb5gybkdqgfuvfum", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_contable")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-492") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "diferencia_cambiaria", constraintName: "FKq3oaipi91tpjaqbgx2hl0f21g", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-493") {
        addForeignKeyConstraint(baseColumnNames: "movimiento_de_cuenta_id", baseTableName: "traspaso_movimiento_de_cuenta", constraintName: "FKqbvb07tlh283pmieu5fct501m", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "movimiento_de_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-494") {
        addForeignKeyConstraint(baseColumnNames: "venta_id", baseTableName: "transformacion", constraintName: "FKqcr3rpplfdm4w0bo8n63otrd0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-495") {
        addForeignKeyConstraint(baseColumnNames: "complementoine_id", baseTableName: "ine_entidad", constraintName: "FKqe6dk2h9611jtxjbmjnioe9kq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "venta_ine")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-496") {
        addForeignKeyConstraint(baseColumnNames: "compra_det_id", baseTableName: "devolucion_de_compra_det", constraintName: "FKqjk2ecarun3v21u3o7bkgl7d8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "compra_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-497") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "transformacion", constraintName: "FKqowrbk7qeucmipcs7n3e0xh6k", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-498") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "existencia", constraintName: "FKqpreil0hp2io5068eb0xpufi9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-499") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "devolucion_de_compra", constraintName: "FKr0s7wpb0a8mii6m00fat4chjr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-500") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_id", baseTableName: "poliza_det", constraintName: "FKr3935k1v3yo8vix6xrnqtdi6i", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_contable")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-501") {
        addForeignKeyConstraint(baseColumnNames: "inventario_id", baseTableName: "devolucion_de_venta_det", constraintName: "FKr4l25s5kdj1diiedjlh877ain", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "inventario")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-502") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_id", baseTableName: "movimiento_de_cuenta", constraintName: "FKr5c3inoyutneg23wdj5qbc79n", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-503") {
        addForeignKeyConstraint(baseColumnNames: "entrada_id", baseTableName: "analisis_de_factura_det", constraintName: "FKr80pbq3x4o17vu9a4yl6ei5yk", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recepcion_de_compra_det")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-504") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_id", baseTableName: "comision_bancaria", constraintName: "FKr9r1pymxkeiuk15r9qkin08ut", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_de_banco")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-505") {
        addForeignKeyConstraint(baseColumnNames: "nota_cxp_id", baseTableName: "devolucion_de_compra", constraintName: "FKraklhmrbccmqk15qoyyd0swu3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "abono_cxp")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-506") {
        addForeignKeyConstraint(baseColumnNames: "socio_id", baseTableName: "cliente_credito", constraintName: "FKrgnxrjrxxki25lku2vgylc5dk", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "socio")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-507") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "transformacion_det", constraintName: "FKrpbbe6eh2wa5hmuev6fpl5ef4", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-508") {
        addForeignKeyConstraint(baseColumnNames: "cliente_id", baseTableName: "cliente_credito", constraintName: "FKrwpf0a9g227obv913cl0x8t61", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cliente")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-509") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "devolucion_de_venta_det", constraintName: "FKs2s2idik5bv90bbm0d7ilx9og", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-510") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "cheque_devuelto", constraintName: "FKsfefntmopc6fcaqlugsu6ioks", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-511") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_solicita_id", baseTableName: "solicitud_de_traslado", constraintName: "FKsgpnfq91owc46f7fm62nvmdlf", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-512") {
        addForeignKeyConstraint(baseColumnNames: "sucursal_id", baseTableName: "movimiento_de_almacen", constraintName: "FKsj0s0yldqjabdcnooirlrkidb", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sucursal")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-513") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_sat_id", baseTableName: "cuenta_contable", constraintName: "FKso6njef5iege4rq5ccqaq1hog", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sat_cuenta")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-514") {
        addForeignKeyConstraint(baseColumnNames: "vendedor_id", baseTableName: "venta", constraintName: "FKsr0rod3g9vfdle64ypjgbyajr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "vendedor")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-515") {
        addForeignKeyConstraint(baseColumnNames: "producto_id", baseTableName: "lista_de_precios_venta_det", constraintName: "FKsvdgsiq25i8kx8rxbw3dv4ede", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "producto")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-516") {
        addForeignKeyConstraint(baseColumnNames: "cobro_id", baseTableName: "cobro_deposito", constraintName: "FKsx4vllj1pbf7mgssfegga5ox6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobro")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-517") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "cheque_devuelto", constraintName: "FKt4gv8uyjmvg5i3os70ll75w8p", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-518") {
        addForeignKeyConstraint(baseColumnNames: "cuenta_por_cobrar_id", baseTableName: "venta", constraintName: "FKteaaltmjo128rbqjkgueir214", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cuenta_por_cobrar")
    }

    changeSet(author: "rcancino (generated)", id: "1501963400865-519") {
        addForeignKeyConstraint(baseColumnNames: "cobrador_id", baseTableName: "cliente_credito", constraintName: "FKtosdup90k8ntm14o1snjc34r3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cobrador")
    }
}
