import java.util.*;

/**
 * Problem: Jump Game IX (#3660)
 * Difficulty: Med.
 * Pattern: Greedy + MonotonicStack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/jump-game-ix/
 */
public class JumpGameIX {
    public long minCost(int[] nums, int[] costs) {
        int n = nums.length;
        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        // Monotonic stacks: inc tracks indices with increasing values, dec with decreasing
        Deque<Integer> inc = new ArrayDeque<>(), dec = new ArrayDeque<>();
        for (int i = 0; i < n - 1; i++) {
            // Pop from increasing stack: nums[j] <= nums[i], can jump to i+1
            while (!inc.isEmpty() && nums[inc.peek()] <= nums[i]) {
                int j = inc.pop();
                if (dp[j] != Long.MAX_VALUE)
                    dp[i+1] = Math.min(dp[i+1], dp[j] + costs[i+1]);
            }
            // Pop from decreasing stack: nums[j] > nums[i], can jump to i+1
            while (!dec.isEmpty() && nums[dec.peek()] > nums[i]) {
                int j = dec.pop();
                if (dp[j] != Long.MAX_VALUE)
                    dp[i+1] = Math.min(dp[i+1], dp[j] + costs[i+1]);
            }
            inc.push(i);
            dec.push(i);
        }
        return dp[n-1];
    }
}
