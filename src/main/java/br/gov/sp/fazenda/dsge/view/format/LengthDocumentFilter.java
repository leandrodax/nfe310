/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 */
package br.gov.sp.fazenda.dsge.view.format;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class LengthDocumentFilter
extends DocumentFilter {
    private int a;

    public LengthDocumentFilter(int maxLength) {
        this.a = maxLength;
    }

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        int length = fb.getDocument().getLength();
        if (string != null) {
            length += string.length();
        }
        if (length <= this.a) {
            fb.insertString(offset, string, attr);
        }
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        int lengthStr = fb.getDocument().getLength();
        if (text != null) {
            lengthStr += text.length() - length;
        }
        if (lengthStr <= this.a) {
            fb.replace(offset, length, text, attrs);
        }
    }

    public int getMaxLength() {
        return this.a;
    }
}

