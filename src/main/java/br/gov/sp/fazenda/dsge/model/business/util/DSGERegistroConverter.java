/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.to.Tag
 *  br.gov.sp.fazenda.dsge.common.to.TipoValidacao
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.ReflectionHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter$PredsCache
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter$TXTFileStructure
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 */
package br.gov.sp.fazenda.dsge.model.business.util;

import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.to.Tag;
import br.gov.sp.fazenda.dsge.common.to.TipoValidacao;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.ReflectionHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class DSGERegistroConverter {
    private Registro a;
    protected static HashMap<String, Element> layoutVersionMap = new HashMap<K, V>();
    protected static HashMap<String, HashMap<String, TXTFileStructure>> txtFileStructureVersionCache = new HashMap<K, V>();
    protected HashMap<String, TXTFileStructure> txtFileStructureMap = new HashMap<K, V>();
    private HashMap<String, Properties> a = new HashMap<K, V>();
    private HashMap<TXTFileStructure, PredsCache> b = new HashMap<K, V>();

    protected abstract String getSeparator();

    protected abstract InputStream getArquivoLayout(String var1);

    protected abstract Registro createBaseRegistro();

    protected abstract String getTipoRegistroVersao();

    protected abstract Properties loadMessageProperties() throws DSGEConverterException;

    protected abstract Map<String, String> getRegistroTOMap();

    private Registro a() {
        if (this.a == null) {
            this.a = this.createBaseRegistro();
        }
        return this.a;
    }

    public void clearBaseRegistro() {
        this.a = null;
    }

    private Element a(String version) throws DSGEConverterException {
        Element elem = (Element)layoutVersionMap.get(this.a().getTipoRegistro() + version);
        if (elem == null && (elem = this.b(version)) != null) {
            layoutVersionMap.put(this.a().getTipoRegistro() + version, elem);
        }
        return elem;
    }

    private void a(String version) throws DSGEConverterException {
        HashMap cachedStructureMap = (HashMap)txtFileStructureVersionCache.get(this.a().getTipoRegistro() + version);
        if (cachedStructureMap == null) {
            TXTFileStructure fS = new TXTFileStructure(this, this.a().getTipoRegistro(), 1, 1, -1);
            TXTFileStructure versionFS = new TXTFileStructure(this, this.getTipoRegistroVersao(), 1, Integer.MAX_VALUE, -1);
            fS.a(versionFS);
            this.txtFileStructureMap.put(this.getTipoRegistroVersao(), versionFS);
            this.txtFileStructureMap.put(this.a().getTipoRegistro(), fS);
            this.a(versionFS, this.a(version));
            this.a(fS);
            txtFileStructureVersionCache.put(this.a().getTipoRegistro() + version, this.txtFileStructureMap);
        } else {
            this.txtFileStructureMap = cachedStructureMap;
        }
    }

    public Registro getRegistroFromXML(InputStream in, String versionTag) throws DSGEConverterException {
        try {
            return this.getRegistroFromXML((Reader)new InputStreamReader(in, "UTF-8"), versionTag);
        }
        catch (DSGEConverterException e) {
            throw e;
        }
        catch (Throwable e) {
            throw new DSGEConverterException(e, e.getMessage());
        }
    }

    public Registro getRegistroFromXML(Reader reader, String versionTag) throws DSGEConverterException {
        try {
            Element versionElement;
            this.clearBaseRegistro();
            HashMap<K, V> objects = new HashMap<K, V>();
            this.a(objects);
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(new InputSource(reader));
            NodeList nodeList = xmlDocument.getElementsByTagName(versionTag);
            for (int i = 0; i < nodeList.getLength(); ++i) {
                versionElement = (Element)nodeList.item(i);
                String versao = versionElement.getAttribute("versao");
                Element layoutVersion = this.a(versao);
                this.a(layoutVersion, versionElement, objects, versao);
            }
            Registro base = (Registro)objects.get(this.a().getTipoRegistro());
            this.a(base, false, false);
            versionElement = base;
            return versionElement;
        }
        catch (Throwable e) {
            throw new DSGEConverterException(e, e.getMessage());
        }
        finally {
            this.clearBaseRegistro();
        }
    }

    private List<Tag> a(Element registroElement) throws DSGEConverterException {
        ArrayList<Tag> tags = new ArrayList<Tag>();
        NodeList nl = registroElement.getChildNodes();
        if (nl == null) {
            return tags;
        }
        for (int i = 0; i < nl.getLength(); ++i) {
            int xmlPos;
            String validNamesStr;
            String registrosStr;
            Element tagElem;
            if (!(nl.item(i) instanceof Element) || !(tagElem = (Element)nl.item(i)).getTagName().equals("tag")) continue;
            Tag tag = new Tag();
            String tagName = tagElem.getAttribute("nome");
            if (StringHelper.isBlankOrNull((Object)tagName)) continue;
            tag.setNome(tagName);
            try {
                xmlPos = Integer.parseInt(tagElem.getAttribute("xmlPos"));
            }
            catch (Exception e) {
                xmlPos = Integer.MAX_VALUE;
            }
            tag.setXmlPos(xmlPos);
            tag.setPrintIfEmpty(Boolean.parseBoolean(tagElem.getAttribute("printIfEmpty")));
            String camposStr = tagElem.getAttribute("campos");
            if (!StringHelper.isBlankOrNull((Object)camposStr)) {
                tag.setCampos(Arrays.asList(camposStr.split(",")));
            }
            if (!StringHelper.isBlankOrNull((Object)(registrosStr = tagElem.getAttribute("registros")))) {
                tag.setRegistros(Arrays.asList(registrosStr.split(",")));
            }
            if (!StringHelper.isBlankOrNull((Object)(validNamesStr = tagElem.getAttribute("validNames")))) {
                tag.setValidNames(Arrays.asList(validNamesStr.split(",")));
            }
            tags.add(tag);
        }
        return tags;
    }

    private Map<String, Tag> a(List<Tag> tags) throws DSGEConverterException {
        HashMap<String, Tag> map = new HashMap<String, Tag>();
        for (Tag tag : tags) {
            List campos = tag.getCampos();
            for (String nomeCampo : campos) {
                map.put(nomeCampo, tag);
            }
        }
        return map;
    }

    private Map<String, Tag> b(List<Tag> tags) throws DSGEConverterException {
        HashMap<String, Tag> map = new HashMap<String, Tag>();
        for (Tag tag : tags) {
            List registros = tag.getRegistros();
            for (String nomeRegistro : registros) {
                map.put(nomeRegistro, tag);
            }
        }
        return map;
    }

    private void a(Element regElement, Element xmlElement, Map<String, Registro> objects, String versao) throws DSGEConverterException {
        String xmlTagName = regElement.getAttribute("tagXml");
        Element xmlTagElement = xmlElement;
        if (xmlTagElement != null) {
            int xmlPos;
            Registro registroAtualTO = new Registro();
            registroAtualTO.setTipoRegistro(regElement.getTagName());
            registroAtualTO.setVersao(versao);
            registroAtualTO.setTagXml(xmlTagName);
            this.a(registroAtualTO, xmlTagElement, regElement, versao);
            this.a(registroAtualTO, regElement);
            try {
                xmlPos = Integer.parseInt(regElement.getAttribute("xmlPos"));
            }
            catch (Exception e) {
                xmlPos = Integer.MAX_VALUE;
            }
            registroAtualTO.setXmlPos(xmlPos);
            registroAtualTO.setPrintIfEmpty(Boolean.parseBoolean(regElement.getAttribute("printIfEmpty")));
            String regPai = regElement.getParentNode().getNodeName();
            Registro registroPaiAtualTO = objects.get(regPai);
            registroPaiAtualTO.add(registroAtualTO);
            objects.put(registroAtualTO.getTipoRegistro(), registroAtualTO);
        }
        NodeList children = regElement.getChildNodes();
        for (int i = 0; i < children.getLength(); ++i) {
            Node node = children.item(i);
            if (!(node instanceof Element) || "tag".equals(node.getNodeName()) || "campo".equals(node.getNodeName())) continue;
            Element regChildElement = (Element)node;
            String childTagName = regChildElement.getAttribute("tagXml");
            List tags = this.a(regElement);
            Map registroTagMap = this.b(tags);
            if (registroTagMap.containsKey(regChildElement.getTagName())) {
                Tag tag = (Tag)registroTagMap.get(regChildElement.getTagName());
                xmlElement = this.a(tag.getNome(), xmlElement);
            }
            if (StringHelper.isBlankOrNull((Object)childTagName)) {
                this.a(regChildElement, xmlElement, objects, versao);
                continue;
            }
            List xmlChildTagElements = this.a(childTagName, xmlElement);
            if (xmlChildTagElements == null) continue;
            for (Element xmlChildTagElement : xmlChildTagElements) {
                this.a(regChildElement, xmlChildTagElement, objects, versao);
            }
        }
    }

    private void a(Registro registroAtualTO, Element xmlElement, Element registroElement, String versao) throws DSGEConverterException {
        NodeList nl = registroElement.getChildNodes();
        List tags = this.a(registroElement);
        Map camposTagMap = this.a(tags);
        if (nl == null) {
            return;
        }
        for (int i = 0; i < nl.getLength(); ++i) {
            int xmlPos;
            Element tagCampo;
            String value;
            if (!(nl.item(i) instanceof Element) || !(tagCampo = (Element)nl.item(i)).getTagName().equals("campo")) continue;
            Campo c = new Campo();
            c.setNome(tagCampo.getAttribute("nome"));
            c.setXmlType(tagCampo.getAttribute("xmlType"));
            c.setValueExp(tagCampo.getAttribute("valueExp"));
            c.setXmlOnly("true".equalsIgnoreCase(tagCampo.getAttribute("xmlOnly")));
            try {
                xmlPos = Integer.parseInt(tagCampo.getAttribute("xmlPos"));
            }
            catch (Exception e) {
                xmlPos = Integer.MAX_VALUE;
            }
            c.setXmlPos(xmlPos);
            c.setPrintIfEmpty(Boolean.parseBoolean(tagCampo.getAttribute("printIfEmpty")));
            Element currentElement = xmlElement;
            Tag tag = (Tag)camposTagMap.get(c.getNome());
            if (tag != null) {
                String tagName = tag.getNome();
                if (tagName.startsWith("$")) {
                    Campo cc = registroAtualTO.getCampo(tagName.replaceFirst("[$]", ""));
                    tagName = cc != null ? cc.getValue() : null;
                }
                currentElement = this.a(tagName, xmlElement);
            }
            if (currentElement == null) {
                c.setValue(null);
            } else if (tagCampo.hasAttribute("fixedValue")) {
                c.setValue(tagCampo.getAttribute("fixedValue"));
            } else if ("attrib".equals(c.getXmlType())) {
                value = currentElement.getAttribute(c.getNome());
                if (value != null) {
                    value = value.trim();
                }
                c.setValue(value);
            } else if ("tag".equals(c.getXmlType())) {
                Element valueElement = this.a(c.getNome(), currentElement);
                value = this.a(valueElement);
                if (value != null) {
                    value = value.trim();
                }
                c.setValue(value);
            } else if ("text".equals(c.getXmlType())) {
                value = this.a(currentElement);
                if (value != null) {
                    value = value.trim();
                }
                c.setValue(value);
            } else {
                block3 : for (Tag t : tags) {
                    if (!("$" + c.getNome()).equals(t.getNome())) continue;
                    List validTagNameList = t.getValidNames();
                    if (validTagNameList != null && !validTagNameList.isEmpty()) {
                        for (String validTagName : validTagNameList) {
                            Element artificialTag = this.a(validTagName, currentElement);
                            if (artificialTag == null) continue;
                            c.setValue(artificialTag.getTagName());
                            continue block3;
                        }
                        continue;
                    }
                    Element artificialTag = this.a(currentElement, t.getXmlPos());
                    c.setValue(artificialTag.getTagName());
                }
            }
            this.a(c, tagCampo, versao);
            registroAtualTO.addCampo(c);
        }
    }

    public List<ExpImpInterface> getTOFromRegistro(Registro registro) throws DSGEConverterException {
        ArrayList<ExpImpInterface> listTOs;
        listTOs = new ArrayList<ExpImpInterface>();
        try {
            this.clearBaseRegistro();
            Map registroTOMap = this.getRegistroTOMap();
            List children = registro.getChildren();
            for (Registro child : children) {
                String className = (String)registroTOMap.get(child.getTipoRegistro());
                if (className != null) {
                    Class<?> c = Class.forName(className);
                    ExpImpInterface to = (ExpImpInterface)c.newInstance();
                    to.setVersao(child.getVersao());
                    LinkedHashMap campos = child.getCampos();
                    for (String nomeCampo : campos.keySet()) {
                        Campo campo = (Campo)campos.get(nomeCampo);
                        if (campo.isXmlOnly()) continue;
                        ReflectionHelper.setFieldValueByReflection((Object)to, (String)nomeCampo, (String)campo.getValue());
                    }
                    listTOs.add(to);
                }
                listTOs.addAll(this.getTOFromRegistro(child));
            }
        }
        catch (Throwable e) {
            throw new DSGEConverterException(e, e.getMessage());
        }
        finally {
            this.clearBaseRegistro();
        }
        return listTOs;
    }

    public Registro getRegistroFromTOs(List<ExpImpInterface> toList) throws DSGEConverterException {
        try {
            ExpImpInterface to2;
            this.clearBaseRegistro();
            HashMap<K, V> objects = new HashMap<K, V>();
            this.a(objects);
            for (ExpImpInterface to2 : toList) {
                Element layoutVersion = this.a(to2.getVersao());
                this.a(to2, objects, layoutVersion);
            }
            Registro base = (Registro)objects.get(this.a().getTipoRegistro());
            this.a(base, false, false);
            to2 = base;
            return to2;
        }
        catch (Throwable e) {
            throw new DSGEConverterException(e, e.getMessage());
        }
        finally {
            this.clearBaseRegistro();
        }
    }

    private void a(ExpImpInterface to, Map<String, Registro> objects, Element layoutVersion) throws DSGEConverterException {
        int xmlPos;
        Element registroElement = this.a(to.getNomeRegistro(), layoutVersion);
        if (registroElement == null) {
            throw new DSGEConverterException((Throwable)new Exception(), "Registro " + to.getNomeRegistro() + " n\u00e3o encontrado no layout");
        }
        Registro registroAtualTO = new Registro();
        registroAtualTO.setVersao(to.getVersao());
        registroAtualTO.setTipoRegistro(registroElement.getTagName());
        registroAtualTO.setTagXml(registroElement.getAttribute("tagXml"));
        try {
            xmlPos = Integer.parseInt(registroElement.getAttribute("xmlPos"));
        }
        catch (Exception e) {
            xmlPos = Integer.MAX_VALUE;
        }
        registroAtualTO.setXmlPos(xmlPos);
        registroAtualTO.setPrintIfEmpty(Boolean.parseBoolean(registroElement.getAttribute("printIfEmpty")));
        this.a(registroAtualTO, to, registroElement);
        this.a(registroAtualTO, registroElement);
        String tipoClassePai = registroElement.getParentNode().getNodeName();
        Registro registroPaiAtualTO = objects.get(tipoClassePai);
        registroPaiAtualTO.add(registroAtualTO);
        objects.put(registroAtualTO.getTipoRegistro(), registroAtualTO);
    }

    private void a(Registro registroAtualTO, ExpImpInterface to, Element registroElement) throws DSGEConverterException {
        try {
            NodeList nl = registroElement.getChildNodes();
            if (nl == null) {
                return;
            }
            for (int i = 0; i < nl.getLength(); ++i) {
                int xmlPos;
                Element tagCampo;
                if (!(nl.item(i) instanceof Element) || !(tagCampo = (Element)nl.item(i)).getTagName().equals("campo")) continue;
                Campo c = new Campo();
                c.setNome(tagCampo.getAttribute("nome"));
                c.setXmlType(tagCampo.getAttribute("xmlType"));
                c.setValueExp(tagCampo.getAttribute("valueExp"));
                c.setXmlOnly("true".equalsIgnoreCase(tagCampo.getAttribute("xmlOnly")));
                try {
                    xmlPos = Integer.parseInt(tagCampo.getAttribute("xmlPos"));
                }
                catch (Exception e) {
                    xmlPos = Integer.MAX_VALUE;
                }
                c.setXmlPos(xmlPos);
                c.setPrintIfEmpty(Boolean.parseBoolean(tagCampo.getAttribute("printIfEmpty")));
                if (tagCampo.hasAttribute("fixedValue")) {
                    c.setValue(tagCampo.getAttribute("fixedValue"));
                } else {
                    String value = ReflectionHelper.getFieldValueByReflection((Object)to, (String)c.getNome());
                    if (value != null) {
                        value = value.trim();
                    }
                    c.setValue(value);
                }
                this.a(c, tagCampo, to.getVersao());
                registroAtualTO.addCampo(c);
            }
        }
        catch (Throwable t) {
            throw new DSGEConverterException(t, t.getMessage());
        }
    }

    public Registro getRegistroFromTXT(Scanner conteudoArquivo) throws DSGEConverterException {
        this.txtFileStructureMap = new HashMap<K, V>();
        try {
            Registro base;
            int lineNumber = 1;
            String ultimoRegistro = null;
            this.clearBaseRegistro();
            LinkedHashMap<String, Registro> objects = new LinkedHashMap<String, Registro>();
            String registro = conteudoArquivo.nextLine();
            String[] registroArray = registro.split(this.a());
            this.a(objects);
            if (registroArray.length < 2 || StringHelper.isBlankOrNull((Object)registroArray[1])) {
                this.a(objects, this.a().getTipoRegistro(), this.a().getTipoRegistro(), lineNumber, MessageFormat.format(DSGEMessageConstants.QTDE_REGISTROS_NAO_INFORMADA, this.getTipoRegistroVersao()));
                Registro registro2 = (Registro)objects.get(this.a().getTipoRegistro());
                return registro2;
            }
            String qtde = registroArray[1].trim();
            try {
                int n = Integer.parseInt(qtde);
                if (n < 0) {
                    this.a(objects, this.a().getTipoRegistro(), this.a().getTipoRegistro(), lineNumber, MessageFormat.format(DSGEMessageConstants.QTDE_REGISTROS_DEVE_SER_NUMERO_NATURAL, this.getTipoRegistroVersao(), qtde));
                    Registro registro3 = (Registro)objects.get(this.a().getTipoRegistro());
                    return registro3;
                }
            }
            catch (Exception e) {
                this.a(objects, this.a().getTipoRegistro(), this.a().getTipoRegistro(), lineNumber, MessageFormat.format(DSGEMessageConstants.QTDE_REGISTROS_DEVE_SER_NUMERO_NATURAL, this.getTipoRegistroVersao(), qtde));
                Registro registro4 = (Registro)objects.get(this.a().getTipoRegistro());
                return registro4;
            }
            this.a().getCampo("qtde").setValue(qtde);
            Element layoutVersion = null;
            String currentVersion = null;
            boolean registroOK = true;
            while (conteudoArquivo.hasNext() && (registro = conteudoArquivo.nextLine()) != null) {
                ++lineNumber;
                if (StringHelper.isBlankOrNull((Object)registro)) continue;
                if (!registroOK) {
                    boolean hasNext = false;
                    while (conteudoArquivo.hasNext() && (registro = conteudoArquivo.nextLine()) != null) {
                        String registroAtual;
                        ++lineNumber;
                        if (StringHelper.isBlankOrNull((Object)registro) || !(registroAtual = (registroArray = registro.split(this.a()))[0].replaceAll(" ", "")).equals(this.getTipoRegistroVersao())) continue;
                        hasNext = true;
                        break;
                    }
                    if (!hasNext) {
                        Registro registro5 = base = (Registro)objects.get(this.a().getTipoRegistro());
                        return registro5;
                    }
                }
                if ((registroArray = registro.split(this.a())).length == 0) {
                    this.a(objects, this.a().getTipoRegistro(), "", lineNumber, DSGEMessageConstants.MSG_IMPORTACAO_ERRO_SINTAXE);
                    registroOK = false;
                    continue;
                }
                String registroAtual = registroArray[0].replaceAll(" ", "");
                if (registroAtual.equals(this.getTipoRegistroVersao())) {
                    base = this.a();
                    ultimoRegistro = null;
                    objects.clear();
                    objects.put(base.getTipoRegistro(), base);
                    if (registroArray.length < 2) {
                        this.a(objects, this.a().getTipoRegistro(), registroAtual, lineNumber, DSGEMessageConstants.MSG_IMPORTACAO_REGISTRO_VERSAO_NAO_ENCONTRADA);
                        registroOK = false;
                        continue;
                    }
                    currentVersion = registroArray[1].trim();
                    layoutVersion = this.a(currentVersion);
                    if (layoutVersion == null) {
                        this.a(objects, this.a().getTipoRegistro(), registroAtual, lineNumber, DSGEMessageConstants.MSG_IMPORTACAO_REGISTRO_VERSAO_INVALIDA);
                        registroOK = false;
                        continue;
                    }
                    this.a(currentVersion);
                }
                if (layoutVersion == null || currentVersion == null) {
                    this.a(objects, this.a().getTipoRegistro(), registroAtual, lineNumber, MessageFormat.format(DSGEMessageConstants.MSG_IMPORTACAO_TIPO_REGISTRO_NAO_ENCONTRADO, this.getTipoRegistroVersao()));
                    registroOK = false;
                    continue;
                }
                registroOK = this.a(registroAtual, ultimoRegistro, registroArray, objects, layoutVersion, currentVersion, lineNumber);
                ultimoRegistro = registroAtual;
            }
            Registro base2 = (Registro)objects.get(this.a().getTipoRegistro());
            if (registroOK) {
                this.a(base2, true, true);
            }
            base = base2;
            return base;
        }
        catch (Throwable e) {
            e.printStackTrace();
            throw new DSGEConverterException(e, e.getMessage());
        }
        finally {
            this.clearBaseRegistro();
        }
    }

    private void a(TXTFileStructure estruturaArquivo) {
        estruturaArquivo.b();
        List children = estruturaArquivo.a();
        for (TXTFileStructure child : children) {
            this.a(child);
        }
    }

    private void a(TXTFileStructure estruturaArquivo, Element element) {
        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); ++i) {
            int min;
            int exclusivity;
            int max;
            Node node;
            block14 : {
                node = nodeList.item(i);
                if (!(node instanceof Element) || "campo".equals(node.getNodeName()) || "tag".equals(node.getNodeName())) continue;
                String exclusivityStr = ((Element)node).getAttribute("exclusivity");
                String minStr = ((Element)node).getAttribute("min");
                String maxStr = ((Element)node).getAttribute("max");
                if (!StringHelper.isBlankOrNull((Object)exclusivityStr)) {
                    try {
                        exclusivity = Integer.parseInt(exclusivityStr);
                    }
                    catch (Exception e) {
                        exclusivity = -1;
                    }
                } else {
                    exclusivity = -1;
                }
                if (!StringHelper.isBlankOrNull((Object)minStr)) {
                    try {
                        min = Integer.parseInt(minStr);
                    }
                    catch (Exception e) {
                        min = 0;
                    }
                } else {
                    min = 0;
                }
                if (!StringHelper.isBlankOrNull((Object)maxStr)) {
                    try {
                        if ("*".equals(maxStr.trim())) {
                            max = Integer.MAX_VALUE;
                            break block14;
                        }
                        max = Integer.parseInt(maxStr);
                    }
                    catch (Exception e) {
                        max = Integer.MAX_VALUE;
                    }
                } else {
                    max = Integer.MAX_VALUE;
                }
            }
            TXTFileStructure eA = new TXTFileStructure(this, node.getNodeName(), min, max, exclusivity);
            estruturaArquivo.a(eA);
            this.txtFileStructureMap.put(node.getNodeName(), eA);
            this.a(eA, (Element)node);
        }
    }

    private void a(Map<String, Registro> objects, String tipoClassePai, String tipoRegistro, int linha, String mensagem) {
        Registro registroAtualTO = new Registro();
        registroAtualTO.setTipoRegistro(tipoRegistro);
        registroAtualTO.setLineNumber(linha);
        registroAtualTO.addError("Linha " + linha + ": " + mensagem);
        Registro registroPaiAtualTO = objects.get(tipoClassePai);
        registroPaiAtualTO.add(registroAtualTO);
        objects.put(registroAtualTO.getTipoRegistro(), registroAtualTO);
    }

    private void a(Map<String, Registro> objects) throws DSGEConverterException {
        objects.put(this.a().getTipoRegistro(), this.a());
    }

    private Element a(Element element, int pos) {
        if (element == null) {
            return null;
        }
        NodeList nodeList = element.getChildNodes();
        if (nodeList == null) {
            return null;
        }
        int k = 0;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            if (!(nodeList.item(i) instanceof Element)) continue;
            if (k == pos) {
                return (Element)nodeList.item(i);
            }
            ++k;
        }
        return null;
    }

    private String a(Element element) {
        if (element == null) {
            return "";
        }
        NodeList nodeList = element.getChildNodes();
        if (nodeList == null) {
            return "";
        }
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node = nodeList.item(i);
            if (!"#text".equals(node.getNodeName())) continue;
            return node.getTextContent();
        }
        return "";
    }

    private Element a(String nome, Element element) throws DSGEConverterException {
        if (nome == null || element == null) {
            return null;
        }
        Node node = null;
        if (element.getTagName().equals(nome)) {
            node = element;
        } else {
            NodeList nodeList = element.getElementsByTagName(nome);
            if (nodeList.getLength() == 0) {
                return null;
            }
            node = nodeList.item(0);
        }
        return node;
    }

    private List<Element> a(String nome, Element element) throws DSGEConverterException {
        if (nome == null || element == null) {
            return null;
        }
        ArrayList<Element> elements = new ArrayList<Element>();
        NodeList nodeList = element.getChildNodes();
        if (nodeList.getLength() == 0) {
            return elements;
        }
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node = nodeList.item(i);
            if (!(node instanceof Element) || !node.getNodeName().equals(nome)) continue;
            elements.add((Element)node);
        }
        return elements;
    }

    private boolean a(String nomeRegistro, String ultimoRegistro, String[] registroArray, Map<String, Registro> objects, Element layoutVersion, String currentVersion, int lineNumber) throws DSGEConverterException {
        int xmlPos;
        if (StringHelper.isBlankOrNull((Object)nomeRegistro)) {
            this.a().setLineNumber(lineNumber);
            this.a().addError("Linha " + lineNumber + ": " + DSGEMessageConstants.MSG_IMPORTACAO_TIPO_REGISTRO_NAO_INFORMADO);
            return false;
        }
        Element registroElement = this.a(nomeRegistro, layoutVersion);
        if (registroElement == null) {
            this.a().setLineNumber(lineNumber);
            this.a().addError("Linha " + lineNumber + ": " + MessageFormat.format(DSGEMessageConstants.MSG_IMPORTACAO_TIPO_REGISTRO_NAO_ENCONTRADO, nomeRegistro));
            return false;
        }
        Registro registroAtualTO = new Registro();
        registroAtualTO.setLineNumber(lineNumber);
        registroAtualTO.setVersao(currentVersion);
        registroAtualTO.setTipoRegistro(registroElement.getTagName());
        registroAtualTO.setTagXml(registroElement.getAttribute("tagXml"));
        try {
            xmlPos = Integer.parseInt(registroElement.getAttribute("xmlPos"));
        }
        catch (Exception e) {
            xmlPos = Integer.MAX_VALUE;
        }
        registroAtualTO.setXmlPos(xmlPos);
        registroAtualTO.setPrintIfEmpty(Boolean.parseBoolean(registroElement.getAttribute("printIfEmpty")));
        this.a(registroAtualTO, registroArray, registroElement, currentVersion);
        this.a(registroAtualTO, registroElement);
        String tipoClassePai = registroElement.getParentNode().getNodeName();
        Registro registroPaiAtualTO = objects.get(tipoClassePai);
        if (registroPaiAtualTO == null) {
            this.a().setLineNumber(lineNumber);
            this.a().addError("Linha " + lineNumber + ": " + MessageFormat.format(DSGEMessageConstants.MSG_REGISTRO_PAI_NAO_ENCONTRADO, nomeRegistro, tipoClassePai));
            return false;
        }
        TXTFileStructure eA = (TXTFileStructure)this.txtFileStructureMap.get(registroAtualTO.getTipoRegistro());
        if (!eA.a(ultimoRegistro)) {
            this.a().setLineNumber(lineNumber);
            this.a().addError("Linha " + lineNumber + ": " + MessageFormat.format(DSGEMessageConstants.MSG_PREDECESSOR_ERRADO, registroAtualTO.getTipoRegistro(), ultimoRegistro));
            return false;
        }
        registroPaiAtualTO.add(registroAtualTO);
        objects.put(registroAtualTO.getTipoRegistro(), registroAtualTO);
        return true;
    }

    private void a(Registro registroAtualTO, Element registroElement) throws DSGEConverterException {
        LinkedHashMap camposMap = registroAtualTO.getCampos();
        NodeList nl = registroElement.getChildNodes();
        if (nl == null) {
            return;
        }
        for (int i = 0; i < nl.getLength(); ++i) {
            int xmlPos;
            Element tagElem;
            String validNamesStr;
            String registrosStr;
            if (!(nl.item(i) instanceof Element) || !(tagElem = (Element)nl.item(i)).getTagName().equals("tag")) continue;
            Tag tag = new Tag();
            String tagName = tagElem.getAttribute("nome");
            if (tagName.startsWith("$")) {
                tagName = ((Campo)camposMap.get(tagName.replaceFirst("[$]", ""))).getValue();
            }
            if (StringHelper.isBlankOrNull((Object)tagName)) continue;
            tag.setNome(tagName);
            try {
                xmlPos = Integer.parseInt(tagElem.getAttribute("xmlPos"));
            }
            catch (Exception e) {
                xmlPos = Integer.MAX_VALUE;
            }
            tag.setXmlPos(xmlPos);
            tag.setPrintIfEmpty(Boolean.parseBoolean(tagElem.getAttribute("printIfEmpty")));
            String camposStr = tagElem.getAttribute("campos");
            if (!StringHelper.isBlankOrNull((Object)camposStr)) {
                tag.setCampos(Arrays.asList(camposStr.split(",")));
            }
            if (!StringHelper.isBlankOrNull((Object)(registrosStr = tagElem.getAttribute("registros")))) {
                tag.setRegistros(Arrays.asList(registrosStr.split(",")));
            }
            if (!StringHelper.isBlankOrNull((Object)(validNamesStr = tagElem.getAttribute("validNames")))) {
                tag.setValidNames(Arrays.asList(validNamesStr.split(",")));
            }
            registroAtualTO.addTag(tag);
        }
    }

    private void a(Registro registroAtualTO, String[] registroArray, Element registroElement, String versao) throws DSGEConverterException {
        NodeList nl = registroElement.getChildNodes();
        if (nl == null) {
            return;
        }
        int k = 1;
        for (int i = 0; i < nl.getLength(); ++i) {
            int xmlPos;
            Element tagCampo;
            if (!(nl.item(i) instanceof Element) || !(tagCampo = (Element)nl.item(i)).getTagName().equals("campo")) continue;
            Campo c = new Campo();
            c.setNome(tagCampo.getAttribute("nome"));
            c.setXmlType(tagCampo.getAttribute("xmlType"));
            c.setValueExp(tagCampo.getAttribute("valueExp"));
            c.setXmlOnly("true".equalsIgnoreCase(tagCampo.getAttribute("xmlOnly")));
            try {
                xmlPos = Integer.parseInt(tagCampo.getAttribute("xmlPos"));
            }
            catch (Exception e) {
                xmlPos = Integer.MAX_VALUE;
            }
            c.setXmlPos(xmlPos);
            c.setPrintIfEmpty(Boolean.parseBoolean(tagCampo.getAttribute("printIfEmpty")));
            if (tagCampo.hasAttribute("fixedValue")) {
                c.setValue(tagCampo.getAttribute("fixedValue"));
                ++k;
            } else {
                String value = "";
                if (k < registroArray.length) {
                    value = registroArray[k++];
                }
                if (value != null) {
                    value = value.trim();
                }
                c.setValue(value);
            }
            this.a(c, tagCampo, versao);
            registroAtualTO.addCampo(c);
        }
    }

    private void a(Campo c, Element tagCampo, String versao) throws DSGEConverterException {
        NodeList nlTv = tagCampo.getElementsByTagName("tipoValidacao");
        if (nlTv == null) {
            return;
        }
        Element tipoValidacaoTag = (Element)nlTv.item(0);
        if (tipoValidacaoTag == null) {
            return;
        }
        NodeList nl = tipoValidacaoTag.getElementsByTagName("*");
        for (int i = 0; i < nl.getLength(); ++i) {
            TipoValidacao tipoVal = new TipoValidacao();
            Element tagTipo = (Element)nl.item(i);
            try {
                tipoVal.setTipoValidacao(Class.forName("br.gov.sp.fazenda.dsge.common.validator." + tagTipo.getTagName().substring(0, 1).toUpperCase() + tagTipo.getTagName().substring(1) + "Validator"));
                NamedNodeMap nodeMap = tagTipo.getAttributes();
                if (nodeMap != null) {
                    for (int k = 0; k < nodeMap.getLength(); ++k) {
                        Node node;
                        tipoVal.addParameter(node.getNodeName(), (node = nodeMap.item(k)).getNodeName().equalsIgnoreCase("message") ? this.a(versao).getProperty(node.getNodeValue()) : node.getNodeValue());
                    }
                }
            }
            catch (ClassNotFoundException e) {
                throw new DSGEConverterException((Throwable)e, e.getMessage());
            }
            catch (DOMException e) {
                throw new DSGEConverterException((Throwable)e, e.getMessage());
            }
            c.addTipoValidacao(tipoVal);
        }
    }

    private void a(Registro registro, boolean verificarQtdeCalculada, boolean verificarMaxMin) {
        TXTFileStructure eA;
        LinkedHashMap camposMap = registro.getCampos();
        Iterator<K> it = camposMap.keySet().iterator();
        while (it.hasNext()) {
            Campo campo = (Campo)camposMap.get(it.next());
            String valueExp = campo.getValueExp();
            if (StringHelper.isBlankOrNull((Object)valueExp) || !valueExp.startsWith("#")) continue;
            String tipoRegistro = valueExp.replaceFirst("[#]", "");
            int count = registro.getChildrenCount(tipoRegistro);
            if (verificarQtdeCalculada) {
                String value = campo.getValue() == null ? "" : campo.getValue().trim();
                String correctValue = "" + count + "";
                if (!correctValue.equals(value)) {
                    registro.addError(MessageFormat.format(DSGEMessageConstants.MSG_ERRO_QTDE_REGISTROS_INFORMADOS, tipoRegistro, value, correctValue));
                }
            }
            campo.setValue("" + count + "");
        }
        if (verificarMaxMin && (eA = (TXTFileStructure)this.txtFileStructureMap.get(registro.getTipoRegistro())) != null) {
            List childsEA = eA.a();
            for (TXTFileStructure fS : childsEA) {
                boolean obrigatorio = fS.b() > 0 && fS.c() < 0;
                int count = registro.getChildrenCount(fS.a());
                if (obrigatorio && count == 0) {
                    registro.addError(MessageFormat.format(DSGEMessageConstants.MSG_ERRO_REGISTRO_X_OBRIGATORIO, fS.a()));
                }
                if (count <= fS.a()) continue;
                registro.addError(MessageFormat.format(DSGEMessageConstants.MSG_ERRO_REGISTRO_X_MAXIMO_ULTRAPASSADO, fS.a(), count, fS.a()));
            }
        }
        for (Registro child : registro.getChildren()) {
            this.a(child, verificarQtdeCalculada, verificarMaxMin);
        }
    }

    private Properties a(String versao) throws DSGEConverterException {
        Properties p = (Properties)this.a.get(versao);
        if (p == null) {
            p = this.loadMessageProperties();
            this.a.put(versao, p);
        }
        return p;
    }

    private String a() {
        return "[" + this.getSeparator() + "]";
    }

    private Element b(String version) throws DSGEConverterException {
        NodeList versionNodes = null;
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            InputStream inputStream = this.getArquivoLayout(version);
            if (inputStream == null) {
                return null;
            }
            Document layoutArquivoDocument = builder.parse(inputStream);
            versionNodes = layoutArquivoDocument.getElementsByTagName(this.getTipoRegistroVersao());
        }
        catch (ParserConfigurationException e) {
            throw new DSGEConverterException((Throwable)e, e.getMessage());
        }
        catch (SAXException e) {
            throw new DSGEConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGEConverterException((Throwable)e, e.getMessage());
        }
        return (Element)versionNodes.item(0);
    }

    static /* synthetic */ HashMap a(DSGERegistroConverter x0) {
        return x0.b;
    }
}

