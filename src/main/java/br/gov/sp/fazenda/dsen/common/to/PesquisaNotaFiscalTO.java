/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaNotaFiscalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaNotaFiscalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PesquisaNotaFiscalTO
extends PesquisaBaseTO {
    private static final long a = 749775460852852144L;
    private Date a;
    private Date b;
    private List<SituacaoNFeEnum> a;
    private TipoEmissaoEnum a;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ChaveAcessoTO a;
    private Boolean a;
    private Boolean b;

    public Map getPesquisaEnumerationMap() {
        TreeMap<FiltroPesquisaNotaFiscalEnum, String> map = new TreeMap<FiltroPesquisaNotaFiscalEnum, String>();
        map.put(FiltroPesquisaNotaFiscalEnum.DATA_INI, DateHelper.formataDataHora((Date)this.getDataIni(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
        map.put(FiltroPesquisaNotaFiscalEnum.DATA_FIM, DateHelper.formataDataHora((Date)this.getDataFim(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
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
        map.put(FiltroPesquisaNotaFiscalEnum.ID_SITUACAO_NF, situacoes);
        map.put(FiltroPesquisaNotaFiscalEnum.ID_TIPO_EMISSSAO_NF, (this.getIdTipoEmissaoNf() == null ? null : "" + this.getIdTipoEmissaoNf().ordinal() + ""));
        map.put(FiltroPesquisaNotaFiscalEnum.SERIE, this.getSerie() == null ? null : this.getSerie());
        map.put(FiltroPesquisaNotaFiscalEnum.NUM_FIM, this.getNumFim() == null ? null : this.getNumFim());
        map.put(FiltroPesquisaNotaFiscalEnum.NUM_INI, this.getNumIni() == null ? null : this.getNumIni());
        map.put(FiltroPesquisaNotaFiscalEnum.DOCUMENTO_DEST, this.getDocumentoDest());
        map.put(FiltroPesquisaNotaFiscalEnum.UF_DEST, this.getUfDest());
        map.put(FiltroPesquisaNotaFiscalEnum.CHAVE_ACESSO, (this.getChaveAcessoTO() == null ? null : ChaveAcessoUtil.gerarChaveAcesso((ChaveAcessoTO)this.getChaveAcessoTO())));
        map.put(FiltroPesquisaNotaFiscalEnum.DANFE_IMPRESSO, (this.getComDanfeImpresso() == null ? null : this.getComDanfeImpresso().toString()));
        map.put(FiltroPesquisaNotaFiscalEnum.AUTORIZADA_EXPORTADA, (this.getAutorizadaExportada() == null ? null : this.getAutorizadaExportada().toString()));
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

    public String getSerie() {
        return this.a;
    }

    public void setSerie(String serie) {
        this.a = serie;
    }

    public String getNumIni() {
        return this.b;
    }

    public void setNumIni(String numIni) {
        this.b = numIni;
    }

    public String getNumFim() {
        return this.c;
    }

    public void setNumFim(String numFim) {
        this.c = numFim;
    }

    public String getDocumentoDest() {
        return this.d;
    }

    public void setDocumentoDest(String documentoDest) {
        this.d = documentoDest;
    }

    public String getUfDest() {
        return this.e;
    }

    public void setUfDest(String ufDest) {
        this.e = ufDest;
    }

    public ChaveAcessoTO getChaveAcessoTO() {
        return this.a;
    }

    public void setChaveAcessoTO(ChaveAcessoTO chaveAcessoTO) {
        this.a = chaveAcessoTO;
    }

    public Boolean getComDanfeImpresso() {
        return this.a;
    }

    public void setComDanfeImpresso(Boolean comDanfeImpresso) {
        this.a = comDanfeImpresso;
    }

    public Boolean getAutorizadaExportada() {
        return this.b;
    }

    public void setAutorizadaExportada(Boolean autorizadaExportada) {
        this.b = autorizadaExportada;
    }
}

