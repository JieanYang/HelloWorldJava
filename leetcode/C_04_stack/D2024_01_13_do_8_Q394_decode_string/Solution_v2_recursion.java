package leetcode.C_04_stack.D2024_01_13_do_8_Q394_decode_string;

/**
 * Solution_v2_recursion
 */
public class Solution_v2_recursion {
    int u = 0;

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return dfs(sb).toString();
    }

    public StringBuilder dfs(StringBuilder s) {
        StringBuilder res = new StringBuilder();

        while (this.u < s.length()) {
            // System.out.println("while s.charAt(u)");
            // System.out.println(u);
            // System.out.println(s.charAt(u));

            if (Character.isDigit(s.charAt(this.u))) {
                int k = 0;
                while (this.u < s.length() && Character.isDigit(s.charAt(this.u))) {
                    k = k * 10 + (s.charAt(this.u) - '0');
                    this.u++;
                }
                // System.out.println("k number before '['");
                // System.out.println(k);
                StringBuilder t = dfs(s); // @Note: we need to sychronize u after a recursion calculate by this.u
                while (k > 0) {
                    res.append(t);
                    k--;
                }
            } else if (Character.isAlphabetic(s.charAt(this.u))) {
                // System.out.println("before res append");
                // System.out.println(res.toString());
                res.append(s.charAt(this.u));
                // System.out.println("after res append");
                // System.out.println(res.toString());
                this.u++;
            } else if (s.charAt(this.u) == ']') {
                // System.out.println("u before ']");
                // System.out.println(u);
                this.u++;
                // System.out.println("u after ']");
                // System.out.println(u);
                // System.out.println("dfs recursion return value");
                // System.out.println(res);
                return res;
            } else if (s.charAt(u) == '[') {
                this.u++;
            }
        }

        // System.out.println("dfs final return value");
        // System.out.println(res);
        return res;
    }
}