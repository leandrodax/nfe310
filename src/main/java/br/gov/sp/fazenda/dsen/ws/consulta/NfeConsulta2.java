/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.consulta;

import br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeConsulta2
extends Service {
    public String getNfeConsulta2Soap12Address();

    public NfeConsulta2Soap getNfeConsulta2Soap12() throws ServiceException;

    public NfeConsulta2Soap getNfeConsulta2Soap12(URL var1) throws ServiceException;
}

