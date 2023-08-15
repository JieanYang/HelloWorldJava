
// 暴力求和
package leetcode.date_2023_06_30_question_1_two_sum;

import java.util.Arrays;

class Two_sum {
    public static void main(String[] args) {

        int[] input = { 3, 2, 4 };

        int[] result = Two_sum.twoSum(input, 6);

        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0, 0 };
    }
}
