package leetcode.C_01_array_two_pointers.D2023_07_01_do_3_Q11_container_with_most_water;

class container_with_most_water {
    public static void main(String[] args) {

        int[] input_1 = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result_1 = container_with_most_water.maxArea(input_1);
        System.out.println(result_1);

        // int[] input_2 = new int[] { 1, 1 };
    }

    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;

        while (i < j) {
            int width = j - i;
            int ht = Math.min(height[i], height[j]);
            int area = width * ht;

            max = Math.max(max, area);

            if (height[i] < height[j]) {
                i++;
                continue;
            }
            if (height[i] > height[j]) {
                j--;
                continue;
            }
            if (height[i] == height[j]) {
                i++;
                j--;
                continue;
            }
        }

        return max;
    }
}
