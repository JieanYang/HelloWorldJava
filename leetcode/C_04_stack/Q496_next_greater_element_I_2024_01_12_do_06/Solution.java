package leetcode.C_04_stack.Q496_next_greater_element_I_2024_01_12_do_06;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public int findIndex(int[] array, int valueToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                return i;
            }
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            Deque<Integer> stack = new ArrayDeque<>();

            // for (int j = nums2.length - 1; j >= findIndex(nums2, nums1[i]); j--) {
            // if (nums2[j] > nums1[i]) {
            // stack.push(nums2[j]);
            // }
            // }

            for (int j = findIndex(nums2, nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    stack.push(nums2[j]);
                    break;
                }
            }

            res[i] = stack.isEmpty() ? -1 : stack.peek();
        }

        return res;
    }
}
