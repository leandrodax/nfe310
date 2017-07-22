/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFB
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.dpec.envio;

import br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SCERecepcaoRFB
extends Service {
    public String getSCERecepcaoRFBSoap12Address();

    public SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12() throws ServiceException;

    public SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12(URL var1) throws ServiceException;
}

