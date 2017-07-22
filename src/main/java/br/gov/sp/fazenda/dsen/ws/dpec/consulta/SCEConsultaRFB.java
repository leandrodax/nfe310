/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFB
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.sp.fazenda.dsen.ws.dpec.consulta;

import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SCEConsultaRFB
extends Service {
    public String getSCEConsultaRFBSoap12Address();

    public SCEConsultaRFBSoap getSCEConsultaRFBSoap12() throws ServiceException;

    public SCEConsultaRFBSoap getSCEConsultaRFBSoap12(URL var1) throws ServiceException;
}

