/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseRegistroTO
 *  br.gov.sp.fazenda.dsge.common.util.BaseComponent
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.to.BaseRegistroTO;
import java.util.Enumeration;
import java.util.Vector;

public abstract class BaseComponent
extends BaseRegistroTO {
    protected Vector<BaseComponent> children = new Vector();

    public void add(BaseComponent component) {
        this.children.addElement(component);
    }

    public boolean remove(BaseComponent component) {
        return this.children.removeElement((Object)component);
    }

    public BaseComponent getChild(int index) {
        return (BaseComponent)this.children.elementAt(index);
    }

    public Enumeration<BaseComponent> elements() {
        return this.children.elements();
    }

    public int getNumberOfChildren() {
        return this.children.size();
    }

    public String showChildren() {
        return this.showChildren(this.elements());
    }

    protected String showChildren(Enumeration children) {
        StringBuffer buffer = new StringBuffer();
        while (children.hasMoreElements()) {
            BaseComponent component = (BaseComponent)children.nextElement();
            buffer.append(component.toString());
            if (component.elements() != null) {
                buffer.append(component.showChildren(component.elements()));
            }
            buffer.append(component.showChildren(new Vector().elements()));
        }
        return buffer.toString();
    }

    protected BaseComponent getChild(String s) {
        BaseComponent component = null;
        if (this.getName().equals(s)) {
            return this;
        }
        boolean found = false;
        Enumeration e = this.elements();
        if (e != null) {
            while (e.hasMoreElements() && !found) {
                component = (BaseComponent)e.nextElement();
                found = component.getName().equals(s);
                if (found) continue;
                found = (component = component.getChild(s)) != null;
            }
        }
        if (found) {
            return component;
        }
        return null;
    }

    protected String getName() {
        return this.getClass().getSimpleName();
    }
}

