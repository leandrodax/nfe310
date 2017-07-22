/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.CertificadoHelper
 *  br.gov.sp.fazenda.dsge.certif.NomesAlternativos
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.bouncycastle.asn1.ASN1InputStream
 *  org.bouncycastle.asn1.DERBoolean
 *  org.bouncycastle.asn1.DERInteger
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERSequence
 */
package br.gov.sp.fazenda.dsge.certif;

import br.gov.sp.fazenda.dsge.certif.NomesAlternativos;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public final class CertificadoHelper {
    private static Log a = LogFactory.getLog(CertificadoHelper.class);
    private static final int a = 0;
    private static final int b = 1;
    private static final String a = "1.3.6.1.5.5.7.3.2";
    private static final String b = "2.16.76.1.3.3";
    private static final String c = "2.5.29.19";

    public CertificadoHelper() {
    }

    public static void validarVersao(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        if (certificado.getVersion() != 3) {
            a.warn((Object)("[A vers\u00e3o do certificado deve ser igual a 3.] " + certificado.getVersion()));
            throw new DSGECertificadoInvalidoException("A vers\u00e3o do certificado deve ser igual a 3.");
        }
    }

    public static DERObject toDERObject(byte[] data) throws IOException {
        ByteArrayInputStream inStream = new ByteArrayInputStream(data);
        ASN1InputStream derInputStream = new ASN1InputStream((InputStream)inStream);
        return derInputStream.readObject();
    }

    public static void validarRestricoesBasicas(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        DERBoolean isCa = new DERBoolean(false);
        try {
            byte[] extValues3 = certificado.getExtensionValue("2.5.29.19");
            if (extValues3 != null) {
                DERObject derObject = CertificadoHelper.toDERObject((byte[])extValues3);
                DEROctetString derOctetString = (DEROctetString)derObject;
                DERSequence derSequence = (DERSequence)CertificadoHelper.toDERObject((byte[])derOctetString.getOctets());
                Enumeration en = derSequence.getObjects();
                if (en.hasMoreElements()) {
                    isCa = (DERBoolean)en.nextElement();
                    a.info((Object)("isCA ? " + isCa.toString()));
                }
                if (en.hasMoreElements()) {
                    DERInteger len = (DERInteger)en.nextElement();
                    a.info((Object)("LEN:" + len.toString()));
                }
            }
        }
        catch (IOException extValues3) {
        }
        catch (RuntimeException extValues3) {
        }
        catch (Exception extValues3) {
            // empty catch block
        }
        if (isCa.isTrue()) {
            a.warn((Object)"[O emissor do certificado deve ser Entidade Final.] isCa == true");
            throw new DSGECertificadoInvalidoException("O emissor do certificado deve ser Entidade Final.");
        }
    }

    public static void validarNaoRepudio(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        boolean[] keyUsage = certificado.getKeyUsage();
        if (!keyUsage[1]) {
            a.warn((Object)("[N\u00e3o \u00e9 permitido o uso da chave do certificado para assinatura - Certificado deve ser \"N\u00e3o-Rep\u00fadio\".] " + keyUsage[1]));
            throw new DSGECertificadoInvalidoException("N\u00e3o \u00e9 permitido o uso da chave do certificado para assinatura - Certificado deve ser \"N\u00e3o-Rep\u00fadio\".");
        }
    }

    public static void validarUsoChaveAssinatura(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        boolean[] keyUsage = certificado.getKeyUsage();
        if (!keyUsage[0]) {
            a.warn((Object)("[N\u00e3o \u00e9 permitido o uso da chave do certificado para assinatura.] " + keyUsage[0]));
            throw new DSGECertificadoInvalidoException("N\u00e3o \u00e9 permitido o uso da chave do certificado para assinatura.");
        }
    }

    public static void validarPeriodo(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        Date dataValidacao = new Date();
        if (!certificado.getNotBefore().before(dataValidacao) || !certificado.getNotAfter().after(dataValidacao)) {
            a.warn((Object)("[O per\u00edodo de validade do certificado expirou.] " + certificado.getNotBefore() + " at\u00e9 " + certificado.getNotAfter()));
            throw new DSGECertificadoInvalidoException("O per\u00edodo de validade do certificado expirou.");
        }
    }

    public static void validarNomesAlternativos(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        try {
            HashMap nomesAlternativos = new NomesAlternativos().recuperarNomesAlternativos(certificado);
            if (!nomesAlternativos.containsKey("2.16.76.1.3.3")) {
                a.warn((Object)"[Nome alternativo n\u00e3o cont\u00e9m o CNPJ.] 2.16.76.1.3.3");
                throw new DSGECertificadoInvalidoException("Nome alternativo n\u00e3o cont\u00e9m o CNPJ.");
            }
        }
        catch (Exception e) {
            throw new DSGECertificadoInvalidoException("Nome alternativo n\u00e3o cont\u00e9m o CNPJ.");
        }
    }

    public static void validarUsoAvancadoChave(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        try {
            if (!certificado.getExtendedKeyUsage().contains("1.3.6.1.5.5.7.3.2")) {
                a.warn((Object)("[Uso avan\u00e7ado da chave deve ser igual a \"Autentica\u00e7\u00e3o Cliente\"] " + certificado.getExtendedKeyUsage().contains("1.3.6.1.5.5.7.3.2")));
                throw new DSGECertificadoInvalidoException("Uso avan\u00e7ado da chave deve ser igual a \"Autentica\u00e7\u00e3o Cliente\"");
            }
        }
        catch (Exception e) {
            throw new DSGECertificadoInvalidoException("Uso avan\u00e7ado da chave deve ser igual a \"Autentica\u00e7\u00e3o Cliente\"");
        }
    }

    public static String recuperarCNPJ(X509Certificate certificado) throws DSGECertificadoInvalidoException {
        HashMap nomesAlternativos;
        try {
            nomesAlternativos = new NomesAlternativos().recuperarNomesAlternativos(certificado);
        }
        catch (Exception e) {
            throw new DSGECertificadoInvalidoException("Erro ao recuperar o CNPJ do certificado");
        }
        String cnpj = (String)nomesAlternativos.get("2.16.76.1.3.3");
        if (cnpj == null || cnpj.equals("")) {
            throw new DSGECertificadoInvalidoException("Erro ao recuperar o CNPJ do certificado");
        }
        return (String)nomesAlternativos.get("2.16.76.1.3.3");
    }

    public static String getAssunto(X509Certificate certificado) {
        return certificado.getSubjectDN().toString();
    }

    public static String getEmissor(X509Certificate certificado) {
        return certificado.getIssuerDN().toString();
    }

    public static Date getDataValidadeFim(X509Certificate certificado) {
        return certificado.getNotAfter();
    }

    public static Date getDataValidadeInicio(X509Certificate certificado) {
        return certificado.getNotBefore();
    }

    public static X509Certificate getX509(byte[] binaryCertificate) throws DSGECertificadoInvalidoException {
        CertificateFactory certificateFactory = null;
        X509Certificate certImpl = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X.509");
            ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(binaryCertificate);
            certImpl = (X509Certificate)certificateFactory.generateCertificate(arrayInputStream);
        }
        catch (Exception e) {
            throw new DSGECertificadoInvalidoException("Ocorreu um problema na tentativa de acesso ao certificado. Verifique se o arquivo informado \u00e9 um Certificado v\u00e1lido ou se o arquivo possui permiss\u00e3o de leitura.");
        }
        return certImpl;
    }

    static {
    }
}

