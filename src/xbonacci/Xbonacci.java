package xbonacci;

import java.util.Arrays;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {
        double[] arr = new double[n];
        if (n == 0) return arr;
        else {
            for (int i = 0; i < n; i++) {
                if (i < s.length) arr[i] = s[i];
                else {
                    arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
                }
            }
            return arr;
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 20)));
    }
}
