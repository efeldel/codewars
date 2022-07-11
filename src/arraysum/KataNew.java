package arraysum;

import java.util.Arrays;

public class KataNew {
    public static int findEvenIndex(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int leftSum = 0;
        int rightSum = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {8, 0};
        System.out.println(Arrays.toString(test));
        System.out.println(findEvenIndex(test));
    }
}
