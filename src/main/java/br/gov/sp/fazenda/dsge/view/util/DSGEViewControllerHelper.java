/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.util.DSGEViewControllerHelper
 */
package br.gov.sp.fazenda.dsge.view.util;

import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DSGEViewControllerHelper {
    private HashMap<String, String> a = null;
    protected static String FILE = "view-controller.xml";

    protected DSGEViewControllerHelper() throws DSGEViewException {
        this.populateViewController();
    }

    protected InputStream getViewControllerXMLMapStream() {
        return DSGEViewControllerHelper.class.getResourceAsStream(FILE);
    }

    protected void populateViewController() throws DSGEViewException {
        if (this.a == null) {
            this.a = new HashMap();
            this.a();
        }
    }

    public ControllerItf getControllerFromView(ViewItf viewItf) throws DSGEViewException {
        ControllerItf controllerItf = null;
        try {
            this.populateViewController();
            Class classe = Class.forName((String)this.a.get(viewItf.getClass().getCanonicalName()));
            Constructor constructor = classe.getConstructor(ViewItf.class);
            controllerItf = (ControllerItf)constructor.newInstance(new Object[]{viewItf});
            viewItf.setController(controllerItf);
        }
        catch (ClassNotFoundException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (IllegalArgumentException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (InstantiationException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (SecurityException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (NullPointerException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        return controllerItf;
    }

    private void a() throws DSGEViewException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(this.getViewControllerXMLMapStream());
            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("view");
            for (int i = 0; i < nl.getLength(); ++i) {
                Element tagView = (Element)nl.item(i);
                String view = this.a(tagView, "name", null);
                NodeList nodeController = tagView.getElementsByTagName("controller");
                for (int j = 0; j < nodeController.getLength(); ++j) {
                    Element tagController = (Element)nodeController.item(j);
                    String controller = this.a(tagController, "name", null);
                    this.a.put(view, controller);
                }
            }
        }
        catch (ParserConfigurationException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (SAXException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGEViewException((Throwable)e, e.getMessage());
        }
    }

    private String a(Element elem, String tagName, String tagAttribute) {
        NodeList children = elem.getElementsByTagName(tagName);
        if (children == null) {
            return null;
        }
        Element child = (Element)children.item(0);
        if (child == null) {
            return null;
        }
        if (child.getFirstChild() != null) {
            return child.getFirstChild().getNodeValue();
        }
        return child.getAttribute(tagAttribute);
    }
}

