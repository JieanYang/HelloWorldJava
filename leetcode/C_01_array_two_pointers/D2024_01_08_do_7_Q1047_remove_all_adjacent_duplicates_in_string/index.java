package leetcode.C_01_array_two_pointers.D2024_01_08_do_7_Q1047_remove_all_adjacent_duplicates_in_string;

public class index {
    public String removeDuplicates(String s) {
        int i = 0, j = 1;

        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                s = s.substring(0, i) + s.substring(j + 1);
                if (i > 0) {
                    i = i - 1;
                    j = j - 1;
                }
            } else {
                i++;
                j++;
            }
        }

        return s;
    }
}
