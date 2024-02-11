package leetcode.C_04_stack.D2024_01_13_do_8_Q394_decode_string;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution_v1_two_stacks {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        Deque<Integer> st_number = new ArrayDeque<>();
        Deque<StringBuilder> st_str = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st_number.push(n);
                n = 0;
                st_str.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st_number.pop();
                StringBuilder tmp = sb;
                sb = st_str.pop();
                while (k > 0) {
                    sb.append(tmp);
                    k--;
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
