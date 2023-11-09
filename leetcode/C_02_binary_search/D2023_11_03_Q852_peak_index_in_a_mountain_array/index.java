package leetcode.C_02_binary_search.D2023_11_03_Q852_peak_index_in_a_mountain_array;

class index {
    public static void main(String[] args) {
        System.out.println("tes");

        int[] arr = new int[] { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        int results = peakIndexInMountainArray(arr);

        System.out.println("results");
        System.out.println(results);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 1;
        int right = arr.length - 2;

        while (left < right) {
            int mid = left + (right - left) / 2; // mid ~= i

            System.out.println("mid");
            System.out.println(mid);

            // condition arr[mid-1] < arr[mid] && arr[mid] > arr[mid + 1]
            if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}