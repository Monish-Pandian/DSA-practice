/**
 * Problem: Running Sum Of 1d Array (#1480)
 * Difficulty: Easy
 * Pattern: PrefixSum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) nums[i] += nums[i-1];
        return nums;
    }
}
