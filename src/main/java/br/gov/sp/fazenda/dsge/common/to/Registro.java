/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.to.Registro$XmlPosition
 *  br.gov.sp.fazenda.dsge.common.to.Tag
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.to.Tag;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Registro
extends BaseTO {
    private static final long a = 2097145189901879123L;
    private String a;
    private String b;
    private int a;
    private String c;
    private boolean a;
    private int b;
    protected LinkedHashMap<String, Campo> campos = new LinkedHashMap();
    protected ArrayList<Registro> children = new ArrayList();
    protected List<Tag> tags = new ArrayList();

    public void add(Registro registro) {
        this.children.add(registro);
    }

    public boolean remove(Registro registro) {
        return this.children.remove((Object)registro);
    }

    public Registro getChild(int index) {
        return (Registro)this.children.get(index);
    }

    public void addCampo(Campo campo) {
        this.campos.put(campo.getNome(), campo);
    }

    public Campo getCampo(String nome) {
        return (Campo)this.campos.get(nome);
    }

    public List<Registro> getChildren() {
        return this.children;
    }

    public List<Registro> getChildren(String tipoRegistro) {
        ArrayList<Registro> resultList = new ArrayList<Registro>();
        for (Registro r : this.children) {
            if (!tipoRegistro.equals(r.getTipoRegistro())) continue;
            resultList.add(r);
        }
        return resultList;
    }

    public int getChildrenCount(String tipoRegistro) {
        return this.getChildren(tipoRegistro).size();
    }

    public LinkedHashMap<String, Campo> getCampos() {
        return this.campos;
    }

    public String toXML() {
        LinkedHashMap camposList = (LinkedHashMap)this.campos.clone();
        StringBuffer xml = new StringBuffer();
        ArrayList childrenList = (ArrayList)this.children.clone();
        ArrayList<XmlPosition> xmlPosList = new ArrayList<XmlPosition>();
        for (Tag tag : this.tags) {
            String tagXml = this.a(tag, (Map)camposList, childrenList);
            if (StringHelper.isBlankOrNull((Object)tagXml) && !tag.isPrintIfEmpty()) continue;
            xmlPosList.add(new XmlPosition(this, tag.getXmlPos(), tagXml));
        }
        for (String nome : camposList.keySet()) {
            Campo campo = (Campo)camposList.get(nome);
            if ("tag".equalsIgnoreCase(campo.getXmlType())) {
                if (StringHelper.isBlankOrNull((Object)campo.getValue()) && !campo.isPrintIfEmpty()) continue;
                xmlPosList.add(new XmlPosition(this, campo.getXmlPos(), "<" + campo.getNome() + ">" + StringHelper.encodeSpecialXMLChars((String)campo.getValue()) + "</" + campo.getNome() + ">"));
                continue;
            }
            if (!"text".equalsIgnoreCase(campo.getXmlType())) continue;
            xmlPosList.add(new XmlPosition(this, campo.getXmlPos(), StringHelper.encodeSpecialXMLChars((String)campo.getValue())));
        }
        for (Registro child : childrenList) {
            String childXml = child.toXML();
            if (StringHelper.isBlankOrNull((Object)childXml) && !child.isPrintIfEmpty()) continue;
            xmlPosList.add(new XmlPosition(this, child.getXmlPos(), childXml));
        }
        if (xmlPosList.isEmpty() && !this.isPrintIfEmpty()) {
            return xml.toString();
        }
        if (!StringHelper.isBlankOrNull((Object)this.b)) {
            xml.append("<" + this.b);
            for (String nome : camposList.keySet()) {
                Campo campo = (Campo)camposList.get(nome);
                if (StringHelper.isBlankOrNull((Object)campo.getValue()) && !campo.isPrintIfEmpty() || !"attrib".equalsIgnoreCase(campo.getXmlType())) continue;
                xml.append(" " + campo.getNome() + "=\"" + StringHelper.encodeSpecialXMLChars((String)campo.getValue()) + "\"");
            }
            xml.append(">");
        }
        Collections.sort(xmlPosList);
        for (XmlPosition xmlPos : xmlPosList) {
            xml.append(xmlPos.a());
        }
        if (!StringHelper.isBlankOrNull((Object)this.b)) {
            xml.append("</" + this.b + ">");
        }
        return xml.toString();
    }

    private String a(Tag tag, Map<String, Campo> campos, ArrayList<Registro> registros) {
        StringBuffer xml = new StringBuffer();
        ArrayList<XmlPosition> xmlPosList = new ArrayList<XmlPosition>();
        if (tag.getCampos() != null && !tag.getCampos().isEmpty()) {
            for (String nomeCampo : tag.getCampos()) {
                Campo campo = campos.get(nomeCampo);
                if (campo == null) {
                    System.out.println("Campo " + nomeCampo + " da tag " + tag.getNome() + " nao encontrado");
                }
                if (StringHelper.isBlankOrNull((Object)campo.getValue())) continue;
                if ("tag".equalsIgnoreCase(campo.getXmlType())) {
                    campos.remove(nomeCampo);
                    if (StringHelper.isBlankOrNull((Object)campo.getValue()) && !campo.isPrintIfEmpty()) continue;
                    xmlPosList.add(new XmlPosition(this, campo.getXmlPos(), "<" + campo.getNome() + ">" + StringHelper.encodeSpecialXMLChars((String)campo.getValue()) + "</" + campo.getNome() + ">"));
                    continue;
                }
                if (!"text".equalsIgnoreCase(campo.getXmlType())) continue;
                campos.remove(nomeCampo);
                xmlPosList.add(new XmlPosition(this, campo.getXmlPos(), StringHelper.encodeSpecialXMLChars((String)campo.getValue())));
            }
        }
        if (tag.getRegistros() != null && !tag.getRegistros().isEmpty()) {
            ArrayList<Registro> toRemove = new ArrayList<Registro>();
            for (String nomeRegistro : tag.getRegistros()) {
                for (Registro registro : registros) {
                    if (!registro.getTipoRegistro().equals(nomeRegistro)) continue;
                    String regXml = registro.toXML();
                    if (!StringHelper.isBlankOrNull((Object)regXml) || registro.isPrintIfEmpty()) {
                        xmlPosList.add(new XmlPosition(this, registro.getXmlPos(), regXml));
                    }
                    toRemove.add(registro);
                }
            }
            registros.removeAll(toRemove);
        }
        if (xmlPosList.isEmpty() && !tag.isPrintIfEmpty()) {
            return null;
        }
        xml.append("<" + tag.getNome() + ">");
        Collections.sort(xmlPosList);
        for (XmlPosition xmlPos : xmlPosList) {
            xml.append(xmlPos.a());
        }
        xml.append("</" + tag.getNome() + ">");
        return xml.toString();
    }

    public String toString() {
        StringBuffer out = new StringBuffer();
        Iterator it = this.campos.keySet().iterator();
        out.append(this.getTipoRegistro());
        while (it.hasNext()) {
            String nome = (String)it.next();
            Campo campo = (Campo)this.campos.get(nome);
            if (campo.isXmlOnly()) continue;
            out.append("|" + campo.getValue());
        }
        out.append("\r\n");
        for (Registro child : this.children) {
            out.append((Object)child);
        }
        return out.toString();
    }

    public String getTipoRegistro() {
        return this.a;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.a = tipoRegistro;
    }

    public String getTagXml() {
        return this.b;
    }

    public void setTagXml(String tagXml) {
        this.b = tagXml;
    }

    public int getXmlPos() {
        return this.a;
    }

    public void setXmlPos(int xmlPos) {
        this.a = xmlPos;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag t) {
        this.tags.add(t);
    }

    public String getVersao() {
        return this.c;
    }

    public void setVersao(String versao) {
        this.c = versao;
    }

    public boolean isPrintIfEmpty() {
        return this.a;
    }

    public void setPrintIfEmpty(boolean printIfEmpty) {
        this.a = printIfEmpty;
    }

    public int getLineNumber() {
        return this.b;
    }

    public void setLineNumber(int lineNumber) {
        this.b = lineNumber;
    }

    public void getAllErrors(List<String> list) {
        List errors = this.getErrors();
        if (errors != null) {
            list.addAll(errors);
        }
        for (Registro child : this.children) {
            child.getAllErrors(list);
        }
    }

    public void getAllMessages(List<String> list) {
        List messages = this.getMessages();
        if (messages != null) {
            list.addAll(messages);
        }
        for (Registro child : this.children) {
            child.getAllMessages(list);
        }
    }
}

