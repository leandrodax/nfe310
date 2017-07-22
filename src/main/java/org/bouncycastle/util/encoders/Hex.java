/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.util.encoders.Encoder
 *  org.bouncycastle.util.encoders.Hex
 *  org.bouncycastle.util.encoders.HexEncoder
 */
package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Encoder;
import org.bouncycastle.util.encoders.HexEncoder;

/*
 * Exception performing whole class analysis ignored.
 */
public class Hex {
    private static final Encoder a = new HexEncoder();

    public Hex() {
    }

    public static byte[] encode(byte[] data) {
        return Hex.encode((byte[])data, (int)0, (int)data.length);
    }

    public static byte[] encode(byte[] data, int off, int length) {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        try {
            a.encode(data, off, length, (OutputStream)bOut);
        }
        catch (IOException e) {
            throw new RuntimeException("exception encoding Hex string: " + e);
        }
        return bOut.toByteArray();
    }

    public static int encode(byte[] data, OutputStream out) throws IOException {
        return a.encode(data, 0, data.length, out);
    }

    public static int encode(byte[] data, int off, int length, OutputStream out) throws IOException {
        return a.encode(data, off, length, out);
    }

    public static byte[] decode(byte[] data) {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        try {
            a.decode(data, 0, data.length, (OutputStream)bOut);
        }
        catch (IOException e) {
            throw new RuntimeException("exception decoding Hex string: " + e);
        }
        return bOut.toByteArray();
    }

    public static byte[] decode(String data) {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        try {
            a.decode(data, (OutputStream)bOut);
        }
        catch (IOException e) {
            throw new RuntimeException("exception decoding Hex string: " + e);
        }
        return bOut.toByteArray();
    }

    public static int decode(String data, OutputStream out) throws IOException {
        return a.decode(data, out);
    }

    static {
    }
}

