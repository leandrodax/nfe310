/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier
 *  br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier$1
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier;
import java.text.ParseException;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;

public class FormattedTextFieldInputVerifier
extends InputVerifier {
    JFormattedTextField.AbstractFormatter a = null;

    public FormattedTextFieldInputVerifier(JFormattedTextField.AbstractFormatter formatter) {
        this.a = formatter;
    }

    @Override
    public boolean verify(JComponent input) {
        if (input instanceof JFormattedTextField) {
            JFormattedTextField ftf = (JFormattedTextField)input;
            ftf.getFormatter();
            if (this.a != null) {
                String text = ftf.getText();
                try {
                    this.a.stringToValue(text);
                    return true;
                }
                catch (ParseException pe) {
                    String msg = pe.getMessage();
                    SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean shouldYieldFocus(JComponent input) {
        return this.verify(input);
    }
}

