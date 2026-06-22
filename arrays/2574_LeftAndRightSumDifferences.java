/**
 * Problem: Left And Right Sum Differences (#2574)
 * Difficulty: Easy
 * Pattern: PrefixSum
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/left-and-right-sum-differences/
 */
public class LeftAndRightSumDifferences {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n], right = new int[n];
        for (int i = 1; i < n; i++) left[i] = left[i-1] + nums[i-1];
        for (int i = n-2; i >= 0; i--) right[i] = right[i+1] + nums[i+1];
        for (int i = 0; i < n; i++) left[i] = Math.abs(left[i] - right[i]);
        return left;
    }
}
