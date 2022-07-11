package arraysum;

import java.util.Arrays;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        System.out.println(Arrays.toString(arr));
        long sum;
        int leftSum = 0;
        int rightSum = 0;
        int index = 0;
        boolean right = false;
        sum = Arrays.stream(arr).sum();
        if (sum / 2 == 0) return -1;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (right) rightSum += arr[i];
                else {
                    leftSum += arr[i];
                    if (Math.abs(leftSum) >= Math.abs((sum / 2))) {
                        leftSum -= arr[i];
                        index = i;
                        right = true;
                    }
                }
            }
            return (leftSum == rightSum ? index : -1);
        }
    }

    public static void main(String[] args) {
//        Random rand = new Random();
//        int[] test = new int[rand.nextInt(20)];
//        for (int i = 0; i < test.length; i++) {
//            test[i] = rand.nextInt(100);
//        }
        int[] test = {3905, -3718, 2462, 7398, -7372, 6629, 1535, 5521, 661, -4786,
                -9, 9597, 8279, -628, 6610, -4998, 5580, 3574, -8867, 1659,
                -6056, -6761, -9739, -3135, -2522, -9870, -844, 894, -3634, -5051,
                -5302, 8183, 9076, 9802, 7040, -8227, 988, 870, -8029, 4186,
                3322, 9947, -1788, 3987, 8078, -7620, -9093, 4077, 2293, 8574,
                5490, -4921, -1997, 6310, 4480, 5196, 3095, 2021, -6080, -3502,
                2632, 512, 5808, 6901, 237, 4709, 8245, 6871, 4790, -316,
                5993, -9537, -1079, 8523, 662, 1360, -7258, -8532, -7995, 6328,
                8703, -5578, -378, -9099, 1656, 7951, 7799, 5042, -8019, -6159,
                5333, -9829, -1026, -7388, 6881, -6789, 6769, 2465, 2688, -1900,
                -4312, -2172, 9536, 785, 8186, -6043, 7325, -237, -9569, 2966,
                2890, -8991, -1857, 6219, 5515, 3482, -1640, 8199, 7044, 9381,
                -2330, -2244, -6423, -8041, 1779, 4075, -4546, -7084, 1318, -3264,
                7535, -8731, 4456, 1949, 2785, 6082, -1877, -9697, -1291, 6552,
                -3418, -4665, -1579, -5306, 8559, 119955};
        System.out.println(Arrays.toString(test));
        System.out.println(findEvenIndex(test));
    }
}
