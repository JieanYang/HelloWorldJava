
package leetcode.C_01_array_two_pointers.D2023_11_14_do_6_Q80_remove_duplicates_from_sorted_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class index_2_just_more_than_twice_numbers {
    public static void main(String[] args) {
        removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 });
        removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 });
    }

    public static int removeDuplicates(int[] nums) {
        int i = 2, j = 2;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            Integer val = map.get(num);
            if (val == null) {
                map.put(num, 1);
            } else {
                map.put(num, val + 1);
            }
        }

        while (j < nums.length) {
            if (nums[i - 2] != nums[j] && map.get(nums[j]) >= 2) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }

            j++;
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, i)));

        return i;
    }
}
