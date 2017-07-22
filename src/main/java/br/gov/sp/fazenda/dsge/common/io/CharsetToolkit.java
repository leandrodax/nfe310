/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.io.CharsetToolkit
 */
package br.gov.sp.fazenda.dsge.common.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class CharsetToolkit {
    public static byte[] UTF8_BOM = new byte[]{-17, -69, -65};
    private byte[] a;
    private Charset a;
    private boolean a = true;

    public CharsetToolkit(byte[] buffer) {
        this.a = buffer;
        this.a = CharsetToolkit.getDefaultSystemCharset();
    }

    public CharsetToolkit(byte[] buffer, Charset defaultCharset) {
        this.a = buffer;
        this.setDefaultCharset(defaultCharset);
    }

    public void setDefaultCharset(Charset defaultCharset) {
        this.a = defaultCharset != null ? defaultCharset : CharsetToolkit.getDefaultSystemCharset();
    }

    public void setEnforce8Bit(boolean enforce) {
        this.a = enforce;
    }

    public boolean getEnforce8Bit() {
        return this.a;
    }

    public Charset getDefaultCharset() {
        return this.a;
    }

    public Charset guessEncoding() {
        if (CharsetToolkit.hasUTF8Bom((byte[])this.a)) {
            return Charset.forName("UTF-8");
        }
        if (CharsetToolkit.a((byte[])this.a)) {
            return Charset.forName("UTF-16LE");
        }
        if (CharsetToolkit.b((byte[])this.a)) {
            return Charset.forName("UTF-16BE");
        }
        boolean highOrderBit = false;
        boolean validU8Char = true;
        int length = this.a.length;
        for (int i = 0; i < length - 6; ++i) {
            byte b0 = this.a[i];
            byte b1 = this.a[i + 1];
            byte b2 = this.a[i + 2];
            byte b3 = this.a[i + 3];
            byte b4 = this.a[i + 4];
            byte b5 = this.a[i + 5];
            if (b0 < 0) {
                highOrderBit = true;
                if (CharsetToolkit.b((byte)b0)) {
                    if (!CharsetToolkit.a((byte)b1)) {
                        validU8Char = false;
                    } else {
                        ++i;
                    }
                } else if (CharsetToolkit.c((byte)b0)) {
                    if (!CharsetToolkit.a((byte)b1) || !CharsetToolkit.a((byte)b2)) {
                        validU8Char = false;
                    } else {
                        i += 2;
                    }
                } else if (CharsetToolkit.d((byte)b0)) {
                    if (!(CharsetToolkit.a((byte)b1) && CharsetToolkit.a((byte)b2) && CharsetToolkit.a((byte)b3))) {
                        validU8Char = false;
                    } else {
                        i += 3;
                    }
                } else if (CharsetToolkit.e((byte)b0)) {
                    if (!(CharsetToolkit.a((byte)b1) && CharsetToolkit.a((byte)b2) && CharsetToolkit.a((byte)b3) && CharsetToolkit.a((byte)b4))) {
                        validU8Char = false;
                    } else {
                        i += 4;
                    }
                } else if (CharsetToolkit.f((byte)b0)) {
                    if (!(CharsetToolkit.a((byte)b1) && CharsetToolkit.a((byte)b2) && CharsetToolkit.a((byte)b3) && CharsetToolkit.a((byte)b4) && CharsetToolkit.a((byte)b5))) {
                        validU8Char = false;
                    } else {
                        i += 5;
                    }
                } else {
                    validU8Char = false;
                }
            }
            if (!validU8Char) break;
        }
        if (!highOrderBit) {
            if (this.a) {
                return this.a;
            }
            return Charset.forName("US-ASCII");
        }
        if (validU8Char) {
            return Charset.forName("UTF-8");
        }
        return this.a;
    }

    public static Charset guessEncoding(File f, int bufferLength) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(f);
        byte[] buffer = new byte[bufferLength];
        fis.read(buffer);
        fis.close();
        CharsetToolkit toolkit = new CharsetToolkit(buffer);
        toolkit.setDefaultCharset(Charset.forName("UTF-8"));
        return toolkit.guessEncoding();
    }

    public static Charset guessEncoding(File f, int bufferLength, Charset defaultCharset) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(f);
        byte[] buffer = new byte[bufferLength];
        fis.read(buffer);
        fis.close();
        CharsetToolkit toolkit = new CharsetToolkit(buffer);
        toolkit.setDefaultCharset(defaultCharset);
        return toolkit.guessEncoding();
    }

    private static boolean a(byte b) {
        return -128 <= b && b <= -65;
    }

    private static boolean b(byte b) {
        return -64 <= b && b <= -33;
    }

    private static boolean c(byte b) {
        return -32 <= b && b <= -17;
    }

    private static boolean d(byte b) {
        return -16 <= b && b <= -9;
    }

    private static boolean e(byte b) {
        return -8 <= b && b <= -5;
    }

    private static boolean f(byte b) {
        return -4 <= b && b <= -3;
    }

    public static Charset getDefaultSystemCharset() {
        return Charset.forName(System.getProperty("file.encoding"));
    }

    public static boolean hasUTF8Bom(byte[] bom) {
        return bom[0] == UTF8_BOM[0] && bom[1] == UTF8_BOM[1] && bom[2] == UTF8_BOM[2];
    }

    private static boolean a(byte[] bom) {
        return bom[0] == -1 && bom[1] == -2;
    }

    private static boolean b(byte[] bom) {
        return bom[0] == -2 && bom[1] == -1;
    }

    public static Charset[] getAvailableCharsets() {
        Collection<Charset> collection = Charset.availableCharsets().values();
        return collection.toArray(new Charset[collection.size()]);
    }

    static {
    }
}

