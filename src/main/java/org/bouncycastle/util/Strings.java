/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.util.Strings
 */
package org.bouncycastle.util;

import java.io.ByteArrayOutputStream;
import java.util.Vector;

public final class Strings {
    public static String fromUTF8ByteArray(byte[] bytes) {
        int i = 0;
        int length = 0;
        while (i < bytes.length) {
            ++length;
            if ((bytes[i] & 240) == 240) {
                ++length;
                i += 4;
                continue;
            }
            if ((bytes[i] & 224) == 224) {
                i += 3;
                continue;
            }
            if ((bytes[i] & 192) == 192) {
                i += 2;
                continue;
            }
            ++i;
        }
        char[] cs = new char[length];
        i = 0;
        length = 0;
        while (i < bytes.length) {
            char ch;
            if ((bytes[i] & 240) == 240) {
                int codePoint = (bytes[i] & 3) << 18 | (bytes[i + 1] & 63) << 12 | (bytes[i + 2] & 63) << 6 | bytes[i + 3] & 63;
                int U = codePoint - 65536;
                char W1 = (char)(55296 | U >> 10);
                char W2 = (char)(56320 | U & 1023);
                cs[length++] = W1;
                ch = W2;
                i += 4;
            } else if ((bytes[i] & 224) == 224) {
                ch = (char)((bytes[i] & 15) << 12 | (bytes[i + 1] & 63) << 6 | bytes[i + 2] & 63);
                i += 3;
            } else if ((bytes[i] & 208) == 208) {
                ch = (char)((bytes[i] & 31) << 6 | bytes[i + 1] & 63);
                i += 2;
            } else if ((bytes[i] & 192) == 192) {
                ch = (char)((bytes[i] & 31) << 6 | bytes[i + 1] & 63);
                i += 2;
            } else {
                ch = (char)(bytes[i] & 255);
                ++i;
            }
            cs[length++] = ch;
        }
        return new String(cs);
    }

    public static byte[] toUTF8ByteArray(String string) {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length; ++i) {
            char ch = c[i];
            if (ch < '') {
                bOut.write(ch);
                continue;
            }
            if (ch < '\u0800') {
                bOut.write(192 | ch >> 6);
                bOut.write(128 | ch & 63);
                continue;
            }
            if (ch >= '\ud800' && ch <= '\udfff') {
                if (i + 1 >= c.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                char W1 = ch;
                char W2 = ch = c[++i];
                if (W1 > '\udbff') {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int codePoint = ((W1 & 1023) << 10 | W2 & 1023) + 65536;
                bOut.write(240 | codePoint >> 18);
                bOut.write(128 | codePoint >> 12 & 63);
                bOut.write(128 | codePoint >> 6 & 63);
                bOut.write(128 | codePoint & 63);
                continue;
            }
            bOut.write(224 | ch >> 12);
            bOut.write(128 | ch >> 6 & 63);
            bOut.write(128 | ch & 63);
        }
        return bOut.toByteArray();
    }

    public static String toUpperCase(String string) {
        boolean changed = false;
        char[] chars = string.toCharArray();
        for (int i = 0; i != chars.length; ++i) {
            char ch = chars[i];
            if ('a' > ch || 'z' < ch) continue;
            changed = true;
            chars[i] = (char)(ch - 97 + 65);
        }
        if (changed) {
            return new String(chars);
        }
        return string;
    }

    public static String toLowerCase(String string) {
        boolean changed = false;
        char[] chars = string.toCharArray();
        for (int i = 0; i != chars.length; ++i) {
            char ch = chars[i];
            if ('A' > ch || 'Z' < ch) continue;
            changed = true;
            chars[i] = (char)(ch - 65 + 97);
        }
        if (changed) {
            return new String(chars);
        }
        return string;
    }

    public static byte[] toByteArray(String string) {
        byte[] bytes = new byte[string.length()];
        for (int i = 0; i != bytes.length; ++i) {
            char ch = string.charAt(i);
            bytes[i] = (byte)ch;
        }
        return bytes;
    }

    public static String[] split(String input, char delimiter) {
        Vector<String> v = new Vector<String>();
        boolean moreTokens = true;
        while (moreTokens) {
            int tokenLocation = input.indexOf(delimiter);
            if (tokenLocation > 0) {
                String subString = input.substring(0, tokenLocation);
                v.addElement(subString);
                input = input.substring(tokenLocation + 1);
                continue;
            }
            moreTokens = false;
            v.addElement(input);
        }
        String[] res = new String[v.size()];
        for (int i = 0; i != res.length; ++i) {
            res[i] = (String)v.elementAt(i);
        }
        return res;
    }
}

