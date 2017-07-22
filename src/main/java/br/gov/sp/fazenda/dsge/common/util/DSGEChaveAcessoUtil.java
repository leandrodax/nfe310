/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEChaveAcessoUtil
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class DSGEChaveAcessoUtil {
    public static final DecimalFormat DIGITO_FORMAT = new DecimalFormat();
    public static final DecimalFormat DATA_MODELO_FORMAT = new DecimalFormat();
    public static final DecimalFormat SERIE_FORMAT = new DecimalFormat();
    public static final DecimalFormat NUMERO_CODIGO_NUMERICO_FORMAT = new DecimalFormat();
    public static final DecimalFormat DOCUMENTO_FORMAT = new DecimalFormat();
    public static final int TAMANHO_CHAVE = 44;
    private static int[] a = new int[]{3, 2, 2, 2, 2, 2, 2, 2, 3};

    protected DSGEChaveAcessoUtil() {
    }

    public static String gerarChaveAcesso(ChaveAcessoTO chaveAcessoTO) {
        return DSGEChaveAcessoUtil.gerarChaveAcesso((String)chaveAcessoTO.getUfEmit(), (String)chaveAcessoTO.getAno(), (String)chaveAcessoTO.getMes(), (String)chaveAcessoTO.getNrDocumento(), (String)chaveAcessoTO.getModelo(), (String)chaveAcessoTO.getSerie(), (String)chaveAcessoTO.getNNf(), (String)chaveAcessoTO.getCNf(), (String)chaveAcessoTO.getCDv());
    }

    public static boolean verificarDigitoChaveAcesso(String chaveAcesso) {
        if (chaveAcesso == null || chaveAcesso.length() != 44) {
            return false;
        }
        String digito = DSGEChaveAcessoUtil.gerarDigitoChaveAcesso((String)chaveAcesso);
        return digito.equals(chaveAcesso.substring(43));
    }

    public static String gerarChaveAcesso(String ufEmitente, String anoEmissao, String mesEmissao, String documentoEmitente, String modelo, String serie, String numero, String codigoNumerico, String digito) {
        String chaveAcesso = DATA_MODELO_FORMAT.format(Integer.parseInt(ufEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(anoEmissao)) + DATA_MODELO_FORMAT.format(Integer.parseInt(mesEmissao)) + DOCUMENTO_FORMAT.format(Long.parseLong(documentoEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(modelo)) + SERIE_FORMAT.format(Integer.parseInt(serie)) + NUMERO_CODIGO_NUMERICO_FORMAT.format(Integer.parseInt(numero));
        if (StringHelper.isNumeric((String)codigoNumerico)) {
            chaveAcesso = chaveAcesso + NUMERO_CODIGO_NUMERICO_FORMAT.format(Integer.parseInt(codigoNumerico));
        }
        if (StringHelper.isNumeric((String)digito)) {
            chaveAcesso = chaveAcesso + DIGITO_FORMAT.format(Integer.parseInt(digito));
        }
        return chaveAcesso;
    }

    protected static String gerarChaveAcesso(String ufEmitente, String anoEmissao, String mesEmissao, String documentoEmitente, String modelo, String serie, String numero, String codigoNumerico) {
        return DATA_MODELO_FORMAT.format(Integer.parseInt(ufEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(anoEmissao)) + DATA_MODELO_FORMAT.format(Integer.parseInt(mesEmissao)) + DOCUMENTO_FORMAT.format(Long.parseLong(documentoEmitente)) + DATA_MODELO_FORMAT.format(Integer.parseInt(modelo)) + SERIE_FORMAT.format(Integer.parseInt(serie)) + NUMERO_CODIGO_NUMERICO_FORMAT.format(Integer.parseInt(numero)) + NUMERO_CODIGO_NUMERICO_FORMAT.format(Integer.parseInt(codigoNumerico));
    }

    public static String gerarDigitoChaveAcesso(String chaveAcesso) {
        String nota = StringHelper.getDigits((String)chaveAcesso);
        int primeiro_digito = 0;
        int calculo = Integer.parseInt(nota.substring(0, 1)) * 4 + Integer.parseInt(nota.substring(1, 2)) * 3 + Integer.parseInt(nota.substring(2, 3)) * 2 + Integer.parseInt(nota.substring(3, 4)) * 9 + Integer.parseInt(nota.substring(4, 5)) * 8 + Integer.parseInt(nota.substring(5, 6)) * 7 + Integer.parseInt(nota.substring(6, 7)) * 6 + Integer.parseInt(nota.substring(7, 8)) * 5 + Integer.parseInt(nota.substring(8, 9)) * 4 + Integer.parseInt(nota.substring(9, 10)) * 3 + Integer.parseInt(nota.substring(10, 11)) * 2 + Integer.parseInt(nota.substring(11, 12)) * 9 + Integer.parseInt(nota.substring(12, 13)) * 8 + Integer.parseInt(nota.substring(13, 14)) * 7 + Integer.parseInt(nota.substring(14, 15)) * 6 + Integer.parseInt(nota.substring(15, 16)) * 5 + Integer.parseInt(nota.substring(16, 17)) * 4 + Integer.parseInt(nota.substring(17, 18)) * 3 + Integer.parseInt(nota.substring(18, 19)) * 2 + Integer.parseInt(nota.substring(19, 20)) * 9 + Integer.parseInt(nota.substring(20, 21)) * 8 + Integer.parseInt(nota.substring(21, 22)) * 7 + Integer.parseInt(nota.substring(22, 23)) * 6 + Integer.parseInt(nota.substring(23, 24)) * 5 + Integer.parseInt(nota.substring(24, 25)) * 4 + Integer.parseInt(nota.substring(25, 26)) * 3 + Integer.parseInt(nota.substring(26, 27)) * 2 + Integer.parseInt(nota.substring(27, 28)) * 9 + Integer.parseInt(nota.substring(28, 29)) * 8 + Integer.parseInt(nota.substring(29, 30)) * 7 + Integer.parseInt(nota.substring(30, 31)) * 6 + Integer.parseInt(nota.substring(31, 32)) * 5 + Integer.parseInt(nota.substring(32, 33)) * 4 + Integer.parseInt(nota.substring(33, 34)) * 3 + Integer.parseInt(nota.substring(34, 35)) * 2 + Integer.parseInt(nota.substring(35, 36)) * 9 + Integer.parseInt(nota.substring(36, 37)) * 8 + Integer.parseInt(nota.substring(37, 38)) * 7 + Integer.parseInt(nota.substring(38, 39)) * 6 + Integer.parseInt(nota.substring(39, 40)) * 5 + Integer.parseInt(nota.substring(40, 41)) * 4 + Integer.parseInt(nota.substring(41, 42)) * 3 + Integer.parseInt(nota.substring(42, 43)) * 2;
        primeiro_digito = calculo < 11 ? 11 - calculo : (calculo % 11 <= 1 ? 0 : 11 - calculo % 11);
        return String.valueOf(primeiro_digito);
    }

    public static ChaveAcessoTO obterChaveAcessoNotaFiscal(String chaveAcesso) throws ParseException {
        if (chaveAcesso == null) {
            throw new ParseException("Chave Nula!", 0);
        }
        if (chaveAcesso.trim().length() != 44) {
            throw new ParseException("A Chave de Acesso deve possuir 44 n\u00fameros! Cont\u00e9m apenas " + chaveAcesso.trim().length() + ".", 0);
        }
        ChaveAcessoTO chaveAcessoTO = new ChaveAcessoTO();
        try {
            chaveAcessoTO.setUfEmit(chaveAcesso.substring(0, 2));
            chaveAcessoTO.setAno(chaveAcesso.substring(2, 4));
            chaveAcessoTO.setMes(chaveAcesso.substring(4, 6));
            chaveAcessoTO.setNrDocumento(chaveAcesso.substring(6, 20));
            chaveAcessoTO.setModelo(chaveAcesso.substring(20, 22));
            chaveAcessoTO.setSerie(chaveAcesso.substring(22, 25));
            chaveAcessoTO.setNNf(chaveAcesso.substring(25, 34));
            chaveAcessoTO.setCNf(chaveAcesso.substring(34, 43));
            chaveAcessoTO.setCDv(chaveAcesso.substring(43, 44));
        }
        catch (NumberFormatException nfe) {
            throw new ParseException("Chave deve possuir apenas n\u00fameros!", 0);
        }
        return chaveAcessoTO;
    }

    public static String gerarCodigoNumerico(String xml) {
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        byte[] notaFiscalHash = sha.digest(((String)XMLUtil.getTagConteudo((String)xml, (String)"infNFe", (boolean)false).get(0)).getBytes());
        long codigoNumerico = 0;
        int hashIndex = 0;
        for (int i = 0; i < a.length; ++i) {
            byte[] algarismoBytes = Arrays.copyOfRange(notaFiscalHash, hashIndex, hashIndex + a[i]);
            int somaBytes = DSGEChaveAcessoUtil.a((byte[])algarismoBytes);
            int algarismo = DSGEChaveAcessoUtil.a((int)somaBytes);
            codigoNumerico = (long)((double)codigoNumerico + (double)algarismo * Math.pow(10.0, i));
            hashIndex += a[i];
        }
        return NUMERO_CODIGO_NUMERICO_FORMAT.format(codigoNumerico);
    }

    private static int a(int numero) {
        int somaAtual = 0;
        for (int numeroAtual = numero; numeroAtual > 0; numeroAtual /= 10) {
            somaAtual += numeroAtual % 10;
        }
        if (somaAtual / 10 > 0) {
            return DSGEChaveAcessoUtil.a((int)somaAtual);
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

    public static String formatarChaveAcesso(ChaveAcessoTO chaveAcessoTO, TipoDocumentoEnum tipoDocumentoEnum) {
        StringBuffer chaveAcesso = new StringBuffer();
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getUfEmit())));
        chaveAcesso.append("-");
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getAno())));
        chaveAcesso.append("/");
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getMes())));
        chaveAcesso.append("-");
        if (TipoDocumentoEnum.CNPJ.equals((Object)tipoDocumentoEnum)) {
            chaveAcesso.append(StringHelper.cnpjFormat((String)chaveAcessoTO.getNrDocumento()));
        } else if (TipoDocumentoEnum.CPF.equals((Object)tipoDocumentoEnum)) {
            chaveAcesso.append("000." + StringHelper.cpfFormat((String)chaveAcessoTO.getNrDocumento()));
        }
        chaveAcesso.append("-");
        chaveAcesso.append(DATA_MODELO_FORMAT.format(Integer.parseInt(chaveAcessoTO.getModelo())));
        chaveAcesso.append("-");
        chaveAcesso.append(SERIE_FORMAT.format(Integer.parseInt(chaveAcessoTO.getSerie())));
        chaveAcesso.append("-");
        chaveAcesso.append(StringHelper.formataNotaFiscal((String)chaveAcessoTO.getNNf()));
        chaveAcesso.append("-");
        chaveAcesso.append(StringHelper.formataCodigoNumerico((String)chaveAcessoTO.getCNf()));
        chaveAcesso.append("-" + chaveAcessoTO.getCDv());
        return chaveAcesso.toString();
    }

    static {
        DIGITO_FORMAT.applyPattern("0");
        DATA_MODELO_FORMAT.applyPattern("00");
        SERIE_FORMAT.applyPattern("000");
        NUMERO_CODIGO_NUMERICO_FORMAT.applyPattern("000000000");
        DOCUMENTO_FORMAT.applyPattern("00000000000000");
    }
}

