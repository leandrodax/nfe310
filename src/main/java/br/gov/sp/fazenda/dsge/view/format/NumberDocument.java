/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocument
 */
package br.gov.sp.fazenda.dsge.view.format;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class NumberDocument
extends PlainDocument {
    @Override
    public void insertString(int offs, String str, AttributeSet attr) throws BadLocationException {
        try {
            NumberFormat.getInstance().parse(str);
            super.insertString(offs, str, attr);
        }
        catch (ParseException ex) {
            System.out.println("numberdocument.parseException");
        }
    }
}

