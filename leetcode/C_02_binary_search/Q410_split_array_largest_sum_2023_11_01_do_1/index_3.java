package leetcode.C_02_binary_search.Q410_split_array_largest_sum_2023_11_01_do_1;

public class index_3 {
    int[] nums;

    public int splitArray(int[] nums, int k) {
        this.nums = nums;
        int low = 0, high = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(mid, k)) {
                min = Math.min(min, mid);
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return min;
    }

    private boolean isPossible(int mid, int m) {
        int requiredSubarrays = 1, i = 0;
        int sum = 0;

        while (i < nums.length) {
            sum += nums[i];
            if (sum > mid) {
                requiredSubarrays++;
                sum = nums[i];
            }
            i++;
        }

        return requiredSubarrays <= m;
    }
}