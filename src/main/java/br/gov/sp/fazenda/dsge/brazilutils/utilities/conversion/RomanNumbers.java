/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.conversion.RomanNumbers
 */
package br.gov.sp.fazenda.dsge.brazilutils.utilities.conversion;

public final class RomanNumbers {
    private static RomanNumbers a;

    private RomanNumbers() {
    }

    public String IntToRoman(int value) {
        String roman = "";
        if (value == 0) {
            return "";
        }
        if (value < 0) {
            throw new IllegalArgumentException("Impossivel criar numero romano menor que 0.");
        }
        if (value <= 3999) {
            while (value / 1000 >= 1) {
                roman = roman + "M";
                value -= 1000;
            }
            if (value / 900 >= 1) {
                roman = roman + "CM";
                value -= 900;
            }
            if (value / 500 >= 1) {
                roman = roman + "D";
                value -= 500;
            }
            if (value / 400 >= 1) {
                roman = roman + "CD";
                value -= 400;
            }
            while (value / 100 >= 1) {
                roman = roman + "C";
                value -= 100;
            }
            if (value / 90 >= 1) {
                roman = roman + "XC";
                value -= 90;
            }
            if (value / 50 >= 1) {
                roman = roman + "L";
                value -= 50;
            }
            if (value / 40 >= 1) {
                roman = roman + "XL";
                value -= 40;
            }
            while (value / 10 >= 1) {
                roman = roman + "X";
                value -= 10;
            }
            if (value / 9 >= 1) {
                roman = roman + "IX";
                value -= 9;
            }
            if (value / 5 >= 1) {
                roman = roman + "V";
                value -= 5;
            }
            if (value / 4 >= 1) {
                roman = roman + "IV";
                value -= 4;
            }
            while (value >= 1) {
                roman = roman + "I";
                --value;
            }
            return roman;
        }
        throw new IllegalArgumentException("Impossivel criar numero romano maior que 3999.");
    }

    public static RomanNumbers getInstance() {
        if (a == null) {
            a = new RomanNumbers();
        }
        return a;
    }

    public int RomanToInt(String roman) {
        if (this.validate(roman)) {
            char[] chars = roman.toCharArray();
            int lastChar = 32;
            int value = 0;
            for (int i = chars.length - 1; i >= 0; --i) {
                switch (chars[i]) {
                    case 'I': {
                        if (lastChar == 88 || lastChar == 86) {
                            --value;
                            break;
                        }
                        ++value;
                        break;
                    }
                    case 'V': {
                        value += 5;
                        break;
                    }
                    case 'X': {
                        if (lastChar == 67 || lastChar == 76) {
                            value -= 10;
                            break;
                        }
                        value += 10;
                        break;
                    }
                    case 'L': {
                        value += 50;
                        break;
                    }
                    case 'C': {
                        if (lastChar == 77 || lastChar == 68) {
                            value -= 100;
                            break;
                        }
                        value += 100;
                        break;
                    }
                    case 'D': {
                        value += 500;
                        break;
                    }
                    case 'M': {
                        value += 1000;
                    }
                }
                lastChar = chars[i];
            }
            return value;
        }
        throw new IllegalArgumentException("Numero recebido inv\u00e1lido!");
    }

    public boolean validate(String roman) {
        char[] chars = roman.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (Character.isLowerCase(chars[i])) {
                return false;
            }
            if (chars[i] == 'I' || chars[i] == 'V' || chars[i] == 'X' || chars[i] == 'L' || chars[i] == 'C' || chars[i] == 'D' || chars[i] == 'M') continue;
            return false;
        }
        return true;
    }
}

