/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsge.common.util.DSGEConstants
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsge.common.util.DSGEConstants;

public abstract class DSENConstants
extends DSGEConstants {
    public static int INTERV_TENT_CONEXAO = 60;
    public static String NFE_CABEB_MSG = "<nfeCabecMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/{0}\"><cUF>{1}</cUF><versaoDados>{2}</versaoDados></nfeCabecMsg>";
    public static String AMBIENTE_HOMOLOGACAO = "2";
    public static String AMBIENTE_PRODUCAO = "1";
    public static boolean CONSULTA_STATUS_SERVICO_HABILITADA = false;
    public static String ISENTO = "ISENTO";
    public static String ID_NFE = "NFe";
    public static String ID_CANCELAMENTO = "ID";
    public static String ID_INUTILIZACAO = "ID";
    public static String ID_EVENTO = "ID";
    public static String ID_DPEC = "DPEC";
    public static String NOTA_FISCAL_XML = "NotaFiscalEletronica.xml";
    public static String INUTILIZACAO_XML = "Inutilizacao.xml";
    public static String CANCELAMENTO_XML = "Cancelamento.xml";
    public static String PROTOCOLO_XML = "Protocolo.xml";
    public static String BUSCA_RETORNO_XML = "BuscaRetorno.xml";
    public static String CODIGO_AUTORIZACAO = "100";
    public static String CODIGO_CANCELAMENTO = "101";
    public static String CODIGO_INUTILIZACAO = "102";
    public static String CODIGO_LOTE_RECEBIDO = "103";
    public static String CODIGO_LOTE_PROCESSADO = "104";
    public static String CODIGO_LOTE_EM_PROCESSAMENTO = "105";
    public static String CODIGO_LOTE_NAO_LOCALIZADO = "106";
    public static String CODIGO_SERVICO_OPERACAO = "107";
    public static String CODIGO_PARALIZADO_MOMENTANEAMENTE = "108";
    public static String CODIGO_PARALIZAD_SEM_PREVISAO = "109";
    public static String CODIGO_DENEGADO = "110";
    public static String CODIGO_NAO_CONSTA_SEFAZ = "217";
    public static String CODIGO_NAO_CATALOGADO = "999";
    public static String CODIGO_REJEICAO_DUPLICIDADE = "204";
    public static String CODIGO_SERVICO_EM_PROCESSO_DE_DESATIVACAO = "113";
    public static String CODIGO_SERVICO_PARALISADO_PARA_AQUELA_UF = "114";
    public static String DPEC_RECEBIDO = "124";
    public static String DPEC_LOCALIZADO = "125";
    public static String CONSULTA_CADASTRO_UMA_OCORRENCIA = "111";
    public static String CONSULTA_CADASTRO_MAIS_DE_UMA_OCORRENCIA = "112";
    public static String INVALIDO_XML_CABECALHO = "242";
    public static String XML_CABECALHO_NAO_UTF8 = "299";
    public static String VERSAO_AREA_CABECALHO_SUPERIOR_VERSAO_VIGENTE = "238";
    public static String VERSAO_DADOS_NAO_SUPORTADA = "239";
    public static String INVALIDO_XML_AREA_DADOS = "215";
    public static String INVALIDO_PREFIXO_NAMESPACE = "404";
    public static String XML_DADOS_NAO_UTF8 = "402";
    public static String CODIGO_DENEGADO_EMITENTE = "301";
    public static String CODIGO_DENEGADO_DESTINATARIO = "302";
    public static String CODIGO_LOTE_EVENTO_PROCESSADO = "128";
    public static String CODIGO_EVENTO_REGISTRADO_E_VINCULADO_NFE = "135";
    public static String CODIGO_EVENTO_REGISTRADO_NAO_VINCULADO_NFE = "136";
    public static String CODIGO_AUTORIZADO_FORA_PRAZO = "150";
    public static String CODIGO_CANCELAMENTO_FORA_PRAZO = "151";
    public static String CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO = "155";
    public static String MODELO_NFE = "55";
    public static String MODELO_NFREF = "01";
    public static final String PROC_EMI = "3";
    public static String CNPJ_ZERO = "00000000000000";
    public static String CPF_ZERO = "00000000000";
    public static String IE_ZERO = "00000000000000";
    public static String CEAN_ZERO = "00000000";
    public static String CODIGO_MUNICIPIO_AP_MACAPA = "1600303";
    public static String CODIGO_MUNICIPIO_AP_SANTANA = "1600600";
    public static String MAX_NNF_NOTA_FISCAL = "999999999";
    public static String CD_MUNICIPIO_EXTERIOR = "9999999";
    public static String SEPARADOR_ARQ_TXT = "|";
    public static final int MAXIMO_BYTES_NOTA_FISCAL = 512000;
    public static final int MAXIMO_BYTES_DPEC = 51200;
    public static final int NUMERO_BYTES_ASSINATURA_NOTA_FISCAL = 2939;
    public static final int MAXIMO_NOTAS_FISCAIS_DPEC = 50;
    public static final int MAXIMO_BYTES_LOTE = 512000;
    public static final int MAX_IMPORTACAO_XML_SIZE = 1048576;
    public static final int MAX_IMPORTACAO_TXT_SIZE = 2097152;
    public static String NAMESPACE_SAX = "http://xml.org/sax/features/namespaces";
    public static String NFE_VERSION_PROPERTY_NAME = "nfe.version";
    public static int MAX_TENTATIVAS_SENHA_A3 = 2;
    public static String XSL_NOTA_FISCAL_LAYOUT = "/resources/layoutNotaFiscal_v{0}.xslt";
    public static String XSL_NOTA_FISCAL_LAYOUT_WINDOWS = "/resources/layoutNotaFiscal_Windows_v{0}.xslt";
    public static String XML_NOTA_FISCAL_LAYOUT = "/resources/layoutNotaFiscal_v{0}.xml";
    public static String XML_CLIENTE_LAYOUT = "/resources/layoutCliente_v{0}.xml";
    public static String XML_EMITENTE_LAYOUT = "/resources/layoutEmitente_v{0}.xml";
    public static String XML_PRODUTO_LAYOUT = "/resources/layoutProduto_v{0}.xml";
    public static String XML_TRANSPORTADORA_LAYOUT = "/resources/layoutTransportadora_v{0}.xml";
    public static final String BRASIL = new String("1058");
    public static final String SIGLA_DF = "DF";
    public static final String TSTRING_REGULAR_EXPRESSION = "[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}";
    public static int MAX_REBOQUES_NFE = 5;
    public static int MAX_ADICOES_NFE = 100;
    public static int MAX_DI_NFE = 100;
    public static int MAX_EXPORT_NFE = 500;
    public static int MAX_DUPLICATA_NFE = 120;
    public static final String TAG_CHNFE_CANCELAMENTO = "chNFe";
    public static final String TAG_CHNFE_EVENTO = "chNFe";
    public static final String TAG_PROCCANCNFE = "procCancNFe";
    public static final String TAG_INFNFE = "infNFe";
    public static final String TAG_CDV = "cDV";
    public static final String TAG_NFE = "NFe";
    public static final String TAG_CUF = "cUF";
    public static final String TAG_IDE = "ide";
    public static final String TAG_INUT_XJUST = "xJust";
    public static final String TAG_INUT_NPROT = "nProt";
    public static final String TAG_VNF = "vNF";
    public static final String TAG_ENDEREMIT = "enderEmit";
    public static final String ATTRIB_ID = "Id";
}

