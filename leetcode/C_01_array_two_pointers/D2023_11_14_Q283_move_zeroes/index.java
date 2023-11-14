package leetcode.C_01_array_two_pointers.D2023_11_14_Q283_move_zeroes;

/**
 * 非双指针解法
 */
public class index {

    public static void main(String[] args) {
        System.out.println("index");
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
