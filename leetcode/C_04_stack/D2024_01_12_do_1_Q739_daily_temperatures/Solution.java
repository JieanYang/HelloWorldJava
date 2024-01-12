package leetcode.C_04_stack.D2024_01_12_do_1_Q739_daily_temperatures;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        // Use stack to compare
        for (int i = temperatures.length - 1; i >= 0; i--) {
            System.out.println("i");
            System.out.println(i);
            // pop() item until the top of peek is bigger than temperatures[i]
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            // Get top index than calculate the distance between i and top index
            if (stack.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stack.peek() - i;
            }

            // Push this i into stack
            stack.push(i);
        }

        return res;
    }
}
