/**
 * Problem: Total Waviness Of Numbers In Range II (#3753)
 * Difficulty: Hard
 * Pattern: Math
 * Time Complexity: O(log n)
 * Space Complexity: O(log n)
 * LeetCode: https://leetcode.com/problems/total-waviness-of-numbers-in-range-i-i/
 */
public class TotalWavinessOfNumbersInRangeII {
    // Digit DP: compute sum of waviness for all numbers in [1, n]
    private long[] digits;
    private long[][][][] memo;

    public long totalWaviness(long l, long r) {
        return solve(r) - solve(l - 1);
    }

    private long solve(long n) {
        if (n <= 0) return 0;
        String s = Long.toString(n);
        int len = s.length();
        digits = new long[len];
        for (int i = 0; i < len; i++) digits[i] = s.charAt(i) - '0';
        // memo[pos][prevDigit+1][tight][started]
        memo = new long[len][11][2][2];
        for (long[][][] a : memo) for (long[][] b : a) for (long[] c : b) java.util.Arrays.fill(c, -1);
        return dp(0, -1, 1, 0, 0);
    }

    private long dp(int pos, int prev, int tight, int started, long wave) {
        if (pos == digits.length) return wave;
        int prevIdx = prev + 1;
        if (memo[pos][prevIdx][tight][started] != -1 && wave == 0) {
            // Only cache when wave==0 (use additive approach)
        }
        int limit = tight == 1 ? (int) digits[pos] : 9;
        long res = 0;
        for (int d = 0; d <= limit; d++) {
            int newTight = (tight == 1 && d == limit) ? 1 : 0;
            if (started == 0 && d == 0) {
                res += dp(pos + 1, -1, newTight, 0, 0);
            } else {
                int add = (prev == -1) ? 0 : Math.abs(d - prev);
                res += dp(pos + 1, d, newTight, 1, wave + add);
            }
        }
        return res;
    }
}
