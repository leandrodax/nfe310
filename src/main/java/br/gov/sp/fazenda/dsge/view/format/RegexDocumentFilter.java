/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsge.view.format;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class RegexDocumentFilter
extends DocumentFilter {
    private String a;
    private int a = -1;

    public RegexDocumentFilter(String regex) {
        this.a = regex;
    }

    public RegexDocumentFilter(String regex, int maxLength) {
        this(regex);
        this.a = maxLength;
    }

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        String wholeString = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
        if (this.a(wholeString)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String textDocument = fb.getDocument().getText(0, fb.getDocument().getLength());
        String wholeString = textDocument.substring(0, offset) + text + textDocument.substring(offset + length, textDocument.length());
        if (this.a(wholeString)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
        String textDocument = fb.getDocument().getText(0, fb.getDocument().getLength());
        String wholeText = textDocument.substring(0, offset) + textDocument.substring(offset + length, textDocument.length());
        if (this.a(wholeText)) {
            super.remove(fb, offset, length);
        }
    }

    private boolean a(String text) {
        boolean isAllowed = false;
        boolean allowedLength = true;
        int length = text.length();
        if (this.a > -1 && length > this.a) {
            allowedLength = false;
        }
        if (this.a(this.a, text) && allowedLength) {
            isAllowed = true;
        }
        return isAllowed;
    }

    private boolean a(String regEx, String string) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(string);
        if (m.matches()) {
            return true;
        }
        return m.hitEnd();
    }
}

