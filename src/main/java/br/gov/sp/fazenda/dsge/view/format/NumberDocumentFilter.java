/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class NumberDocumentFilter
extends LengthDocumentFilter {
    public NumberDocumentFilter(int maxLength) {
        super(maxLength);
    }

    public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        try {
            if (string != null) {
                NumberFormat.getInstance().parse(string);
            }
            super.insertString(fb, offset, string, attr);
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        try {
            if (text != null) {
                NumberFormat.getInstance().parse(text);
            }
            super.replace(fb, offset, length, text, attrs);
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }
}

