package leetcode.C_04_stack.D2024_01_12_do_2_Q735_asteroid_collision;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int itemAsteroid = asteroids[i];
            if (itemAsteroid > 0) {
                stack.push(itemAsteroid);
            } else {
                // calculate negative sign case until the first item is negative or all the rest
                // are possitive
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() + itemAsteroid < 0) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    stack.push(itemAsteroid);
                } else if (stack.peek() + itemAsteroid == 0) {
                    stack.pop();
                } else if (stack.peek() < 0) {
                    stack.push(itemAsteroid);
                }
            }
        }

        int resSize = stack.size();
        int[] res = new int[resSize];
        for (int i = resSize - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}
