/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.reportdata.RelatorioGerencialDetalheRD
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsen.reportdata;

import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class RelatorioGerencialDetalheRD
implements ReportData {
    public Page getData(Map map, int i, int i0) throws DSGEReportException {
        return null;
    }

    public Collection getData(Map map) throws DSGEReportException {
        System.out.println("(RelatorioGerencialDetalheRD.getData) Inicio");
        System.out.println("(RelatorioGerencialDetalheRD.getData) Situa\u00e7\u00e3o: " + map.get("situacao"));
        List col = null;
        RelatorioNotaFiscalTO relatorio = (RelatorioNotaFiscalTO)map.get("Impressao");
        if (map.get("situacao").equals("Autorizadas")) {
            col = relatorio.getAutorizadas();
        } else if (map.get("situacao").equals("Canceladas")) {
            col = relatorio.getCanceladas();
        } else if (map.get("situacao").equals("Denegadas")) {
            col = relatorio.getDenegadas();
        } else if (map.get("situacao").equals("Rejeitadas")) {
            col = relatorio.getRejeitadas();
        } else if (map.get("situacao").equals("Em Processamento")) {
            col = relatorio.getEmProcessamentoSefaz();
        } else if (map.get("situacao").equals("Problema Transmiss\u00e3o")) {
            col = relatorio.getTransmitidaPendencia();
        } else if (map.get("situacao").equals("Validada")) {
            col = relatorio.getValidada();
        } else if (map.get("situacao").equals("Assinada")) {
            col = relatorio.getAssinada();
        } else if (map.get("situacao").equals("Em Digita\u00e7\u00e3o")) {
            col = relatorio.getEmDigitacao();
        } else if (map.get("situacao").equals("Inutiliza\u00e7\u00e3o")) {
            col = relatorio.getInutilizacao();
        } else {
            throw new DSGEReportException(null, "N\u00e3o ha relat\u00f3rio para a situa\u00e7\u00e3o da nota fiscal");
        }
        System.out.println("(RelatorioGerencialDetalheRD.getData) Col: " + col.size());
        System.out.println("(RelatorioGerencialDetalheRD.getData) Fim");
        return col;
    }
}

