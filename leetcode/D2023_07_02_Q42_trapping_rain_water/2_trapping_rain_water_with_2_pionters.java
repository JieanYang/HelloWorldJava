package leetcode.D2023_07_02_Q42_trapping_rain_water;

class trapping_rain_water {
    public static void main(String[] args) {
        System.out.println("42");

        int[] input_1 = new int[] { 4, 2, 0, 3, 2, 5 };

        int sum = trapping_rain_water.trap(input_1);

        System.out.println("sum");
        System.out.println(sum);

    }

    public static int trap(int[] height) {
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        int sum = 0;
        int left = 1;
        int right = height.length - 2;

        // Key condition: <=, == 的情况是最后一个计算的空间的水的计算，因为所有的 left 和 right 都需要计算，
        while (left <= right) { // 如果 left < right 则会漏算一个格子中的水，因为每次循环都只算单边，需要 == 来满足下一次另一边的计算
            if (maxLeft < maxRight) { // 右边最高的柱子比左边最高的柱子高
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    sum += maxLeft - height[left];
                }
                left++;
            } else { // 左边最高的柱子比右边最高的柱子高 或者 一样高
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
