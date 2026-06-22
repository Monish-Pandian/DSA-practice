import java.util.*;

/**
 * Problem: Maximum Number Of Jumps To Reach The Last Index (#2770)
 * Difficulty: Med.
 * Pattern: DP
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/
 */
public class MaximumNumberOfJumpsToReachLastIndex {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (dp[j] != -1 && Math.abs(nums[i] - nums[j]) <= target)
                    dp[i] = Math.max(dp[i], dp[j] + 1);
        return dp[n - 1];
    }
}
