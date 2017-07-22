/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.Constants
 *  org.mozilla.universalchardet.prober.sequence.BulgarianModel
 *  org.mozilla.universalchardet.prober.sequence.Latin5BulgarianModel
 */
package org.mozilla.universalchardet.prober.sequence;

import org.mozilla.universalchardet.Constants;
import org.mozilla.universalchardet.prober.sequence.BulgarianModel;

public class Latin5BulgarianModel
extends BulgarianModel {
    private static final short[] a = new short[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 254, 255, 255, 254, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 253, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 253, 253, 253, 253, 253, 253, 253, 77, 90, 99, 100, 72, 109, 107, 101, 79, 185, 81, 102, 76, 94, 82, 110, 186, 108, 91, 74, 119, 84, 96, 111, 187, 115, 253, 253, 253, 253, 253, 253, 65, 69, 70, 66, 63, 68, 112, 103, 92, 194, 104, 95, 86, 87, 71, 116, 195, 85, 93, 97, 113, 196, 197, 198, 199, 200, 253, 253, 253, 253, 253, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 81, 226, 227, 228, 229, 230, 105, 231, 232, 233, 234, 235, 236, 45, 237, 238, 31, 32, 35, 43, 37, 44, 55, 47, 40, 59, 33, 46, 38, 36, 41, 30, 39, 28, 34, 51, 48, 49, 53, 50, 54, 57, 61, 239, 67, 240, 60, 56, 1, 18, 9, 20, 11, 3, 23, 15, 2, 26, 12, 10, 14, 6, 4, 13, 7, 8, 5, 19, 29, 25, 22, 21, 27, 24, 17, 75, 52, 241, 42, 16, 62, 242, 243, 244, 58, 245, 98, 246, 247, 248, 249, 250, 251, 91, 252, 253};

    public Latin5BulgarianModel() {
        super(a, Constants.CHARSET_ISO_8859_5);
    }
}

