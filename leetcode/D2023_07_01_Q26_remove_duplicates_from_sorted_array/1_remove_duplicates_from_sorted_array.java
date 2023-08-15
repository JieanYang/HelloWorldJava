package leetcode.D2023_07_01_Q26_remove_duplicates_from_sorted_array;

class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        System.out.println("tes");
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0;

        while (j < nums.length) {

            if (i == 0 || nums[i - 1] < nums[j]) {
                nums[i] = nums[j];
                i++;
            }

            j++;
        }

        return i;
    }
}
