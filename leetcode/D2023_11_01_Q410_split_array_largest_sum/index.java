package leetcode.D2023_11_01_Q410_split_array_largest_sum;

public class index {
    public static void main(String[] args) {
        System.out.println("test");

        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    public static int splitArray(int[] nums, int m) {
        if (nums == null || nums.length == 0 || m == 0) {
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

                System.out.println("mid");
                System.out.println(mid);

                if (isPossible(nums, mid, m)) {
                    ans = mid; // here get 18 as result
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }

            }

            return ans;
        }
    }

    public static boolean isPossible(int[] nums, int mid, int m) {
        int sum = 0;
        int requiredSubarrays = 1;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > mid) {
                requiredSubarrays++;
                sum = nums[i];
            }
        }

        if (requiredSubarrays <= m) {
            return true;
        }

        return false;
    }
}
