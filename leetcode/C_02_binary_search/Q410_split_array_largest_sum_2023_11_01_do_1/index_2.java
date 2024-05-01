package leetcode.C_02_binary_search.Q410_split_array_largest_sum_2023_11_01_do_1;

public class index_2 {
    public static void main(String[] args) {
        System.out.println("test");

        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    public static int splitArray(int[] nums, int k) {

        int low = 0;
        int hight = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            hight += nums[i];
        }

        System.out.println("To");
        System.out.println("low");
        System.out.println(low);
        System.out.println("hight");
        System.out.println(hight);

        int left = low;
        int right = hight;

        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid");
            System.out.println(mid);

            int count = 1;
            int sum = 0;

            for (int j = 0; j < nums.length; j++) {
                int item = nums[j];

                sum = sum + item;
                if (sum > mid) {
                    count++;
                    sum = item;
                }
            }

            System.out.println("count");
            System.out.println(count);
            System.out.println("left");
            System.out.println(left);

            if (count > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
