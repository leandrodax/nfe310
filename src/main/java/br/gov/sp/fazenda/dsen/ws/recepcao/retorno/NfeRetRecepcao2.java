/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeRetRecepcao2
 *  br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeRetRecepcao2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.recepcao.retorno;

import br.gov.sp.fazenda.dsen.ws.recepcao.retorno.NfeRetRecepcao2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeRetRecepcao2
extends Service {
    public String getNfeRetRecepcao2Soap12Address();

    public NfeRetRecepcao2Soap getNfeRetRecepcao2Soap12() throws ServiceException;

    public NfeRetRecepcao2Soap getNfeRetRecepcao2Soap12(URL var1) throws ServiceException;
}

