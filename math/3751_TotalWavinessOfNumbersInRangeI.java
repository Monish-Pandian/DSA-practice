/**
 * Problem: Total Waviness Of Numbers In Range I (#3751)
 * Difficulty: Med.
 * Pattern: Math
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/
 */
public class TotalWavinessOfNumbersInRangeI {
    // Waviness of x = |d1 - d2| + |d2 - d3| + ... for digits d1,d2,...
    public long totalWaviness(int l, int r) {
        long ans = 0;
        for (int x = l; x <= r; x++) {
            ans += waviness(x);
        }
        return ans;
    }
    private int waviness(int x) {
        int prev = -1, w = 0;
        while (x > 0) {
            int d = x % 10;
            if (prev != -1) w += Math.abs(d - prev);
            prev = d;
            x /= 10;
        }
        return w;
    }
}
