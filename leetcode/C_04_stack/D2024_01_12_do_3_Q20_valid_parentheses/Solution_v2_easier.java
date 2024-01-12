package leetcode.C_04_stack.D2024_01_12_do_3_Q20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_v2_easier {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
