package leetcode.D2023_11_01_Q410_split_array_largest_sum;

public class index {
    public static void main(String[] args) {
        System.out.println("test");

    }

    public int splitArray(int[] nums, int m) {
        if (nums == null || nums.lenght == 0 || m == 0) {
            return 0;
        }

        int max = 0;
        int sum = 0;

        for (int num : nums) {
            sum = sum + num;
            max = Math.max(num, max);
        }

        if (m == nums.length) {
            return max;
        } else if (m == 0) {
            return sum;
        } else {

            int ans = 0;
            int lo = max;
            int hi = sum;

            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
            }
        }
    }
}
