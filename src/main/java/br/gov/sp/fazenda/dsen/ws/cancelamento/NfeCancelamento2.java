/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Soap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.cancelamento;

import br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Soap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NfeCancelamento2
extends Service {
    public String getNfeCancelamento2Soap12Address();

    public NfeCancelamento2Soap getNfeCancelamento2Soap12() throws ServiceException;

    public NfeCancelamento2Soap getNfeCancelamento2Soap12(URL var1) throws ServiceException;
}

