package leetcode.C_01_array_two_pointers.D2023_07_01_do_1_Q344_reverse_string;

import java.util.Arrays;

class rever_string {
    public static void main(String[] args) {
        char[] s_1 = { 'h', 'e', 'l', 'l', 'o' };
        char[] result_1 = rever_string.reverseString(s_1);
        System.out.println("reusult_1:" + Arrays.toString(result_1));

        char[] s_2 = { 'H', 'a', 'n', 'n', 'a', 'h' };
        char[] result_2 = rever_string.reverseString(s_2);
        System.out.println("reusult_2:" + Arrays.toString(result_2));
    }

    public static char[] reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        for (int n = 0; n < s.length; n++) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;

            if (i == j || i + 1 == j) {
                break;
            }

            i++;
            j--;
        }

        return s;
    }
}
