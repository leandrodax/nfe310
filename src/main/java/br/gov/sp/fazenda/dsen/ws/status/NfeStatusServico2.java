/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.status;

import br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeStatusServico2
extends Service {
    public String getNfeStatusServico2Soap12Address();

    public NfeStatusServico2Soap getNfeStatusServico2Soap12() throws ServiceException;

    public NfeStatusServico2Soap getNfeStatusServico2Soap12(URL var1) throws ServiceException;
}

