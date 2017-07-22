/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEvento
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.evento;

import br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface RecepcaoEvento
extends Service {
    public String getRecepcaoEventoSoap12Address();

    public RecepcaoEventoSoap getRecepcaoEventoSoap12() throws ServiceException;

    public RecepcaoEventoSoap getRecepcaoEventoSoap12(URL var1) throws ServiceException;
}

