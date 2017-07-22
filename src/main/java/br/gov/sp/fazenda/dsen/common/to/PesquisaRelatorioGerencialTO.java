/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroRelatorioGerencialEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroRelatorioGerencialEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PesquisaRelatorioGerencialTO
extends PesquisaBaseTO {
    private static final long a = 8852317313893235323L;
    private Date a;
    private Date b;
    private Boolean a;
    private Boolean b;
    private List<SituacaoNFeEnum> a;
    private TipoEmissaoEnum a;

    public Map getPesquisaEnumerationMap() {
        TreeMap<FiltroRelatorioGerencialEnum, String> map = new TreeMap<FiltroRelatorioGerencialEnum, String>();
        map.put(FiltroRelatorioGerencialEnum.DATA_INI, DateHelper.formataData((Date)this.getDataIni()));
        map.put(FiltroRelatorioGerencialEnum.DATA_FIM, DateHelper.formataData((Date)this.getDataFim()));
        map.put(FiltroRelatorioGerencialEnum.CHK_NRO_INUTILIZADO, (this.getChkNroInutilizacao() == null ? null : this.getChkNroInutilizacao().toString()));
        map.put(FiltroRelatorioGerencialEnum.CHK_NOTA_FISCAL, (this.getChkNotaFiscal() == null ? null : this.getChkNotaFiscal().toString()));
        map.put(FiltroRelatorioGerencialEnum.ID_TIPO_EMISSSAO_NF, (this.getIdTipoEmissaoNf() == null ? null : "" + this.getIdTipoEmissaoNf().ordinal() + ""));
        String situacoes = null;
        if (this.getIdSituacaoNf() != null && this.getIdSituacaoNf().size() > 0) {
            situacoes = "";
            for (int i = 0; i < this.a.size(); ++i) {
                SituacaoNFeEnum situacao = (SituacaoNFeEnum)this.a.get(i);
                situacoes = situacoes + situacao.ordinal();
                if (i + 1 >= this.a.size()) continue;
                situacoes = situacoes + ",";
            }
        }
        map.put(FiltroRelatorioGerencialEnum.ID_SITUACAO_NF, situacoes);
        return map;
    }

    public Date getDataIni() {
        return this.a;
    }

    public void setDataIni(Date dataIni) {
        this.a = dataIni;
    }

    public Date getDataFim() {
        return this.b;
    }

    public void setDataFim(Date dataFim) {
        this.b = dataFim;
    }

    public Boolean getChkNotaFiscal() {
        return this.b;
    }

    public void setChkNotaFiscal(Boolean chkNotaFiscal) {
        this.b = chkNotaFiscal;
    }

    public Boolean getChkNroInutilizacao() {
        return this.a;
    }

    public void setChkNroInutilizacao(Boolean chkNroInutilizacao) {
        this.a = chkNroInutilizacao;
    }

    public List<SituacaoNFeEnum> getIdSituacaoNf() {
        return this.a;
    }

    public void setIdSituacaoNf(List<SituacaoNFeEnum> idSituacaoNf) {
        this.a = idSituacaoNf;
    }

    public void setIdSituacaoNf(SituacaoNFeEnum idSituacaoNf) {
        if (idSituacaoNf != null) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.clear();
            this.a.add(idSituacaoNf);
        } else {
            this.a = null;
        }
    }

    public TipoEmissaoEnum getIdTipoEmissaoNf() {
        return this.a;
    }

    public void setIdTipoEmissaoNf(TipoEmissaoEnum idTipoNf) {
        this.a = idTipoNf;
    }
}

