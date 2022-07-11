package droot;

public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        char[] numbers = String.valueOf(n).toCharArray();
        for (Character c : numbers) sum += Character.getNumericValue(c);
        return (sum > 9 ? digital_root(sum) : sum);
    }

    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }
}
