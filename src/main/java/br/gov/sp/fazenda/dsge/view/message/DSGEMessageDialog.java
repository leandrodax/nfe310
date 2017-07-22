/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI
 *  br.gov.sp.fazenda.dsge.view.message.DSGEJMessageGUI
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsge.view.message;

import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI;
import br.gov.sp.fazenda.dsge.view.message.DSGEJMessageGUI;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Exception performing whole class analysis ignored.
 */
public class DSGEMessageDialog
implements ActionListener {
    public DSGEMessageDialog() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(BaseTO to) {
        StringBuffer buffer = new StringBuffer();
        if (to.getMessages() != null && !to.getMessages().isEmpty()) {
            int i = 0;
            while (i < to.getMessages().size()) {
                buffer.append((String)to.getMessages().get(i));
                buffer.append("\n");
                ++i;
            }
            return buffer.toString();
        }
        if (to.getErrors() == null || to.getErrors().isEmpty()) return buffer.toString();
        int i = 0;
        while (i < to.getErrors().size()) {
            buffer.append((String)to.getErrors().get(i));
            buffer.append("\n");
            ++i;
        }
        return buffer.toString();
    }

    public static void showMessage(String message) {
        DSGEMessageDialog.showMessage((Window)null, (String)message);
    }

    public static void showMessage(Window parent, String message) {
        boolean isParentNull = false;
        if (parent == null) {
            isParentNull = true;
            parent = DSGEWindowUtilHelper.getAppFrame();
        }
        DSGEJMessageGUI messageGUI = new DSGEJMessageGUI(parent, true);
        messageGUI.setMessage(message);
        messageGUI.setLocationRelativeTo(null);
        if (isParentNull) {
            messageGUI.setAlwaysOnTop(true);
            messageGUI.toFront();
        }
        messageGUI.setVisible(true);
    }

    public static void showMessage(Window parent, BaseTO to) {
        DSGEMessageDialog.showMessage((Window)parent, (String)DSGEMessageDialog.a((BaseTO)to));
    }

    public static void showMessage(Window parent, List<? extends BaseTO> lista) {
        StringBuffer buffer = new StringBuffer();
        if (lista != null) {
            HashSet<String> messages = new HashSet<String>();
            for (int i = 0; i < lista.size(); ++i) {
                String msg = DSGEMessageDialog.a((BaseTO)lista.get(i));
                if (StringHelper.isBlankOrNull((Object)msg)) continue;
                messages.add(msg);
            }
            Iterator it = messages.iterator();
            while (it.hasNext()) {
                buffer.append(it.next());
            }
        }
        DSGEMessageDialog.showMessage((Window)parent, (String)buffer.toString());
    }

    public static int showQuestion(Component parent, String question) {
        return JOptionPane.showConfirmDialog(parent, question, "Mensagem do Sistema", 0);
    }

    public static int showYesNoCancelQuestion(Component parent, String question) {
        return JOptionPane.showConfirmDialog(parent, question, "Mensagem do Sistema", 1);
    }

    public static Object showInputQuestion(Component parent, Object message, String titulo, Object[] seleciotnValues, Object inicialSelection) {
        return JOptionPane.showOptionDialog(parent, message, titulo, -1, 2, null, seleciotnValues, inicialSelection);
    }

    public static int showQuestion(Component parent, BaseTO baseTO) {
        String question = DSGEMessageDialog.a((BaseTO)baseTO);
        return JOptionPane.showConfirmDialog(parent, question, "Mensagem do Sistema", baseTO.getQuestionEnum().getValue());
    }

    public static void showErrors(DSGEBaseException ex) {
        DSGEExceptionGUI exGUI = new DSGEExceptionGUI((Throwable)ex);
        exGUI.setLocationRelativeTo(null);
        exGUI.setVisible(true);
    }

    public static void showErrors(Window window, DSGEBaseException ex) {
        DSGEExceptionGUI exGUI = new DSGEExceptionGUI(window, (Throwable)ex);
        exGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

