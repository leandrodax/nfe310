/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.recepcao;

import br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeRecepcao2
extends Service {
    public String getNfeRecepcao2Soap12Address();

    public NfeRecepcao2Soap getNfeRecepcao2Soap12() throws ServiceException;

    public NfeRecepcao2Soap getNfeRecepcao2Soap12(URL var1) throws ServiceException;
}

