/**
 * Problem: Minimum Element After Replacement With Digit Sum (#3300)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n*d)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
 */
public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            int s = 0;
            while (n > 0) { s += n%10; n /= 10; }
            min = Math.min(min, s);
        }
        return min;
    }
}
