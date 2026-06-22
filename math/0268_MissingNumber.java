/**
 * Problem: Missing Number (#268)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) actual += num;
        return expected - actual;
    }
}
