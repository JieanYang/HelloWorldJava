package leetcode.question_42_trapping_rain_water;

class trapping_rain_water {
    public static void main(String[] args) {
        System.out.println("42");

        int[] input_1 = new int[] { 4, 2, 0, 3, 2, 5 };

        trapping_rain_water.trap(input_1);

    }

    public static int trap(int[] height) {
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        int sum = 0;
        int left = 1;
        int right = height.length - 2;

        // Key condition: <=, == 的情况是最后一个计算的空间的水的计算，因为所有的 left 和 right 都需要计算，
        // 如果 left < right 则会漏算一个格子中的水
        while (left <= right) {
            if (maxLeft < maxRight) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    sum += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    sum += maxRight - height[right];
                }
                right--;
            }

        }

        return sum;
    }
}
