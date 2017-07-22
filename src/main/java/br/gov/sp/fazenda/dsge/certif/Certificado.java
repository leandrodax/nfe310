/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.Certificado$1
 *  br.gov.sp.fazenda.dsge.certif.Certificado$2
 *  br.gov.sp.fazenda.dsge.certif.CertificadoHelper
 *  br.gov.sp.fazenda.dsge.certif.KeyValueKeySelector
 *  br.gov.sp.fazenda.dsge.certif.RepositorioInfo
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoSenhaException
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECnpjInvalidoException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  sun.security.mscapi2.DSGEProvider
 *  sun.security.pkcs11.SunPKCS11
 *  sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS
 *  sun.security.pkcs11.wrapper.CK_TOKEN_INFO
 *  sun.security.pkcs11.wrapper.PKCS11
 *  sun.security.pkcs11.wrapper.PKCS11Exception
 */
package br.gov.sp.fazenda.dsge.certif;

import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.CertificadoHelper;
import br.gov.sp.fazenda.dsge.certif.KeyValueKeySelector;
import br.gov.sp.fazenda.dsge.certif.RepositorioInfo;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoInvalidoException;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoSenhaException;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECnpjInvalidoException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import sun.security.mscapi2.DSGEProvider;
import sun.security.pkcs11.SunPKCS11;
import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS;
import sun.security.pkcs11.wrapper.CK_TOKEN_INFO;
import sun.security.pkcs11.wrapper.PKCS11;
import sun.security.pkcs11.wrapper.PKCS11Exception;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Certificado {
    private static Log a = LogFactory.getLog(Certificado.class);
    private CK_C_INITIALIZE_ARGS a;
    private final String a = "C_GetFunctionList";
    private final boolean a = false;
    public static String A1 = "A1";
    public static String A3 = "A3";
    private final String b = "PKCS11";
    private final String c = "PKCS12";
    private final String d = "Windows-MY";
    private final String e = "#";
    private final String f = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
    private final String g = "Signature";
    private final String h = "DOM";

    public Certificado() {
        CK_C_INITIALIZE_ARGS initArgs = new CK_C_INITIALIZE_ARGS();
        initArgs.flags = 2;
    }

    public List<RepositorioInfo> procurarRepositorio(String searchFileStr, String extensao) {
         filenameFilter = new /* Unavailable Anonymous Inner Class!! */;
        File searchFile = new File(searchFileStr);
        ArrayList<RepositorioInfo> listaRepositorio = new ArrayList<RepositorioInfo>();
        File[] files = new File[]{searchFile};
        if (searchFile.isDirectory()) {
            files = searchFile.listFiles((FilenameFilter)filenameFilter);
        }
        for (File file : files) {
            try {
                PKCS11 pkcs11 = PKCS11.getInstance((String)file.getAbsolutePath(), (String)"C_GetFunctionList", (CK_C_INITIALIZE_ARGS)this.a, (boolean)false);
                long[] portasDisponiveis = pkcs11.C_GetSlotList(false);
                RepositorioInfo repositorioInfo = null;
                for (int i = 0; i < portasDisponiveis.length; ++i) {
                    try {
                        String label = new String(pkcs11.C_GetTokenInfo((long)portasDisponiveis[i]).label).trim();
                        if (label == null || label.trim().length() <= 0) continue;
                        repositorioInfo = new RepositorioInfo();
                        repositorioInfo.setNome(label);
                        repositorioInfo.setSlot(Long.valueOf(portasDisponiveis[i]));
                        repositorioInfo.setCaminho(file.getAbsolutePath());
                        repositorioInfo.setTpCertif(A3);
                        if (listaRepositorio.contains((Object)repositorioInfo)) continue;
                        listaRepositorio.add(repositorioInfo);
                        continue;
                    }
                    catch (PKCS11Exception label) {
                        // empty catch block
                    }
                }
            }
            catch (Throwable pkcs11) {
                // empty catch block
            }
        }
        if (listaRepositorio.size() > 0) {
            return listaRepositorio;
        }
        return null;
    }

    public List<RepositorioInfo> procurarRepositorioIE() throws DSGECertificadoException {
        ArrayList<RepositorioInfo> listaRepositorio = new ArrayList<RepositorioInfo>();
        try {
            DSGEProvider.init();
            KeyStore ks = KeyStore.getInstance("Windows-MY");
            ks.load(null, null);
            RepositorioInfo repositorioInfo = null;
            Enumeration<String> e = ks.aliases();
            while (e.hasMoreElements()) {
                repositorioInfo = new RepositorioInfo();
                repositorioInfo.setNome(e.nextElement());
                if (listaRepositorio.contains((Object)repositorioInfo)) continue;
                listaRepositorio.add(repositorioInfo);
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new DSGECertificadoException("N\u00e3o foi poss\u00edvel acessar o reposit\u00f3rio de Certificados do Windows.");
        }
        if (listaRepositorio.size() > 0) {
            return listaRepositorio;
        }
        return null;
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificado(TipoCertificadoEnum tipoCertificadoEnum, String cnpjBase, String senha, RepositorioInfo repositorioInfo) throws DSGECertificadoException, DSGECnpjInvalidoException, DSGECertificadoSenhaException, DSGECertificadoInvalidoException {
        if (A1.equals(repositorioInfo.getTpCertif())) {
            return this.a(tipoCertificadoEnum, cnpjBase, repositorioInfo.getCaminho(), senha);
        }
        if (A3.equals(repositorioInfo.getTpCertif())) {
            return this.a(tipoCertificadoEnum, cnpjBase, repositorioInfo, senha);
        }
        return null;
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificado(String senha, RepositorioInfo repositorioInfo) throws DSGECertificadoException {
        if (A1.equals(repositorioInfo.getTpCertif())) {
            return this.recuperarCertificadosArquivo(repositorioInfo.getCaminho(), senha);
        }
        if (A3.equals(repositorioInfo.getTpCertif())) {
            return this.recuperarCertificadosRepositorio(repositorioInfo, senha);
        }
        return null;
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificadoIE(TipoCertificadoEnum tipoCertificadoEnum, String cnpjBase, String senha, RepositorioInfo repositorioInfo) throws DSGECertificadoException, DSGECnpjInvalidoException, DSGECertificadoSenhaException, DSGECertificadoInvalidoException {
        Map certificadosValidos = null;
        switch (2.a[tipoCertificadoEnum.ordinal()]) {
            case 1: {
                certificadosValidos = this.a(repositorioInfo, cnpjBase);
                break;
            }
            case 2: {
                certificadosValidos = this.b(repositorioInfo, cnpjBase);
                break;
            }
        }
        return certificadosValidos;
    }

    private Map<X509Certificate, PrivateKey> a(TipoCertificadoEnum tipoCertificadoEnum, String cnpjBase, String caminhoArquivo, String senha) throws DSGECertificadoException, DSGECnpjInvalidoException, DSGECertificadoSenhaException, DSGECertificadoInvalidoException {
        Map certificadosValidos = null;
        switch (2.a[tipoCertificadoEnum.ordinal()]) {
            case 1: {
                certificadosValidos = this.a(cnpjBase, caminhoArquivo, senha);
                break;
            }
            case 2: {
                certificadosValidos = this.b(cnpjBase, caminhoArquivo, senha);
                break;
            }
        }
        return certificadosValidos;
    }

    private Map<X509Certificate, PrivateKey> a(TipoCertificadoEnum tipoCertificadoEnum, String cnpjBase, RepositorioInfo repositorioInfo, String senha) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException, DSGECertificadoException {
        Map certificadosValidos = null;
        switch (2.a[tipoCertificadoEnum.ordinal()]) {
            case 1: {
                certificadosValidos = this.a(repositorioInfo, senha, cnpjBase);
                break;
            }
            case 2: {
                certificadosValidos = this.b(repositorioInfo, senha, cnpjBase);
                break;
            }
        }
        return certificadosValidos;
    }

    private Map<X509Certificate, PrivateKey> a(String cnpjBase, String caminhoArquivo, String senha) throws DSGECertificadoException, DSGECnpjInvalidoException, DSGECertificadoSenhaException, DSGECertificadoInvalidoException {
        Map certificadosValidos = this.recuperarCertificadosArquivo(caminhoArquivo, senha);
        if (certificadosValidos != null) {
            return this.a(certificadosValidos, cnpjBase);
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> a(RepositorioInfo repositorioInfo, String senha, String cnpjBase) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException, DSGECertificadoException {
        Map certificadosValidos = this.recuperarCertificadosRepositorio(repositorioInfo, senha);
        if (certificadosValidos != null) {
            return this.a(certificadosValidos, cnpjBase);
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> a(RepositorioInfo repositorioInfo, String cnpjBase) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException, DSGECertificadoException {
        Map certificadosValidos = this.recuperarCertificadosRepositorioIE(repositorioInfo);
        if (certificadosValidos != null) {
            return this.a(certificadosValidos, cnpjBase);
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> b(String cnpjBase, String caminhoArquivo, String senha) throws DSGECertificadoException, DSGECnpjInvalidoException, DSGECertificadoSenhaException, DSGECertificadoInvalidoException {
        Map certificadosValidos = this.recuperarCertificadosArquivo(caminhoArquivo, senha);
        if (certificadosValidos != null) {
            return this.b(certificadosValidos, cnpjBase);
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> b(RepositorioInfo repositorioInfo, String senha, String cnpjBase) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException, DSGECertificadoException {
        Map certificadosValidos = this.recuperarCertificadosRepositorio(repositorioInfo, senha);
        if (certificadosValidos != null) {
            return this.b(certificadosValidos, cnpjBase);
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> b(RepositorioInfo repositorioInfo, String cnpjBase) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException, DSGECertificadoException {
        Map certificadosValidos = this.recuperarCertificadosRepositorioIE(repositorioInfo);
        if (certificadosValidos != null) {
            return this.b(certificadosValidos, cnpjBase);
        }
        return null;
    }

    public String validarCertificado(TipoCertificadoEnum tipo, X509Certificate certificado, String cnpj) {
        String erros = "";
        try {
            CertificadoHelper.validarVersao((X509Certificate)certificado);
        }
        catch (DSGECertificadoInvalidoException e) {
            erros = erros + e.getMessage() + "\n";
        }
        try {
            CertificadoHelper.validarRestricoesBasicas((X509Certificate)certificado);
        }
        catch (DSGECertificadoInvalidoException e) {
            erros = erros + e.getMessage() + "\n";
        }
        try {
            CertificadoHelper.validarPeriodo((X509Certificate)certificado);
        }
        catch (DSGECertificadoInvalidoException e) {
            erros = erros + e.getMessage() + "\n";
        }
        try {
            CertificadoHelper.validarNomesAlternativos((X509Certificate)certificado);
        }
        catch (DSGECertificadoInvalidoException e) {
            erros = erros + e.getMessage() + "\n";
        }
        switch (2.a[tipo.ordinal()]) {
            case 1: {
                try {
                    CertificadoHelper.validarNaoRepudio((X509Certificate)certificado);
                }
                catch (DSGECertificadoInvalidoException e) {
                    erros = erros + e.getMessage() + "\n";
                }
                try {
                    CertificadoHelper.validarUsoChaveAssinatura((X509Certificate)certificado);
                }
                catch (DSGECertificadoInvalidoException e) {
                    erros = erros + e.getMessage() + "\n";
                }
                break;
            }
            case 2: {
                try {
                    CertificadoHelper.validarUsoAvancadoChave((X509Certificate)certificado);
                    break;
                }
                catch (DSGECertificadoInvalidoException e) {
                    erros = erros + e.getMessage() + "\n";
                }
            }
        }
        return erros;
    }

    private Map<X509Certificate, PrivateKey> a(Map<X509Certificate, PrivateKey> certificados, String cnpjBase) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException {
        HashMap<X509Certificate, PrivateKey> certificadosValidos = new HashMap<X509Certificate, PrivateKey>();
        if ((certificados = this.a(certificados)) != null) {
            for (X509Certificate certificado : certificados.keySet()) {
                CertificadoHelper.validarNaoRepudio((X509Certificate)certificado);
                CertificadoHelper.validarUsoChaveAssinatura((X509Certificate)certificado);
                if (this.validarCNPJ(certificado, cnpjBase)) {
                    certificadosValidos.put(certificado, (PrivateKey)certificados.get(certificado));
                    continue;
                }
                throw new DSGECnpjInvalidoException("CNPJ-Base consultado difere do CNPJ-Base do Certificado Digital");
            }
        }
        if (certificadosValidos.size() > 0) {
            return certificadosValidos;
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> b(Map<X509Certificate, PrivateKey> certificados, String cnpjBase) throws DSGECnpjInvalidoException, DSGECertificadoInvalidoException {
        HashMap<X509Certificate, PrivateKey> certificadosValidos = new HashMap<X509Certificate, PrivateKey>();
        if ((certificados = this.a(certificados)) != null) {
            for (X509Certificate certificado : certificados.keySet()) {
                CertificadoHelper.validarUsoAvancadoChave((X509Certificate)certificado);
                if (this.validarCNPJ(certificado, cnpjBase)) {
                    certificadosValidos.put(certificado, (PrivateKey)certificados.get(certificado));
                    continue;
                }
                throw new DSGECnpjInvalidoException("CNPJ-Base consultado difere do CNPJ-Base do Certificado Digital");
            }
        }
        if (certificadosValidos.size() > 0) {
            return certificadosValidos;
        }
        return null;
    }

    private Map<X509Certificate, PrivateKey> a(Map<X509Certificate, PrivateKey> certificados) throws DSGECertificadoInvalidoException {
        HashMap<X509Certificate, PrivateKey> certificadosValidos = new HashMap<X509Certificate, PrivateKey>();
        for (X509Certificate certificado : certificados.keySet()) {
            try {
                CertificadoHelper.validarVersao((X509Certificate)certificado);
                CertificadoHelper.validarRestricoesBasicas((X509Certificate)certificado);
                CertificadoHelper.validarPeriodo((X509Certificate)certificado);
                CertificadoHelper.validarNomesAlternativos((X509Certificate)certificado);
                certificadosValidos.put(certificado, certificados.get(certificado));
                a.info((Object)("Certificado: " + certificado.getIssuerX500Principal().getName() + " OK."));
            }
            catch (Exception e) {
                a.info((Object)("Certificado: " + certificado.getIssuerX500Principal().getName() + " n\u00e3o \u00e9 valido."));
            }
        }
        if (certificadosValidos.size() > 0) {
            return certificadosValidos;
        }
        return null;
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificadosArquivo(String caminhoArquivo, String senha) throws DSGECertificadoException {
        HashMap<X509Certificate, PrivateKey> certificadosValidos = new HashMap<X509Certificate, PrivateKey>();
        File certFile = new File(caminhoArquivo);
        if (!certFile.exists()) {
            throw new DSGECertificadoException(MessageFormat.format("O arquivo {0} n\u00e3o foi encontrado.", caminhoArquivo));
        }
        if (!certFile.canRead()) {
            throw new DSGECertificadoException(MessageFormat.format("O arquivo {0} n\u00e3o possui permiss\u00e3o de leitura.", caminhoArquivo));
        }
        try {
            KeyStore keyStoreValida = KeyStore.getInstance("PKCS12");
            keyStoreValida.load(new FileInputStream(certFile), null);
        }
        catch (IOException e) {
            throw new DSGECertificadoSenhaException("Ocorreu um problema na tentativa de acesso ao certificado. Verifique se o arquivo informado \u00e9 um Certificado v\u00e1lido ou se o arquivo possui permiss\u00e3o de leitura.");
        }
        catch (Exception e) {
            throw new DSGECertificadoException("Ocorreu um problema na tentativa de acesso ao certificado. Verifique se o arquivo informado \u00e9 um Certificado v\u00e1lido ou se o arquivo possui permiss\u00e3o de leitura.");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(certFile), senha.toCharArray());
            String alias = "";
            X509Certificate certificate = null;
            PrivateKey privateKey = null;
            Enumeration<String> e = keyStore.aliases();
            while (e.hasMoreElements()) {
                alias = e.nextElement();
                certificate = (X509Certificate)keyStore.getCertificate(alias);
                privateKey = (PrivateKey)keyStore.getKey(alias, senha.toCharArray());
                certificadosValidos.put(certificate, privateKey);
            }
        }
        catch (IOException e) {
            throw new DSGECertificadoSenhaException("Por favor, verifique sua senha.");
        }
        catch (Exception e) {
            throw new DSGECertificadoException("Ocorreu um problema na tentativa de acesso ao certificado. Verifique se o arquivo informado \u00e9 um Certificado v\u00e1lido ou se o arquivo possui permiss\u00e3o de leitura.");
        }
        if (certificadosValidos.size() > 0) {
            return certificadosValidos;
        }
        return null;
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificadosRepositorio(RepositorioInfo repositorioInfo, String senha) throws DSGECertificadoException {
        long[] portasDisponiveis;
        HashMap<X509Certificate, PrivateKey> certificadosValidos = new HashMap<X509Certificate, PrivateKey>();
        File certFile = new File(repositorioInfo.getCaminho());
        if (!certFile.exists()) {
            throw new DSGECertificadoException(MessageFormat.format("A biblioteca {0} associada a este Smart Card/Token n\u00e3o foi encontrada.Por favor v\u00e1 no menu Sistema, Certificados e clique em Procurar Dispositivos.", repositorioInfo.getCaminho()));
        }
        if (!certFile.canRead()) {
            throw new DSGECertificadoException(MessageFormat.format("A biblioteca {0} associada a este Smart Card/Token  n\u00e3o possui permiss\u00e3o de leitura.", repositorioInfo.getCaminho()));
        }
        try {
            PKCS11 pkcs11 = PKCS11.getInstance((String)repositorioInfo.getCaminho(), (String)"C_GetFunctionList", (CK_C_INITIALIZE_ARGS)this.a, (boolean)false);
            portasDisponiveis = pkcs11.C_GetSlotList(false);
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new DSGECertificadoException("Ocorreu um erro ao tentar recuperar o certificado A3 - Verifique se o dispositivo est\u00e1 conectado corretamente.");
        }
        for (int i = 0; i < portasDisponiveis.length; ++i) {
            try {
                String label = new String(pkcs11.C_GetTokenInfo((long)portasDisponiveis[i]).label).trim();
                if (!repositorioInfo.getNome().equals(label)) continue;
                repositorioInfo.setSlot(Long.valueOf(portasDisponiveis[i]));
                SunPKCS11 pkcs11Provider = new SunPKCS11((InputStream)repositorioInfo.getFileConfiguration());
                Security.addProvider((Provider)pkcs11Provider);
                KeyStore keyStore = KeyStore.getInstance("PKCS11");
                keyStore.load(null, senha.toCharArray());
                String alias = "";
                X509Certificate certificate = null;
                PrivateKey privateKey = null;
                Enumeration<String> e = keyStore.aliases();
                while (e.hasMoreElements()) {
                    alias = e.nextElement();
                    certificate = (X509Certificate)keyStore.getCertificate(alias);
                    privateKey = (PrivateKey)keyStore.getKey(alias, null);
                    certificadosValidos.put(certificate, privateKey);
                }
                break;
            }
            catch (PKCS11Exception label) {
                continue;
            }
            catch (IOException e) {
                throw new DSGECertificadoSenhaException("Por favor, verifique sua senha.");
            }
            catch (Throwable e) {
                throw new DSGECertificadoException("Ocorreu um problema na tentativa de acesso ao certificado. Verifique se o arquivo informado \u00e9 um Certificado v\u00e1lido ou se o arquivo possui permiss\u00e3o de leitura.");
            }
        }
        if (certificadosValidos.size() > 0) {
            return certificadosValidos;
        }
        return null;
    }

    public Map<X509Certificate, PrivateKey> recuperarCertificadosRepositorioIE(RepositorioInfo repositorioInfo) throws DSGECertificadoException {
        HashMap<X509Certificate, PrivateKey> certificadosMap = new HashMap<X509Certificate, PrivateKey>();
        try {
            DSGEProvider.init();
            KeyStore ks = KeyStore.getInstance("Windows-MY", "DSGEProvider");
            ks.load(null, null);
            PrivateKey privateKey = (PrivateKey)ks.getKey(repositorioInfo.getNome(), null);
            X509Certificate certificate = (X509Certificate)ks.getCertificate(repositorioInfo.getNome());
            certificadosMap.put(certificate, privateKey);
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new DSGECertificadoException("N\u00e3o foi poss\u00edvel acessar o reposit\u00f3rio de Certificados do Windows.");
        }
        if (certificadosMap.size() > 0) {
            return certificadosMap;
        }
        return null;
    }

    public boolean validarCNPJ(X509Certificate certificado, String cnpjBase) throws DSGECertificadoInvalidoException {
        boolean retorno = false;
        if (cnpjBase == null || cnpjBase.equals("") || CertificadoHelper.recuperarCNPJ((X509Certificate)certificado).substring(0, 8).equals(cnpjBase.substring(0, 8))) {
            retorno = true;
        }
        return retorno;
    }

    @Deprecated
    public String assinarXML(X509Certificate certificado, PrivateKey privateKey, String referenceURI, Document document, String cnpjBase) throws DSGECertificadoException {
        return this.assinarXML(certificado, privateKey, referenceURI, document, cnpjBase, null);
    }

    @Deprecated
    public String assinarXML(X509Certificate certificado, PrivateKey privateKey, String referenceURI, Document document, String cnpjBase, String tagPaiAssinatura) throws DSGECertificadoException {
        String retorno = null;
        try {
            Node tagPai2;
            SignedInfo signedInfo;
            XMLSignatureFactory signatureFactory;
            KeyInfo keyInfo;
            if (this.validarCNPJ(certificado, cnpjBase)) {
                signatureFactory = XMLSignatureFactory.getInstance("DOM");
                ArrayList<Transform> listTransforms = new ArrayList<Transform>();
                listTransforms.add(signatureFactory.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec)null));
                listTransforms.add(signatureFactory.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (TransformParameterSpec)null));
                Reference reference = signatureFactory.newReference("#" + referenceURI, signatureFactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null), listTransforms, null, null);
                signedInfo = signatureFactory.newSignedInfo(signatureFactory.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (C14NMethodParameterSpec)null), signatureFactory.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null), Collections.singletonList(reference));
                KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();
                X509Data data = keyInfoFactory.newX509Data(Collections.singletonList(certificado));
                keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(data));
                Node tagPai2 = document.getDocumentElement();
                if (tagPaiAssinatura != null && !tagPaiAssinatura.isEmpty()) {
                    NodeList nodeList = document.getElementsByTagName(tagPaiAssinatura);
                    tagPai2 = nodeList.item(0);
                }
            } else {
                throw new DSGECnpjInvalidoException("CNPJ-Base consultado difere do CNPJ-Base do Certificado Digital");
            }
            DOMSignContext signContext = new DOMSignContext(privateKey, tagPai2);
            XMLSignature signature = signatureFactory.newXMLSignature(signedInfo, keyInfo);
            signature.sign(signContext);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter sw = new StringWriter();
            StreamResult streamResult = new StreamResult(sw);
            transformer.transform(new DOMSource(document), streamResult);
            retorno = sw.toString();
        }
        catch (DSGECnpjInvalidoException e) {
            throw e;
        }
        catch (Exception e) {
            throw new DSGECertificadoException("Ocorreu um problema durante a assinatura");
        }
        return retorno;
    }

    public boolean validarAssinaturaXML(Document document) throws DSGECertificadoException {
        int indexSignature = 0;
        boolean coreValidity = false;
        try {
            NodeList nl = document.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
            if (nl.getLength() == 0) {
                throw new DSGECertificadoException("O documento n\u00e3o est\u00e1 assinado.");
            }
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
            DOMValidateContext valContext = null;
            XMLSignature signature = null;
            while ((coreValidity = (signature = fac.unmarshalXMLSignature(valContext = new DOMValidateContext((KeySelector)new KeyValueKeySelector(), nl.item(indexSignature++)))).validate(valContext)) && indexSignature < nl.getLength()) {
            }
        }
        catch (Exception e) {
            a.error((Object)"Ocorreu um problema durante a vali\u00e7\u00e3o da assinatura", (Throwable)e);
            throw new DSGECertificadoException("Ocorreu um problema durante a vali\u00e7\u00e3o da assinatura");
        }
        return coreValidity;
    }

    public String assinarXML(X509Certificate certificado, PrivateKey privateKey, String referenceURI, String conteudoXML, String cnpjBase) throws DSGECertificadoException {
        return this.assinarXML(certificado, privateKey, referenceURI, conteudoXML, cnpjBase, null);
    }

    public String assinarXML(X509Certificate certificado, PrivateKey privateKey, String referenceURI, String conteudoXML, String cnpjBase, String tagPaiAssinatura) throws DSGECertificadoException {
        String retorno = null;
        try {
            XMLSignatureFactory signatureFactory;
            SignedInfo signedInfo;
            KeyInfo keyInfo;
            Document document;
            Node tagPai2;
            if (this.validarCNPJ(certificado, cnpjBase)) {
                String xml = conteudoXML;
                signatureFactory = XMLSignatureFactory.getInstance("DOM");
                ArrayList<Transform> listTransforms = new ArrayList<Transform>();
                listTransforms.add(signatureFactory.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec)null));
                listTransforms.add(signatureFactory.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (TransformParameterSpec)null));
                Reference reference = signatureFactory.newReference("#" + referenceURI, signatureFactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null), listTransforms, null, null);
                signedInfo = signatureFactory.newSignedInfo(signatureFactory.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (C14NMethodParameterSpec)null), signatureFactory.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null), Collections.singletonList(reference));
                KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();
                X509Data data = keyInfoFactory.newX509Data(Collections.singletonList(certificado));
                keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(data));
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                documentBuilderFactory.setNamespaceAware(true);
                document = documentBuilderFactory.newDocumentBuilder().parse(new InputSource(new InputStreamReader(new ByteArrayInputStream(xml.getBytes()))));
                this.a(document);
                Node tagPai2 = document.getDocumentElement();
                if (tagPaiAssinatura != null && !tagPaiAssinatura.isEmpty()) {
                    NodeList nodeList = document.getElementsByTagName(tagPaiAssinatura);
                    tagPai2 = nodeList.item(0);
                }
            } else {
                throw new DSGECnpjInvalidoException("CNPJ-Base consultado difere do CNPJ-Base do Certificado Digital");
            }
            DOMSignContext signContext = new DOMSignContext(privateKey, tagPai2);
            XMLSignature signature = signatureFactory.newXMLSignature(signedInfo, keyInfo);
            signature.sign(signContext);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter sw = new StringWriter();
            StreamResult streamResult = new StreamResult(sw);
            transformer.transform(new DOMSource(document), streamResult);
            retorno = sw.toString();
        }
        catch (DSGECnpjInvalidoException eCnpj) {
            throw eCnpj;
        }
        catch (Exception e) {
            throw new DSGECertificadoException("Ocorreu um problema durante a assinatura");
        }
        return retorno;
    }

    public boolean validarAssinaturaXML(String conteudoXML) throws DSGECertificadoException {
        int indexSignature = 0;
        boolean coreValidity = false;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            Document doc = dbf.newDocumentBuilder().parse(new InputSource(new InputStreamReader(new ByteArrayInputStream(conteudoXML.getBytes()))));
            NodeList nl = doc.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
            if (nl.getLength() == 0) {
                throw new DSGECertificadoException("O documento n\u00e3o est\u00e1 assinado.");
            }
            this.a(doc);
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
            DOMValidateContext valContext = null;
            XMLSignature signature = null;
            while ((coreValidity = (signature = fac.unmarshalXMLSignature(valContext = new DOMValidateContext((KeySelector)new KeyValueKeySelector(), nl.item(indexSignature++)))).validate(valContext)) && indexSignature < nl.getLength()) {
            }
        }
        catch (Exception e) {
            a.error((Object)"Ocorreu um problema durante a vali\u00e7\u00e3o da assinatura", (Throwable)e);
            throw new DSGECertificadoException("Ocorreu um problema durante a vali\u00e7\u00e3o da assinatura");
        }
        return coreValidity;
    }

    private void a(Document document) throws XPathExpressionException {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        XPathExpression expr = xpath.compile("//*[@Id]");
        NodeList elementsWithIdAttribute = (NodeList)expr.evaluate(document, XPathConstants.NODESET);
        if (elementsWithIdAttribute != null) {
            for (int i = 0; i < elementsWithIdAttribute.getLength(); ++i) {
                ((Element)elementsWithIdAttribute.item(i)).setIdAttribute("Id", true);
            }
        }
    }

    public static void main(String[] args) {
        try {
            new Certificado().procurarRepositorioIE();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

