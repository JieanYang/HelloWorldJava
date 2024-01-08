package leetcode.C_01_array_two_pointers.D2024_01_08_do_7_Q1047_remove_all_adjacent_duplicates_in_string;

public class index_2 {
    public String removeDuplicates(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        char[] results = s.toCharArray();
        int i = 1, j = 1;

        // while (j < s.length()) {
        // if (i == 0 || i != 0 && results[i - 1] != results[j]) {
        // results[i] = results[j];
        // i++;
        // } else {
        // i--;
        // }
        // j++;
        // }

        while (j < s.length()) {
            if (i != 0 && results[i - 1] == results[j]) {
                i--;
            } else {
                results[i] = results[j];
                i++;
            }
            j++;
        }

        return new String(results, 0, i);
    }
}
