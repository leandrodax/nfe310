/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDesktop
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.WindowManager
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 *  de.muntjak.tinylookandfeel.Theme
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDesktop;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import de.muntjak.tinylookandfeel.Theme;
import java.awt.Component;
import java.io.PrintStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Stack;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JViewport;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public abstract class WindowManager {
    protected DSGEDesktop frame;
    protected Stack<DSGEPanel> panelStack = new Stack();

    protected void pushPanel(DSGEPanel panel) {
        this.panelStack.push(panel);
    }

    protected DSGEPanel popPanel() {
        return (DSGEPanel)this.panelStack.pop();
    }

    protected WindowManager() {
    }

    public void setFrame(DSGEDesktop frame) {
        this.frame = frame;
    }

    public abstract JSplitPane getDesktop();

    public abstract DSGEPanel getStartPanel();

    public boolean resetPanels() {
        DSGEPanel panel = this.getActivePanel();
        if (!panel.canClose()) {
            return false;
        }
        int size = this.panelStack.size();
        boolean canClose = true;
        for (int k = size - 1; k >= 0; --k) {
            panel = (DSGEPanel)this.panelStack.elementAt(k);
            if (panel.canClose()) continue;
            canClose = false;
            break;
        }
        if (!canClose) {
            return false;
        }
        while (!this.panelStack.empty()) {
            panel = (DSGEPanel)this.panelStack.pop();
            this.removeObserver(panel);
        }
        DSGEPanel startPanel = this.getStartPanel();
        this.pushPanel(startPanel);
        this.getDesktop().setBottomComponent(startPanel.getComponent());
        return true;
    }

    public void showPanel(DSGEPanel panel, boolean clear) {
        if (clear && !this.resetPanels()) {
            this.removeObserver(panel);
            return;
        }
        DSGEPanel c = this.getActivePanel();
        if (c != null) {
            this.pushPanel(c);
        }
        this.a(panel);
    }

    public DSGEPanel getActivePanel() {
        Component c = this.getDesktop().getBottomComponent();
        if (c instanceof JScrollPane) {
            return (DSGEPanel)((JViewport)((JScrollPane)c).getComponent(0)).getView();
        }
        return (DSGEPanel)c;
    }

    public boolean closePanel() {
        DSGEPanel panel = this.getActivePanel();
        if (!panel.canClose()) {
            return false;
        }
        this.getDesktop().remove(this.getDesktop().getBottomComponent());
        this.removeObserver(panel);
        if (!this.panelStack.empty()) {
            this.a((DSGEPanel)this.panelStack.pop());
        }
        return true;
    }

    private void a(DSGEPanel panel) {
        panel.getComponent().setVisible(true);
        Component newComponent = panel.getComponent();
        if (panel.useScroll()) {
            JScrollPane scroller = new JScrollPane(newComponent);
            scroller.getVerticalScrollBar().setUnitIncrement(20);
            newComponent = scroller;
        }
        this.getDesktop().setBottomComponent(newComponent);
        this.getDesktop().revalidate();
        this.getDesktop().repaint();
        this.getDesktop().getBottomComponent().requestFocus();
    }

    public void centralizarDialogo(JDialog dialogo) {
        DSGEWindowUtilHelper.centralizarDialogo((Component)this.frame, (JDialog)dialogo);
    }

    public void updateComponentTreeUI() {
        SwingUtilities.updateComponentTreeUI((Component)this.frame);
        Iterator<E> it = this.panelStack.iterator();
        while (it.hasNext()) {
            Component c = ((DSGEPanel)it.next()).getComponent();
            SwingUtilities.updateComponentTreeUI(c);
        }
    }

    public void loadCustomTheme(URL themeURL) {
        Theme.loadTheme((URL)themeURL);
        LookAndFeel currentLookAndFeel = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(currentLookAndFeel);
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        }
        catch (Exception ee) {
            System.err.println(ee.toString());
        }
        this.updateComponentTreeUI();
    }

    public void loadDefaultTheme() {
        try {
            UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        }
        catch (Exception ee) {
            System.err.println(ee.toString());
        }
        this.updateComponentTreeUI();
    }

    protected void removeObserver(DSGEPanel panel) {
        ControllerItf controller = panel.getController();
        if (controller instanceof Observer) {
            Notificador.getInstance().remove((Observer)controller);
        }
    }
}

