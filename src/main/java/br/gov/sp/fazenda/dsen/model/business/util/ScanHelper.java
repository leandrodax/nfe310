/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.model.business.util.ScanHelper
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 */
package br.gov.sp.fazenda.dsen.model.business.util;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScanHelper {
    private static final int a = 900;

    public Map<TipoEmissaoEnum, List<NotaFiscalTO>> agruparNotaFiscalPorSerie(Collection<NotaFiscalTO> notaFiscalTOList) {
        ArrayList<NotaFiscalTO> scanList = new ArrayList<NotaFiscalTO>();
        ArrayList<NotaFiscalTO> sefazList = new ArrayList<NotaFiscalTO>();
        ArrayList<NotaFiscalTO> scvRsList = new ArrayList<NotaFiscalTO>();
        ArrayList<NotaFiscalTO> svcAnList = new ArrayList<NotaFiscalTO>();
        HashMap<TipoEmissaoEnum, List<NotaFiscalTO>> map = new HashMap<TipoEmissaoEnum, List<NotaFiscalTO>>();
        for (NotaFiscalTO nfeTO : notaFiscalTOList) {
            if (nfeTO.getTipoEmissao() == TipoEmissaoEnum.CONTINGENCIA_SVC_AN) {
                svcAnList.add(nfeTO);
                continue;
            }
            if (nfeTO.getTipoEmissao() == TipoEmissaoEnum.CONTINGENCIA_SVC_RS) {
                scvRsList.add(nfeTO);
                continue;
            }
            if (this.isSefaz(nfeTO)) {
                sefazList.add(nfeTO);
                continue;
            }
            scanList.add(nfeTO);
        }
        map.put(TipoEmissaoEnum.CONTINGENCIA_SCAN, scanList);
        if (svcAnList.size() > 0) {
            map.put(TipoEmissaoEnum.CONTINGENCIA_SVC_AN, svcAnList);
        }
        if (scvRsList.size() > 0) {
            map.put(TipoEmissaoEnum.CONTINGENCIA_SVC_RS, scvRsList);
        }
        map.put(TipoEmissaoEnum.NORMAL, sefazList);
        return map;
    }

    public Map<TipoEmissaoEnum, List<InutilizacaoTO>> agruparInutilizacaoPorSerie(Collection<InutilizacaoTO> notaFiscalTOList) {
        ArrayList<InutilizacaoTO> scanList = new ArrayList<InutilizacaoTO>();
        ArrayList<InutilizacaoTO> sefazList = new ArrayList<InutilizacaoTO>();
        HashMap<TipoEmissaoEnum, List<InutilizacaoTO>> map = new HashMap<TipoEmissaoEnum, List<InutilizacaoTO>>();
        for (InutilizacaoTO inutTO : notaFiscalTOList) {
            if (this.isSefaz(inutTO)) {
                sefazList.add(inutTO);
                continue;
            }
            scanList.add(inutTO);
        }
        map.put(TipoEmissaoEnum.CONTINGENCIA_SCAN, scanList);
        map.put(TipoEmissaoEnum.NORMAL, sefazList);
        return map;
    }

    public boolean isSefaz(NotaFiscalTO notaFiscalTO) {
        int serie = Integer.valueOf(notaFiscalTO.getSerie());
        return serie < 900;
    }

    public boolean isSefaz(InutilizacaoTO inutTO) {
        int serie = Integer.valueOf(inutTO.getSerie());
        return serie < 900;
    }

    public EstadoTO getEstadoTO(EstadoTO emitenteEstadoTO, boolean isSefaz, TipoEmissaoEnum emissaoEnum) {
        EstadoTO estadoTO = emitenteEstadoTO;
        if (emissaoEnum == TipoEmissaoEnum.CONTINGENCIA_SVC_AN) {
            estadoTO = new EstadoTO("99SVCAN", "SVCAN", "SEFAZ Virtual de Conting\u00eancia do Ambi\u00eante Nacional");
        } else if (emissaoEnum == TipoEmissaoEnum.CONTINGENCIA_SVC_RS) {
            estadoTO = new EstadoTO("99SVCRS", "SVCRS", "SEFAZ Virtual de Conting\u00eancia do Rio Grande do Sul");
        } else if (!isSefaz) {
            estadoTO = new EstadoTO("90", "RFB", "Receita Federal do Brasil");
        }
        return estadoTO;
    }
}

