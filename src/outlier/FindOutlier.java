package outlier;

import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers){
        boolean findOdd = false;
        int n = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                n++;
            } else {
                n--;
            }
        }
        if (n > 0) findOdd = true;
        for (int i = 0; i < integers.length; i++) {
            if (findOdd && Math.abs(integers[i] % 2) == 1) index = i;
            else if (!findOdd && integers[i] % 2 == 0) index = i;
        }
        return integers[index];
    }

    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,10,-3};
        System.out.println(find(exampleTest1));
    }
}
