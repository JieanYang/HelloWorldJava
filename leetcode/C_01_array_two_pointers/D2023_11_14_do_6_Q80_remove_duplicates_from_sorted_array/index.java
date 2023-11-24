package leetcode.C_01_array_two_pointers.D2023_11_14_do_6_Q80_remove_duplicates_from_sorted_array;

public class index {
    public int removeDuplicates(int[] nums) {
        int i = 2, j = 2;

        while (j < nums.length) {
            if (nums[i - 2] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }
}
