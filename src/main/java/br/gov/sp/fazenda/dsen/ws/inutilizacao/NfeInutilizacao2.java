/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.inutilizacao;

import br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeInutilizacao2
extends Service {
    public String getNfeInutilizacao2Soap12Address();

    public NfeInutilizacao2Soap getNfeInutilizacao2Soap12() throws ServiceException;

    public NfeInutilizacao2Soap getNfeInutilizacao2Soap12(URL var1) throws ServiceException;
}

