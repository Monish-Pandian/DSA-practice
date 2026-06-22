/**
 * Problem: Single Number (#136)
 * Difficulty: Easy
 * Pattern: BitManipulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) res ^= n;
        return res;
    }
}
