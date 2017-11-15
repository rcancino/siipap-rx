package com.luxsoft.cfdix.v33

import javax.xml.bind.JAXBContext
import java.text.SimpleDateFormat
import org.apache.commons.lang.builder.ToStringStyle
import org.apache.commons.lang.builder.ToStringBuilder


import sx.cfdi.Cfdi
import lx.cfdi.v33.Comprobante
import lx.cfdi.v33.CMoneda

import lx.cfdi.v33.CfdiUtils
import sx.utils.MonedaUtils


class V33CfdiUtils {

	final static SimpleDateFormat CFDI_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

	public static Comprobante toComprobante(Cfdi cfdi){
		JAXBContext context = JAXBContext.newInstance(Comprobante.class)
		def unmarshaller = context.createUnmarshaller()
		Comprobante comprobante = (Comprobante)unmarshaller
			.unmarshal(new ByteArrayInputStream(cfdi.xml))
		return comprobante
	}

	public static getMonedaCode(Currency moneda){
		if(moneda == MonedaUtils.PESOS) 
			return CMoneda.MXN
		else 
			return CMoneda.USD
	}

}