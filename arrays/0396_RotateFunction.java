/**
 * Problem: Rotate Function (#396)
 * Difficulty: Med.
 * Pattern: Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/rotate-function/
 */
public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0, f = 0;
        for (int i = 0; i < n; i++) { sum += nums[i]; f += (long)i * nums[i]; }
        long max = f;
        for (int i = 1; i < n; i++) { f += sum - n * (long)nums[n-i]; max = Math.max(max, f); }
        return (int) max;
    }
}
