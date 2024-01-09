package leetcode.C_02_binary_search.D2024_01_09_do_4_Q1011_capacity_to_ship_packages_within_d_days;

public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0, min_capacity = Integer.MAX_VALUE;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, mid, days)) {
                min_capacity = Math.min(min_capacity, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return min_capacity;
    }

    public boolean isPossible(int[] weights, int mid, int days) {
        int requiredDays = 1;
        int sum = 0, i = 0;

        while (i < weights.length) {
            sum += weights[i];
            if (sum > mid) {
                requiredDays++;
                sum = weights[i];
            }
            i++;
        }

        return requiredDays <= days;
    }
}
