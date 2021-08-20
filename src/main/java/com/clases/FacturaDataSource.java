/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Ariel
 */
public class FacturaDataSource implements JRDataSource{

    private final Object[][] detallesFactura;
    private int index;

    public FacturaDataSource(Object[][] detallesFactura)
    {
        this.detallesFactura = detallesFactura;
        index = -1;
    }


    @Override
    public boolean next() throws JRException {
        index++;
        return (index < detallesFactura.length);
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "Artículo":
                valor = detallesFactura[index][0];
                break;
            case "Precio":
                valor = detallesFactura[index][1];
                break;
            case "Cantidad":
                valor = detallesFactura[index][2];
                break;            
        }
        return valor;
    }

    public static JRDataSource getDataSource(Object[][] detallesFactura)
    {
        return new FacturaDataSource(detallesFactura);
    }
}
