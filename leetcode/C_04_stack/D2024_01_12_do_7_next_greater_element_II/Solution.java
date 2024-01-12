package leetcode.C_04_stack.D2024_01_12_do_7_next_greater_element_II;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            Deque<Integer> stack = new ArrayDeque<>();

            int j = i;
            while (j < i + nums.length) {
                if (nums[j % nums.length] > nums[i]) {
                    stack.push(nums[j % nums.length]);
                    break;
                }
                j++;
            }

            res[i] = stack.isEmpty() ? -1 : stack.peek();
        }

        return res;
    }
}
