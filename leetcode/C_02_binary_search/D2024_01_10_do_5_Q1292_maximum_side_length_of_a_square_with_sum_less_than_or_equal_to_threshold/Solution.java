package leetcode.C_02_binary_search.D2024_01_10_do_5_Q1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold;

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;
        int[][] preSum = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int l = 0, r = Math.min(m, n);
        while (l < r) {
            int mid = r - (r - l) / 2;

            if (isOk(preSum, mid, threshold)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }

    public boolean isOk(int[][] preSum, int len, int threshold) {
        int m = preSum.length - 1;
        int n = preSum[0].length - 1;

        for (int i = len; i <= m; i++) {
            for (int j = len; j <= n; j++) {
                int sumSquare = preSum[i][j] - preSum[i - len][j] - preSum[i][j - len] + preSum[i - len][j - len];

                if (sumSquare < threshold) {
                    return true;
                }
            }
        }

        return false;
    }
}