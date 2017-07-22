/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.CertificadoConstants
 */
package br.gov.sp.fazenda.dsge.certif;

public interface CertificadoConstants {
    public static final String ERRO_VERSAO = "A vers\u00e3o do certificado deve ser igual a 3.";
    public static final String ERRO_RESTRICOES_BASICAS = "O emissor do certificado deve ser Entidade Final.";
    public static final String ERRO_NAO_REPUDIO = "N\u00e3o \u00e9 permitido o uso da chave do certificado para assinatura - Certificado deve ser \"N\u00e3o-Rep\u00fadio\".";
    public static final String ERRO_USO_CHAVE_ASSINATURA = "N\u00e3o \u00e9 permitido o uso da chave do certificado para assinatura.";
    public static final String ERRO_PERIODO_INVALIDO = "O per\u00edodo de validade do certificado expirou.";
    public static final String ERRO_NOMES_ALTERNATIVOS_NAO_CONTEM_CNPJ = "Nome alternativo n\u00e3o cont\u00e9m o CNPJ.";
    public static final String ERRO_USO_AVANCADO_CHAVE = "Uso avan\u00e7ado da chave deve ser igual a \"Autentica\u00e7\u00e3o Cliente\"";
    public static final String ERRO_RECUPERAR_CNPJ = "Erro ao recuperar o CNPJ do certificado";
    public static final String ERRO_CNPJ_INVALIDO = "CNPJ-Base consultado difere do CNPJ-Base do Certificado Digital";
    public static final String ERRO_PARSER_CERTIFICADO = "Ocorreu um problema na tentativa de acesso ao certificado. Verifique se o arquivo informado \u00e9 um Certificado v\u00e1lido ou se o arquivo possui permiss\u00e3o de leitura.";
    public static final String ERRO_ASSINATURA = "Ocorreu um problema durante a assinatura";
    public static final String ERRO_SENHA = "Por favor, verifique sua senha.";
    public static final String ERRO_NAO_EXISTE_ASSINATURA = "O documento n\u00e3o est\u00e1 assinado.";
    public static final String ERRO_VALIDACAO_ASSINATURA = "Ocorreu um problema durante a vali\u00e7\u00e3o da assinatura";
    public static final String ERRO_NAO_EXISTE_ARQUIVO = "O arquivo {0} n\u00e3o foi encontrado.";
    public static final String ERRO_ARQUIVO_PERMISSAO_LEITURA = "O arquivo {0} n\u00e3o possui permiss\u00e3o de leitura.";
    public static final String ERRO_NAO_EXITE_BIBLIOTECA = "A biblioteca {0} associada a este Smart Card/Token n\u00e3o foi encontrada.Por favor v\u00e1 no menu Sistema, Certificados e clique em Procurar Dispositivos.";
    public static final String ERRO_BIBLIOTECA_PERMISSAO_LEITURA = "A biblioteca {0} associada a este Smart Card/Token  n\u00e3o possui permiss\u00e3o de leitura.";
    public static final String CERTIFICADO_FALHA_ACESSO_DISPOSITIVO = "Ocorreu um erro ao tentar recuperar o certificado A3 - Verifique se o dispositivo est\u00e1 conectado corretamente.";
    public static final String MSG_NAO_FOI_POSSIVEL_ACESSAR_REPOSITORIO_WINDOWS = "N\u00e3o foi poss\u00edvel acessar o reposit\u00f3rio de Certificados do Windows.";
}

