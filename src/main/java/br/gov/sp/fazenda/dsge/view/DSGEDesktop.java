/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.DSGEDesktop
 *  br.gov.sp.fazenda.dsge.view.DSGEFrame
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  com.jtechlabs.ui.widget.directorychooser.DirectoryChooserDefaults
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.DSGEFrame;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import com.jtechlabs.ui.widget.directorychooser.DirectoryChooserDefaults;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.EventListener;
import java.util.Locale;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public abstract class DSGEDesktop
extends DSGEFrame
implements WindowListener {
    protected JMenuBar mnuPrincipal;

    protected DSGEDesktop() {
        Locale.setDefault(new Locale("pt", "BR"));
        try {
            UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        catch (InstantiationException ex) {
            ex.printStackTrace();
        }
        this.setCustomUIDefaults();
        this.loadBasicBRProperties();
        this.translatePrintDialogs();
        this.translateDirectoryChooserDialogs();
        this.setResizable(true);
        this.setSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);
    }

    public abstract Image getIcon();

    protected abstract void createMnuPrincipal();

    public abstract void exitApp();

    public JMenuBar getMnuPrincipal() {
        return this.mnuPrincipal;
    }

    protected void loadBasicBRProperties() {
        try {
            PropertyResourceBundle propBR = new PropertyResourceBundle(DSGEDesktop.class.getResourceAsStream("resources/basic_br.properties"));
            for (String key : propBR.keySet()) {
                UIManager.put(key, propBR.getObject(key));
            }
            PropertyResourceBundle propWindows = new PropertyResourceBundle(DSGEDesktop.class.getResourceAsStream("resources/windows_br.properties"));
            for (String key : propWindows.keySet()) {
                UIManager.put(key, propWindows.getObject(key));
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    protected void translatePrintDialogs() {
        try {
            Field fld;
            Class<?> cl = Class.forName("sun.print.ServiceDialog");
            if (cl != null && (fld = cl.getDeclaredField("messageRB")) != null) {
                fld.setAccessible(true);
                fld.set(cl, ResourceBundle.getBundle("br.gov.sp.fazenda.dsge.view.resources.serviceui"));
            }
        }
        catch (Exception ex11) {
            ex11.printStackTrace();
        }
    }

    protected void translateDirectoryChooserDialogs() {
        DirectoryChooserDefaults.putOption((String)"dialogCaptionText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_DIALOG_CAPTION_TEXT);
        DirectoryChooserDefaults.putOption((String)"dialogText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_DIALOG_TEXT);
        DirectoryChooserDefaults.putOption((String)"copyText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_COPY_TEXT);
        DirectoryChooserDefaults.putOption((String)"cutText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_CUT_TEXT);
        DirectoryChooserDefaults.putOption((String)"deleteText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_DELETE_TEXT);
        DirectoryChooserDefaults.putOption((String)"cancelText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_CANCEL_TEXT);
        DirectoryChooserDefaults.putOption((String)"homeText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_HOME_TEXT);
        DirectoryChooserDefaults.putOption((String)"newText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_NEW_TEXT);
        DirectoryChooserDefaults.putOption((String)"pasteText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_PASTE_TEXT);
        DirectoryChooserDefaults.putOption((String)"renameText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_RENAME_TEXT);
        DirectoryChooserDefaults.putOption((String)"synchronizeText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_SYNCHRONIZE_TEXT);
        DirectoryChooserDefaults.putOption((String)"waitText", (Object)DSGEMessageConstants.JDIRECTORYCHOOSER_PROP_WAIT_TEXT);
    }

    protected static void printUIConstants() {
        for (K key : UIManager.getDefaults().keySet()) {
            System.out.println(key + " = " + UIManager.getDefaults().get(key));
        }
    }

    protected void setCustomUIDefaults() {
        Color c = new Color(121, 137, 185);
        Object[] newSettings = new Object[]{"TextField.inactiveForeground", c, "FormattedTextField.inactiveForeground", c, "PasswordField.inactiveForeground", c, "TextArea.inactiveForeground", c, "TextPane.inactiveForeground", c, "EditorPane.inactiveForeground", c, "ComboBox.disabledForeground", c};
        UIDefaults defaults = UIManager.getDefaults();
        defaults.putDefaults(newSettings);
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.exitApp();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}

