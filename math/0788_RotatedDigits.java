/**
 * Problem: Rotated Digits (#788)
 * Difficulty: Med.
 * Pattern: Simulation
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/rotated-digits/
 */
public class RotatedDigits {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) count++;
        }
        return count;
    }
    private boolean isGood(int num) {
        boolean different = false;
        while (num > 0) {
            int d = num % 10;
            if (d == 3 || d == 4 || d == 7) return false;
            if (d == 2 || d == 5 || d == 6 || d == 9) different = true;
            num /= 10;
        }
        return different;
    }
}
