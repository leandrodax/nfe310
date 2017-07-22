/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.format.IdentificacaoSafraFormatter
 *  br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier
 */
package br.gov.sp.fazenda.dsen.view.format;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier;
import java.text.ParseException;
import javax.swing.InputVerifier;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatter;

public class IdentificacaoSafraFormatter
extends DefaultFormatter {
    private static final long a = 1;

    @Override
    public void install(JFormattedTextField ftf) {
        super.install(ftf);
        ftf.setInputVerifier((InputVerifier)new FormattedTextFieldInputVerifier((JFormattedTextField.AbstractFormatter)this));
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        block11 : {
            if (value != null && !value.trim().equals("")) {
                if (value.trim().length() == 9) {
                    if (!value.substring(4, 5).equals("/")) {
                        throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
                    }
                    try {
                        if (Integer.parseInt(value.substring(0, 4)) < 1900) {
                            throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
                        }
                        if (Integer.parseInt(value.substring(5, 9)) < 1900) {
                            throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
                        }
                        break block11;
                    }
                    catch (Exception e) {
                        throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
                    }
                }
                if (value.trim().length() == 4) {
                    try {
                        if (Integer.parseInt(value) < 1900) {
                            throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
                        }
                        break block11;
                    }
                    catch (Exception e) {
                        throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
                    }
                }
                throw new ParseException(DSENMessageConstants.CANA_IDENTIFICACACO_INVALID_MSG, 0);
            }
        }
        return value;
    }
}

