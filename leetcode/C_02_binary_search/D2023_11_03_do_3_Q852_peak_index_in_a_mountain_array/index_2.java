package leetcode.C_02_binary_search.D2023_11_03_do_3_Q852_peak_index_in_a_mountain_array;

public class index_2 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length - 2;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            int leftValue = arr[mid - 1];
            int midValue = arr[mid];
            int rightValue = arr[mid + 1];
            if (leftValue < midValue && midValue < rightValue) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return mid;
    }
}
