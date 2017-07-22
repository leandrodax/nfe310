/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 * Exception performing whole class analysis ignored.
 */
public class ChaveAcessoUtil {
    public static final DecimalFormat DIGITO_FORMAT = new DecimalFormat();
    public static final DecimalFormat DATA_MODELO_FORMAT = new DecimalFormat();
    public static final DecimalFormat SERIE_FORMAT = new DecimalFormat();
    public static final DecimalFormat CODIGO_NUMERICO_FORMAT = new DecimalFormat();
    public static final DecimalFormat CODIGO_NUMERICO_V1_10_FORMAT = new DecimalFormat();
    public static final DecimalFormat NUMERO_NFE_FORMAT = new DecimalFormat();
    public static final DecimalFormat TIPO_EMISSAO_FORMAT = new DecimalFormat();
    public static final DecimalFormat DOCUMENTO_FORMAT = new DecimalFormat();
    public static final int TAMANHO_CHAVE = 44;
    private static int[] a = new int[]{3, 2, 2, 2, 2, 2, 2, 3};

    private ChaveAcessoUtil() {
    }

    public static ChaveAcessoTO obterChaveAcessoTO(String chaveAcesso) throws DSENCommonException {
        if (chaveAcesso == null) {
            ParseException e = new ParseException("Chave Nula!", 0);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        if (chaveAcesso.trim().length() != 44) {
            ParseException e = new ParseException("A Chave de Acesso deve possuir 44 n\u00fameros! Cont\u00e9m apenas " + chaveAcesso.trim().length() + ".", 0);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        if (TipoEmissaoEnum.getEnumPeloCodigo((String)chaveAcesso.substring(34, 35)) == null) {
            return ChaveAcessoUtil.obterChaveAcessoTO_1_10((String)chaveAcesso);
        }
        ChaveAcessoTO chaveAcessoTO = new ChaveAcessoTO();
        try {
            chaveAcessoTO.setCodigoUfEmitente(chaveAcesso.substring(0, 2));
            chaveAcessoTO.setAno(chaveAcesso.substring(2, 4));
            chaveAcessoTO.setMes(chaveAcesso.substring(4, 6));
            chaveAcessoTO.setCnpjEmitente(chaveAcesso.substring(6, 20));
            chaveAcessoTO.setModelo(chaveAcesso.substring(20, 22));
            chaveAcessoTO.setSerie(chaveAcesso.substring(22, 25));
            chaveAcessoTO.setNumeroNFe(chaveAcesso.substring(25, 34));
            chaveAcessoTO.setTipoEmissao(chaveAcesso.substring(34, 35));
            chaveAcessoTO.setCodigoNumerico(chaveAcesso.substring(35, 43));
            chaveAcessoTO.setDigito(chaveAcesso.substring(43, 44));
        }
        catch (NumberFormatException nfe) {
            ParseException e = new ParseException("Chave deve possuir apenas n\u00fameros!", 0);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        return chaveAcessoTO;
    }

    public static ChaveAcessoTO obterChaveAcessoTO_1_10(String chaveAcesso) throws DSENCommonException {
        if (chaveAcesso == null) {
            ParseException e = new ParseException("Chave Nula!", 0);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        if (chaveAcesso.trim().length() != 44) {
            ParseException e = new ParseException("A Chave de Acesso deve possuir 44 n\u00fameros! Cont\u00e9m apenas " + chaveAcesso.trim().length() + ".", 0);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        ChaveAcessoTO chaveAcessoTO = new ChaveAcessoTO();
        try {
            chaveAcessoTO.setCodigoUfEmitente(chaveAcesso.substring(0, 2));
            chaveAcessoTO.setAno(chaveAcesso.substring(2, 4));
            chaveAcessoTO.setMes(chaveAcesso.substring(4, 6));
            chaveAcessoTO.setCnpjEmitente(chaveAcesso.substring(6, 20));
            chaveAcessoTO.setModelo(chaveAcesso.substring(20, 22));
            chaveAcessoTO.setSerie(chaveAcesso.substring(22, 25));
            chaveAcessoTO.setNumeroNFe(chaveAcesso.substring(25, 34));
            chaveAcessoTO.setCodigoNumerico(chaveAcesso.substring(34, 43));
            chaveAcessoTO.setDigito(chaveAcesso.substring(43, 44));
        }
        catch (NumberFormatException nfe) {
            ParseException e = new ParseException("Chave deve possuir apenas n\u00fameros!", 0);
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        return chaveAcessoTO;
    }

    public static String gerarChaveAcesso(ChaveAcessoTO chaveAcessoTO) {
        return ChaveAcessoUtil.gerarChaveAcesso((String)chaveAcessoTO.getCodigoUfEmitente(), (String)chaveAcessoTO.getAno(), (String)chaveAcessoTO.getMes(), (String)chaveAcessoTO.getCnpjEmitente(), (String)chaveAcessoTO.getModelo(), (String)chaveAcessoTO.getSerie(), (String)chaveAcessoTO.getNumeroNFe(), (String)chaveAcessoTO.getTipoEmissao(), (String)chaveAcessoTO.getCodigoNumerico(), (String)chaveAcessoTO.getDigito());
    }

    public static boolean validaCamposChaveAcesso(String chaveAcesso, NotaFiscalTO to) {
        ChaveAcessoTO chaveAcessoTO;
        if (chaveAcesso == null || chaveAcesso.length() != 44) {
            to.addError(DSENMessageConstants.CHAVE_ACESSO_DEVE_POSSUIR_44_DIGITOS);
            return false;
        }
        try {
            chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
        }
        catch (DSENCommonException e) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.verificarDigitoChaveAcesso((String)chaveAcesso)) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_DIGITO_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.validaUFChaveAcesso((String)chaveAcessoTO.getCodigoUfEmitente())) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_UF_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.validaAnoChaveAcesso((String)chaveAcessoTO.getAno())) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_ANO_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.validaMesChaveAcesso((String)chaveAcessoTO.getMes())) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_MES_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.validaCNPJChaveAcesso((String)chaveAcessoTO.getCnpjEmitente())) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_CNPJ_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.validaModeloChaveAcesso((String)chaveAcessoTO.getModelo())) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_MODELO_INVALIDO);
            return false;
        }
        if (!ChaveAcessoUtil.validaNumeroNFeChaveAcesso((String)chaveAcessoTO.getNumeroNFe())) {
            to.addError(DSENMessageConstants.MSG_NFE_VALIDACAO_CHAVE_NUMERONF_INVALIDO);
            return false;
        }
        return true;
    }

    public static boolean validaNumeroNFeChaveAcesso(String numeroNFe) {
        if (!StringHelper.isNumeric((String)numeroNFe) || "0".equals(numeroNFe)) {
            return false;
        }
        return true;
    }

    public static boolean validaModeloChaveAcesso(String modelo) {
        if (!StringHelper.isNumeric((String)modelo) || !"55".equals(modelo)) {
            return false;
        }
        return true;
    }

    public static boolean validaCNPJChaveAcesso(String cnpj) {
        if (!StringHelper.isNumeric((String)cnpj)) {
            return false;
        }
        if (!ChaveAcessoUtil.isValidCNPJ((String)cnpj)) {
            return false;
        }
        return true;
    }

    public static boolean validaMesChaveAcesso(String mes) {
        if (!StringHelper.isNumeric((String)mes)) {
            return false;
        }
        if (StringHelper.getInteger((String)mes) == 0 || StringHelper.getInteger((String)mes) > 12) {
            return false;
        }
        return true;
    }

    public static boolean validaAnoChaveAcesso(String ano) {
        if (!StringHelper.isNumeric((String)ano)) {
            return false;
        }
        String teste = DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_YEAR_FORMAT).substring(2, 4);
        if (StringHelper.getInteger((String)ano) < 5 || StringHelper.getInteger((String)ano) > StringHelper.getInteger((String)DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_YEAR_FORMAT).substring(2, 4))) {
            return false;
        }
        return true;
    }

    public static boolean validaUFChaveAcesso(String uf) {
        String[] ufsValidos = new String[]{"11", "12", "13", "14", "15", "16", "17", "21", "22", "23", "24", "25", "26", "27", "28", "29", "31", "32", "33", "35", "41", "42", "43", "50", "51", "52", "53"};
        for (int contUF = 0; contUF < ufsValidos.length; ++contUF) {
            if (!ufsValidos[contUF].equals(uf)) continue;
            return true;
        }
        return false;
    }

    public static boolean verificarDigitoChaveAcesso(String chaveAcesso) {
        if (chaveAcesso == null || chaveAcesso.length() != 44) {
            return false;
        }
        String digito = ChaveAcessoUtil.gerarDigitoChaveAcesso((String)chaveAcesso);
        return digito.equals(chaveAcesso.substring(43));
    }

    public static String gerarChaveAcesso(String ufEmitente, String anoEmissao, String mesEmissao, String documentoEmitente, String modelo, String serie, String numero, String tipoEmissao, String codigoNumerico, String digito) {
        String chaveAcesso = DATA_MODELO_FORMAT.format(Integer.parseInt(ufEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(anoEmissao)) + DATA_MODELO_FORMAT.format(Integer.parseInt(mesEmissao)) + DOCUMENTO_FORMAT.format(Long.parseLong(documentoEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(modelo)) + SERIE_FORMAT.format(Integer.parseInt(serie)) + NUMERO_NFE_FORMAT.format(Integer.parseInt(numero)) + (tipoEmissao != null ? TIPO_EMISSAO_FORMAT.format(Integer.parseInt(tipoEmissao)) : "");
        if (StringHelper.isNumeric((String)codigoNumerico)) {
            chaveAcesso = tipoEmissao != null ? chaveAcesso + CODIGO_NUMERICO_FORMAT.format(Integer.parseInt(codigoNumerico)) : chaveAcesso + CODIGO_NUMERICO_V1_10_FORMAT.format(Integer.parseInt(codigoNumerico));
        }
        if (StringHelper.isNumeric((String)digito)) {
            chaveAcesso = chaveAcesso + DIGITO_FORMAT.format(Integer.parseInt(digito));
        }
        return chaveAcesso;
    }

    public static String gerarChaveAcesso(String ufEmitente, String anoEmissao, String mesEmissao, String documentoEmitente, String modelo, String serie, String numero, String tipoEmissao, String codigoNumerico) {
        return DATA_MODELO_FORMAT.format(Integer.parseInt(ufEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(anoEmissao)) + DATA_MODELO_FORMAT.format(Integer.parseInt(mesEmissao)) + DOCUMENTO_FORMAT.format(Long.parseLong(documentoEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(modelo)) + SERIE_FORMAT.format(Integer.parseInt(serie)) + NUMERO_NFE_FORMAT.format(Integer.parseInt(numero)) + (tipoEmissao != null ? TIPO_EMISSAO_FORMAT.format(Integer.parseInt(tipoEmissao)) : "") + (tipoEmissao != null ? CODIGO_NUMERICO_FORMAT.format(Integer.parseInt(codigoNumerico)) : CODIGO_NUMERICO_V1_10_FORMAT.format(Integer.parseInt(codigoNumerico)));
    }

    public static String gerarDigitoChaveAcesso(String chaveAcesso) {
        String nfe = StringHelper.getDigits((String)chaveAcesso);
        int primeiro_digito = 0;
        int calculo = Integer.parseInt(nfe.substring(0, 1)) * 4 + Integer.parseInt(nfe.substring(1, 2)) * 3 + Integer.parseInt(nfe.substring(2, 3)) * 2 + Integer.parseInt(nfe.substring(3, 4)) * 9 + Integer.parseInt(nfe.substring(4, 5)) * 8 + Integer.parseInt(nfe.substring(5, 6)) * 7 + Integer.parseInt(nfe.substring(6, 7)) * 6 + Integer.parseInt(nfe.substring(7, 8)) * 5 + Integer.parseInt(nfe.substring(8, 9)) * 4 + Integer.parseInt(nfe.substring(9, 10)) * 3 + Integer.parseInt(nfe.substring(10, 11)) * 2 + Integer.parseInt(nfe.substring(11, 12)) * 9 + Integer.parseInt(nfe.substring(12, 13)) * 8 + Integer.parseInt(nfe.substring(13, 14)) * 7 + Integer.parseInt(nfe.substring(14, 15)) * 6 + Integer.parseInt(nfe.substring(15, 16)) * 5 + Integer.parseInt(nfe.substring(16, 17)) * 4 + Integer.parseInt(nfe.substring(17, 18)) * 3 + Integer.parseInt(nfe.substring(18, 19)) * 2 + Integer.parseInt(nfe.substring(19, 20)) * 9 + Integer.parseInt(nfe.substring(20, 21)) * 8 + Integer.parseInt(nfe.substring(21, 22)) * 7 + Integer.parseInt(nfe.substring(22, 23)) * 6 + Integer.parseInt(nfe.substring(23, 24)) * 5 + Integer.parseInt(nfe.substring(24, 25)) * 4 + Integer.parseInt(nfe.substring(25, 26)) * 3 + Integer.parseInt(nfe.substring(26, 27)) * 2 + Integer.parseInt(nfe.substring(27, 28)) * 9 + Integer.parseInt(nfe.substring(28, 29)) * 8 + Integer.parseInt(nfe.substring(29, 30)) * 7 + Integer.parseInt(nfe.substring(30, 31)) * 6 + Integer.parseInt(nfe.substring(31, 32)) * 5 + Integer.parseInt(nfe.substring(32, 33)) * 4 + Integer.parseInt(nfe.substring(33, 34)) * 3 + Integer.parseInt(nfe.substring(34, 35)) * 2 + Integer.parseInt(nfe.substring(35, 36)) * 9 + Integer.parseInt(nfe.substring(36, 37)) * 8 + Integer.parseInt(nfe.substring(37, 38)) * 7 + Integer.parseInt(nfe.substring(38, 39)) * 6 + Integer.parseInt(nfe.substring(39, 40)) * 5 + Integer.parseInt(nfe.substring(40, 41)) * 4 + Integer.parseInt(nfe.substring(41, 42)) * 3 + Integer.parseInt(nfe.substring(42, 43)) * 2;
        primeiro_digito = calculo < 11 ? 11 - calculo : (calculo % 11 <= 1 ? 0 : 11 - calculo % 11);
        return String.valueOf(primeiro_digito);
    }

    public static String gerarCodigoNumerico(String xml) {
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        byte[] nfeHash = sha.digest(((String)XMLUtil.getTagConteudo((String)xml, (String)DSENConstants.ID_NFE, (boolean)false).get(0)).getBytes());
        long codigoNumerico = 0;
        int hashIndex = 0;
        for (int i = 0; i < a.length; ++i) {
            byte[] algarismoBytes = Arrays.copyOfRange(nfeHash, hashIndex, hashIndex + a[i]);
            int somaBytes = ChaveAcessoUtil.a((byte[])algarismoBytes);
            int algarismo = ChaveAcessoUtil.a((int)somaBytes);
            codigoNumerico = (long)((double)codigoNumerico + (double)algarismo * Math.pow(10.0, i));
            hashIndex += a[i];
        }
        return CODIGO_NUMERICO_FORMAT.format(codigoNumerico);
    }

    private static int a(int numero) {
        int somaAtual = 0;
        for (int numeroAtual = numero; numeroAtual > 0; numeroAtual /= 10) {
            somaAtual += numeroAtual % 10;
        }
        if (somaAtual / 10 > 0) {
            return ChaveAcessoUtil.a((int)somaAtual);
        }
        return somaAtual;
    }

    private static int a(byte[] bytes) {
        int soma = 0;
        for (int i = 0; i < bytes.length; ++i) {
            soma += bytes[i];
        }
        return soma;
    }

    public static String formatarChaveAcesso(ChaveAcessoTO chaveAcessoTO) {
        StringBuffer chaveAcesso = new StringBuffer();
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getCodigoUfEmitente())));
        chaveAcesso.append("-");
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getAno())));
        chaveAcesso.append("/");
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getMes())));
        chaveAcesso.append("-");
        chaveAcesso.append(StringHelper.cnpjFormat((String)chaveAcessoTO.getCnpjEmitente()));
        chaveAcesso.append("-");
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getModelo())));
        chaveAcesso.append("-");
        chaveAcesso.append(SERIE_FORMAT.format(Integer.parseInt(chaveAcessoTO.getSerie())));
        chaveAcesso.append("-");
        chaveAcesso.append(StringHelper.formataNotaFiscal((String)chaveAcessoTO.getNumeroNFe()));
        chaveAcesso.append("-");
        chaveAcesso.append(chaveAcessoTO.getTipoEmissao());
        chaveAcesso.append("-");
        chaveAcesso.append(ChaveAcessoUtil.a((String)chaveAcessoTO.getCodigoNumerico()));
        chaveAcesso.append("-" + chaveAcessoTO.getDigito());
        return chaveAcesso.toString();
    }

    private static String a(String codNum) {
        StringBuffer sb = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)codNum)) {
            String notaCompleto = StringHelper.completaComZerosAEsquerda((String)codNum, (int)8);
            sb.append(notaCompleto.substring(0, 2)).append(".");
            sb.append(notaCompleto.substring(2, 5)).append(".");
            sb.append(notaCompleto.substring(5, 8));
        }
        return sb.toString();
    }

    public static String formatarChaveAcesso4x4(String chave) {
        if (!StringHelper.isBlankOrNull((Object)chave)) {
            if (chave.length() == 44) {
                chave = chave.substring(0, 4) + " " + chave.substring(4, 8) + " " + chave.substring(8, 12) + " " + chave.substring(12, 16) + " " + chave.substring(16, 20) + " " + chave.substring(20, 24) + " " + chave.substring(24, 28) + " " + chave.substring(28, 32) + " " + chave.substring(32, 36) + " " + chave.substring(36, 40) + " " + chave.substring(40, 44);
                return chave;
            }
            return chave;
        }
        return "";
    }

    public static String gerarChaveAcesso(NotaFiscalTO nfeTO) {
        if (StringHelper.isNumeric((String)nfeTO.getCodigoNumericoChaveAcesso())) {
            String dv = ChaveAcessoUtil.gerarDigitoChaveAcesso((NotaFiscalTO)nfeTO);
            nfeTO.setDigitoChaveAcesso(dv);
        }
        return ChaveAcessoUtil.gerarChaveAcesso((String)nfeTO.getCodigoUfEmitente(), (String)nfeTO.getAno(), (String)nfeTO.getMes(), (String)nfeTO.getEmitenteTO().getNrDocumento(), (String)nfeTO.getModelo(), (String)nfeTO.getSerie(), (String)nfeTO.getNumero(), (String)(nfeTO.getTipoEmissao() != null ? nfeTO.getTipoEmissao().getCodigo() : null), (String)nfeTO.getCodigoNumericoChaveAcesso(), (String)nfeTO.getDigitoChaveAcesso());
    }

    public static String gerarDigitoChaveAcesso(NotaFiscalTO nfeTO) {
        String chaveAcessoSemDV = ChaveAcessoUtil.gerarChaveAcesso((String)nfeTO.getCodigoUfEmitente(), (String)nfeTO.getAno(), (String)nfeTO.getMes(), (String)nfeTO.getEmitenteTO().getNrDocumento(), (String)nfeTO.getModelo(), (String)nfeTO.getSerie(), (String)nfeTO.getNumero(), (String)(nfeTO.getTipoEmissao() != null ? nfeTO.getTipoEmissao().getCodigo() : null), (String)nfeTO.getCodigoNumericoChaveAcesso());
        return ChaveAcessoUtil.gerarDigitoChaveAcesso((String)chaveAcessoSemDV);
    }

    public static String gerarDigitoChaveAcesso(String ufEmitente, String anoEmissao, String mesEmissao, String documentoEmitente, String modelo, String serie, String numero, String tipoEmissao, String codigoNumerico) {
        String chaveAcessoSemDV = ChaveAcessoUtil.gerarChaveAcesso((String)ufEmitente, (String)anoEmissao, (String)mesEmissao, (String)documentoEmitente, (String)modelo, (String)serie, (String)numero, (String)tipoEmissao, (String)codigoNumerico);
        return ChaveAcessoUtil.gerarDigitoChaveAcesso((String)chaveAcessoSemDV);
    }

    public static ChaveAcessoTO gerarChaveAcessoTO(NotaFiscalTO nfeTO) throws ParseException {
        if (nfeTO == null) {
            throw new ParseException("Objeto Nulo", 0);
        }
        ChaveAcessoTO chaveAcessoTO = new ChaveAcessoTO();
        try {
            chaveAcessoTO.setCodigoUfEmitente(nfeTO.getCodigoUfEmitente());
            chaveAcessoTO.setAno(nfeTO.getAno());
            chaveAcessoTO.setMes(nfeTO.getMes());
            chaveAcessoTO.setCnpjEmitente(nfeTO.getEmitenteTO().getNrDocumento());
            chaveAcessoTO.setModelo(nfeTO.getModelo());
            chaveAcessoTO.setSerie(nfeTO.getSerie());
            chaveAcessoTO.setNumeroNFe(nfeTO.getNumero());
            chaveAcessoTO.setCodigoNumerico(nfeTO.getCodigoNumericoChaveAcesso());
            chaveAcessoTO.setTipoEmissao(nfeTO.getTipoEmissao() != null ? nfeTO.getTipoEmissao().getCodigo() : null);
            if (StringHelper.isBlankOrNull((Object)nfeTO.getDigitoChaveAcesso())) {
                nfeTO.setDigitoChaveAcesso(ChaveAcessoUtil.gerarDigitoChaveAcesso((NotaFiscalTO)nfeTO));
            }
            chaveAcessoTO.setDigito(nfeTO.getDigitoChaveAcesso());
        }
        catch (NumberFormatException nfe) {
            throw new ParseException("Chave deve possuir apenas n\u00fameros!", 0);
        }
        return chaveAcessoTO;
    }

    public static NotaFiscalTO gerarNotaFiscalTO(ChaveAcessoTO chaveAcessoTO, EmitenteTO emitenteTO) {
        NotaFiscalTO nfeTO = new NotaFiscalTO();
        nfeTO.setCodigoUfEmitente(chaveAcessoTO.getCodigoUfEmitente());
        nfeTO.setEmitenteTO(emitenteTO);
        nfeTO.setAno(chaveAcessoTO.getAno());
        nfeTO.setMes(chaveAcessoTO.getMes());
        nfeTO.setModelo(chaveAcessoTO.getModelo());
        nfeTO.setSerie(chaveAcessoTO.getSerie());
        nfeTO.setNumero(chaveAcessoTO.getNumeroNFe());
        nfeTO.setCodigoNumericoChaveAcesso(chaveAcessoTO.getCodigoNumerico());
        nfeTO.setDigitoChaveAcesso(chaveAcessoTO.getDigito());
        nfeTO.setDanfeImpresso(Boolean.valueOf(false));
        nfeTO.setAutorizacaoExportadaXml(Boolean.valueOf(false));
        nfeTO.setTipoEmissao(TipoEmissaoEnum.getEnumPeloCodigo((String)chaveAcessoTO.getTipoEmissao()));
        nfeTO.setVersao(DSENProperties.getInstance().getVersaoSchema());
        return nfeTO;
    }

    public static String gerarCodigoNumerico(NotaFiscalTO NotaFiscalTO2) {
        return ChaveAcessoUtil.gerarCodigoNumerico((String)NotaFiscalTO2.getDocXmlString());
    }

    public static boolean isValidCNPJ(String cnpj) {
        String s = cnpj.replaceAll("[^0-9]*", "");
        if (s.length() == 14) {
            return ChaveAcessoUtil.isValidDigitCNPJ((String)cnpj);
        }
        return false;
    }

    public static boolean isValidDigitCNPJ(String cpfOrCnpj) {
        boolean isCpf;
        if (cpfOrCnpj == null) {
            return false;
        }
        String n = cpfOrCnpj.replaceAll("[^0-9]", "");
        boolean isCnpj = n.length() == 14;
        boolean bl = isCpf = n.length() == 11;
        if (!isCpf && !isCnpj) {
            return false;
        }
        int[] foundDv = new int[]{0, 0};
        int dv1 = Integer.parseInt(String.valueOf(n.charAt(n.length() - 2)));
        int dv2 = Integer.parseInt(String.valueOf(n.charAt(n.length() - 1)));
        for (int j = 0; j < 2; ++j) {
            int sum = 0;
            int coeficient = 2;
            for (int i = n.length() - 3 + j; i >= 0; --i) {
                int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
                sum += digit * coeficient;
                if (++coeficient <= 9 || !isCnpj) continue;
                coeficient = 2;
            }
            foundDv[j] = 11 - sum % 11;
            if (foundDv[j] < 10) continue;
            foundDv[j] = 0;
        }
        return dv1 == foundDv[0] && dv2 == foundDv[1];
    }

    static {
        DIGITO_FORMAT.applyPattern("0");
        DATA_MODELO_FORMAT.applyPattern("00");
        SERIE_FORMAT.applyPattern("000");
        CODIGO_NUMERICO_FORMAT.applyPattern("00000000");
        CODIGO_NUMERICO_V1_10_FORMAT.applyPattern("000000000");
        NUMERO_NFE_FORMAT.applyPattern("000000000");
        DOCUMENTO_FORMAT.applyPattern("00000000000000");
        TIPO_EMISSAO_FORMAT.applyPattern("0");
    }
}

