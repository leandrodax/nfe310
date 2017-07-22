/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Registro
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Util
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ValidacaoVersao
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.TipoValidacao
 *  br.gov.sp.fazenda.dsge.common.validator.PatternValidator
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.model.business.importacao.Registro;
import br.gov.sp.fazenda.dsen.model.business.importacao.ValidacaoVersao;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.TipoValidacao;
import br.gov.sp.fazenda.dsge.common.validator.PatternValidator;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Util {
    private static final String a = "validationDefinition";
    private static Util a;
    private String b;
    private static Properties a;
    private static HashMap<String, ValidacaoVersao> a;

    private Util() {
    }

    public static Util getInstance() {
        if (a == null) {
            a = new Util();
            try {
                a.load(Util.class.getResourceAsStream("importacaoMensagem.properties"));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    private void a() {
        a = new HashMap();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(this.getClass().getResourceAsStream("validationDefinition_" + this.b + ExtensaoArquivoEnum.XML.getExtensao()));
            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("validacao");
            for (int i = 0; i < nl.getLength(); ++i) {
                ValidacaoVersao validacaoVersao = new ValidacaoVersao();
                Element tagValidacaoVersao = (Element)nl.item(i);
                validacaoVersao.setVersao(tagValidacaoVersao.getAttribute("versao"));
                this.a(validacaoVersao, tagValidacaoVersao);
                a.put(validacaoVersao.getVersao(), validacaoVersao);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(ValidacaoVersao validacaoVersao, Element tagValidacaoVersao) {
        NodeList nl = tagValidacaoVersao.getElementsByTagName("registro");
        for (int i = 0; i < nl.getLength(); ++i) {
            Registro registro = new Registro();
            Element tagRegistro = (Element)nl.item(i);
            registro.setTipo(tagRegistro.getAttribute("tipo"));
            this.a(registro, tagRegistro);
            validacaoVersao.addRegistro(registro);
        }
    }

    private void a(Registro registro, Element tagRegistro) {
        NodeList nl = tagRegistro.getElementsByTagName("campo");
        for (int i = 0; i < nl.getLength(); ++i) {
            Campo c = new Campo();
            Element tagCampo = (Element)nl.item(i);
            c.setNome(tagCampo.getAttribute("nome"));
            this.a(c, tagCampo);
            registro.addCampo(c);
        }
    }

    private void a(Campo c, Element tagCampo) {
        Element tipoValidacaoTag = (Element)tagCampo.getElementsByTagName("tipoValidacao").item(0);
        TipoValidacao tipoVal = new TipoValidacao();
        NodeList nl = tipoValidacaoTag.getElementsByTagName("*");
        for (int i = 0; i < nl.getLength(); ++i) {
            tipoVal = new TipoValidacao();
            Element tagTipo = (Element)nl.item(i);
            try {
                tipoVal.setTipoValidacao(Class.forName("br.gov.sp.fazenda.dsge.common.validator." + tagTipo.getTagName().substring(0, 1).toUpperCase() + tagTipo.getTagName().substring(1) + "Validator"));
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            NamedNodeMap nodeMap = tagTipo.getAttributes();
            if (nodeMap != null) {
                for (int k = 0; k < nodeMap.getLength(); ++k) {
                    Node node;
                    tipoVal.addParameter(node.getNodeName(), (node = nodeMap.item(k)).getNodeName().equalsIgnoreCase("mensagem") ? a.getProperty(node.getNodeValue()) : node.getNodeValue());
                }
            }
            c.addTipoValidacao(tipoVal);
        }
        tipoVal = new TipoValidacao();
        tipoVal.setTipoValidacao(PatternValidator.class);
        tipoVal.addParameter("regex", "[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}");
        tipoVal.addParameter("mensagem", "Conteudo inv\u00e1lido!");
        c.addTipoValidacao(tipoVal);
    }

    public ValidacaoVersao getValidacaoByVersion(String version) {
        this.b = version;
        if (a == null) {
            this.a();
        }
        return (ValidacaoVersao)a.get(version);
    }

    static {
        a = new Properties();
    }
}

