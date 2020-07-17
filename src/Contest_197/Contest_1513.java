package Contest_197;

/**
 * https://leetcode.com/contest/weekly-contest-197/problems/number-of-substrings-with-only-1s/
 * 07/16/2020
 */
public class Contest_1513 {
    public int numSub(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int res = 0;
        int count = 0;
        int mod = (int) 1e9 + 7;

        for (char c : s.toCharArray()) {
            count = (c == '1' ? count + 1 : 0);
            res = (res + count) % mod;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}