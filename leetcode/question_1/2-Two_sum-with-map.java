// 使用 Map 减少一个 n 的时间复杂度，转为存储 Map 换取一个 n 的空间复杂度

package leetcode.question_1;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Two_sum_2 {
    public static void main(String[] args) {

        int[] input = {2,7,11,15};

        int[] result = Two_sum.twoSum(input,9);

        System.out.println(Arrays.toString(result));
        
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int item = nums[i];
            int x = target - item;

            System.out.println("item:" + item);
            
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }

            map.put(item, i);
        }

        return new int[]{0, 0};
    }
}
