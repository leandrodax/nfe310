/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.DSGETabbedPane
 */
package br.gov.sp.fazenda.dsge.view;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import javax.swing.JTabbedPane;

public class DSGETabbedPane
extends JTabbedPane {
    private static final long a = -5215563224363078354L;

    @Override
    public void setSelectedIndex(int index) {
        Component comp = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (this.getSelectedIndex() == -1 || comp == this || this.requestFocus(false)) {
            super.setSelectedIndex(index);
        }
    }
}

