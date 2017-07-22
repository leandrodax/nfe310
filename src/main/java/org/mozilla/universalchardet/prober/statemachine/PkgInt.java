/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.prober.statemachine.PkgInt
 */
package org.mozilla.universalchardet.prober.statemachine;

/*
 * Exception performing whole class analysis ignored.
 */
public class PkgInt {
    public static final int INDEX_SHIFT_4BITS = 3;
    public static final int INDEX_SHIFT_8BITS = 2;
    public static final int INDEX_SHIFT_16BITS = 1;
    public static final int SHIFT_MASK_4BITS = 7;
    public static final int SHIFT_MASK_8BITS = 3;
    public static final int SHIFT_MASK_16BITS = 1;
    public static final int BIT_SHIFT_4BITS = 2;
    public static final int BIT_SHIFT_8BITS = 3;
    public static final int BIT_SHIFT_16BITS = 4;
    public static final int UNIT_MASK_4BITS = 15;
    public static final int UNIT_MASK_8BITS = 255;
    public static final int UNIT_MASK_16BITS = 65535;
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] a;

    public PkgInt(int indexShift, int shiftMask, int bitShift, int unitMask, int[] data) {
        this.a = indexShift;
        this.b = shiftMask;
        this.c = bitShift;
        this.d = unitMask;
        this.a = data;
    }

    public static int pack16bits(int a, int b) {
        return b << 16 | a;
    }

    public static int pack8bits(int a, int b, int c, int d) {
        return PkgInt.pack16bits((int)(b << 8 | a), (int)(d << 8 | c));
    }

    public static int pack4bits(int a, int b, int c, int d, int e, int f, int g, int h) {
        return PkgInt.pack8bits((int)(b << 4 | a), (int)(d << 4 | c), (int)(f << 4 | e), (int)(h << 4 | g));
    }

    public int unpack(int i) {
        return this.a[i >> this.a] >> ((i & this.b) << this.c) & this.d;
    }
}

