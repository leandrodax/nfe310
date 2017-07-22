/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENPropertiesEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.enumeration.DSENPropertiesEnum;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DSENProperties {
    private static String a;
    private static DSENProperties a;

    private DSENProperties() {
    }

    protected ResourceBundle getProperties() {
        return ResourceBundle.getBundle(a);
    }

    public static synchronized DSENProperties getInstance() {
        return a;
    }

    public final String getAplicativoTipoAmbiente() {
        return this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_TIPO_AMBIENTE.toString());
    }

    public final String getAplicativoVersao() {
        return this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_VERSAO.toString());
    }

    public final String getAplicativoData() {
        return this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_DATA.toString());
    }

    public final String getAplicativoLabelAviso() {
        return this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_LABEL_AVISO.toString());
    }

    public final String getAplicativoLabelVersaoTeste() {
        return this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_LABEL_VERSAO_TESTE.toString());
    }

    public final String getArquivoSefazUrl() {
        return this.getProperties().getString(DSENPropertiesEnum.ARQUIVO_SEFAZURL.toString());
    }

    public final String getArquivoTrustStore() {
        return this.getProperties().getString(DSENPropertiesEnum.ARQUIVO_TRUSTSTORE.toString());
    }

    public final String getArquivoDatabaseName() {
        return this.getProperties().getString(DSENPropertiesEnum.ARQUIVO_DATABASE_NAME.toString());
    }

    public final String getArquivoDatabaseProperties() {
        return this.getProperties().getString(DSENPropertiesEnum.ARQUIVO_DATABASE_PROPERTIES.toString());
    }

    public final String getArquivoUF() {
        return this.getProperties().getString(DSENPropertiesEnum.ARQUIVO_UF.toString());
    }

    public final String getAplicativoWindowTitle() {
        return MessageFormat.format(this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_WINDOW_TITLE.toString()), this.getAplicativoVersao());
    }

    public final String getAplicativoRelatorioMsg() {
        return this.getProperties().getString(DSENPropertiesEnum.APLICATIVO_RELATORIO_MSG.toString());
    }

    public final String getVersaoSchemaCancelamento() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CANCELAMENTO.toString());
    }

    public final String getVersaoSchemaCancelamentoEvento() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CANCELAMENTO_EVENTO.toString());
    }

    public final String getVersaoSchemaCabecalho() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CABEC_MSG.toString());
    }

    public final String getVersaoSchemaConsultaSituacao() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CONS_SITUACAO.toString());
    }

    public final String getVersaoSchemaStatusServico() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CONS_STAT_SERV.toString());
    }

    public final String getVersaoSchemaInutilizacao() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_INUTILIZACAO.toString());
    }

    public final String getVersaoSchemaConsRecibo() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CONS_RECIBO.toString());
    }

    public final String getVersaoSchemaEnviNFe() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_ENVI_NFE.toString());
    }

    public final String getVersaoSchema() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA.toString());
    }

    public final String getVersaoSchemaSistema() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_SISTEMA.toString());
    }

    public final String getVersaoSchemaConsultaCadastro() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CONS_CAD.toString());
    }

    public final String getReportConfigPath() {
        return this.getProperties().getString(DSENPropertiesEnum.REPORT_CONFIG_PATH.toString());
    }

    public final String getVersaoSchemaDpec() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_DPEC.toString());
    }

    public final String getDpecUrlEnvio() {
        return this.getProperties().getString(DSENPropertiesEnum.DPEC_URL_ENVIO.toString());
    }

    public final String getDpecUrlConsulta() {
        return this.getProperties().getString(DSENPropertiesEnum.DPEC_URL_CONSULTA.toString());
    }

    public final String getVersaoSchemaEventos() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_EVENTOS.toString());
    }

    public final String getVersaoSchemaCartaCorrecao() {
        return this.getProperties().getString(DSENPropertiesEnum.VERSAO_SCHEMA_CARTA_CORRECAO.toString());
    }

    static {
        a = new DSENProperties();
        a = "producao".equals(System.getProperty("jnlp.ambiente")) ? "dsen_producao" : ("homologacao".equals(System.getProperty("jnlp.ambiente")) ? "dsen_homologacao" : "dsen");
    }
}

