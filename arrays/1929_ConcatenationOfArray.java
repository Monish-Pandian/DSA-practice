/**
 * Problem: Concatenation Of Array (#1929)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2*n];
        for (int i = 0; i < n; i++) { res[i] = nums[i]; res[i+n] = nums[i]; }
        return res;
    }
}
