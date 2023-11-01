package leetcode.D2023_07_02_Q42_trapping_rain_water;

import java.util.Arrays;

class trapping_rain_water {
    public static void main(String[] args) {
        System.out.println("42");

        int[] input_1 = new int[] { 4, 2, 0, 3, 2, 5 };

        int sum = trapping_rain_water.trap(input_1);

        System.out.println("sum");
        System.out.println(sum);

    }

    public static int trap(int[] height) {
        int[] maxLeftArray = new int[height.length];
        int[] maxRightArray = new int[height.length];
        int[] waterArray = new int[height.length];

        int maxLeft = 0;
        for (int n = 0; n < height.length; n++) {
            if (n == 0) {
                maxLeftArray[0] = 0;
                maxLeft = height[0];
            } else {
                maxLeftArray[n] = maxLeft;
                if (maxLeft < height[n]) {
                    maxLeft = height[n];
                }
            }
        }

        System.out.println("Arrays.toString(maxLeftArray)");
        System.out.println(Arrays.toString(maxLeftArray));

        int maxRight = 0;
        for (int n = height.length - 1; n >= 0; n--) {
            if (n == height.length - 1) {
                maxRightArray[height.length - 1] = 0;
                maxRight = height[height.length - 1];
            } else {
                maxRightArray[n] = maxRight;
                if (maxRight < height[n]) {
                    maxRight = height[n];
                }
            }
        }

        System.out.println("Arrays.toString(maxRightArray)");
        System.out.println(Arrays.toString(maxRightArray));

        int waterArraySum = 0;
        for (int n = 0; n < height.length; n++) {
            int value = Math.min(maxLeftArray[n], maxRightArray[n]) - height[n];
            waterArray[n] = value > 0 ? value : 0;
            waterArraySum += waterArray[n];
        }

        System.out.println("Arrays.toString(waterArray)");
        System.out.println(Arrays.toString(waterArray));

        return waterArraySum;
    }
}
