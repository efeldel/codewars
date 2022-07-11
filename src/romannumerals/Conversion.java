package romannumerals;

public class Conversion {
    public static String solution(int n) {
        String mm, dd, cc, ll, xx, vv, ii;
        int m, d, c, l, x, v, i;
        m = n / 1000;
        d = (n - m * 1000) / 500;
        c = (n - m * 1000 - d * 500) / 100;
        l = (n - m * 1000 - d * 500 - c * 100) / 50;
        x = (n - m * 1000 - d * 500 - c * 100 - l * 50) / 10;
        v = (n - m * 1000 - d * 500 - c * 100 - l * 50 - x * 10) / 5;
        i = (n - m * 1000 - d * 500 - c * 100 - l * 50 - x * 10 - v * 5);
        mm = switch (m) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            default -> "";
        };
        dd = switch (d) {
            case 1 -> (c == 4 ? "" : "D");
            case 2 -> "DD";
            default -> "";
        };
        cc = switch (c) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> (d == 0 ? "CD" : "CM");
            default -> "";
        };
        ll = switch (l) {
            case 1 -> (x == 4 ? "" : "L");
            case 2 -> "LL";
            default -> "";
        };
        xx = switch (x) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> (l == 0 ? "XL" : "XC");
            default -> "";
        };
        vv = switch (v) {
            case 1 -> (i == 4 ? "" : "V");
            case 2 -> "VV";
            default -> "";
        };
        ii = switch (i) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> (v == 0 ? "IV" : "IX");
            default -> "";
        };
        return "" + mm
                + dd
                + cc
                + ll
                + xx
                + vv
                + ii;
    }

    public static void main(String[] args) {
        System.out.println(Conversion.solution(1990));
    }
}
