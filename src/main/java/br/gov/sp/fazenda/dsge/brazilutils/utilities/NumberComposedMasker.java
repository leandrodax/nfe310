/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposedMasker
 */
package br.gov.sp.fazenda.dsge.brazilutils.utilities;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NumberComposedMasker {
    private static JFormattedTextField a = null;
    private static MaskFormatter a = null;

    private NumberComposedMasker() {
    }

    public static String applyMask(String number, String mask) {
        try {
            a = new MaskFormatter(mask);
            a = new JFormattedTextField(a);
        }
        catch (ParseException e) {
            e.printStackTrace();
            return number;
        }
        a.setText(number);
        return a.getText();
    }

    public static String convertMaskToRegex(String mask) {
        String result = "";
        block21 : for (int i = 0; i < mask.length(); ++i) {
            if (mask.charAt(i) == '\'') {
                result = result + mask.charAt(++i);
                continue;
            }
            switch (mask.charAt(i)) {
                case '#': {
                    result = result + "[0-9]";
                    continue block21;
                }
                case '*': {
                    result = result + ".";
                    continue block21;
                }
                case 'U': {
                    result = result + "[:upper:]";
                    continue block21;
                }
                case 'L': {
                    result = result + "[:lower:]";
                    continue block21;
                }
                case 'A': {
                    result = result + "[:alnum:]";
                    continue block21;
                }
                case '?': {
                    result = result + "[:alpha:]";
                    continue block21;
                }
                case 'H': {
                    result = result + "[:xdigit:]";
                    continue block21;
                }
                case '.': {
                    result = result + "\\.";
                    continue block21;
                }
                case '\'': {
                    result = result + "\\";
                    continue block21;
                }
                case '+': {
                    result = result + "\\+";
                    continue block21;
                }
                case '^': {
                    result = result + "\\^";
                    continue block21;
                }
                case '$': {
                    result = result + "\\$";
                    continue block21;
                }
                case '|': {
                    result = result + "\\|";
                    continue block21;
                }
                case '[': {
                    result = result + "\\[";
                    continue block21;
                }
                case ']': {
                    result = result + "\\]";
                    continue block21;
                }
                case '{': {
                    result = result + "\\{";
                    continue block21;
                }
                case '}': {
                    result = result + "\\}";
                    continue block21;
                }
                case '(': {
                    result = result + "\\(";
                    continue block21;
                }
                case ')': {
                    result = result + "\\)";
                    continue block21;
                }
                default: {
                    result = result + mask.charAt(i);
                }
            }
        }
        return result;
    }
}

