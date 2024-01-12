package leetcode.C_04_stack.D2024_01_12_do_3_Q20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (c == ')' && stack.peek() == '(' ||
                        c == '}' && stack.peek() == '{' ||
                        c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}