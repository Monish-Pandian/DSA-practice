import java.util.*;

/**
 * Problem: Maximize Sum Of Array After K Negations (#1005)
 * Difficulty: Easy
 * Pattern: Greedy
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 */
public class MaximizeSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        // Flip negatives first
        for (int i = 0; i < nums.length && k > 0 && nums[i] < 0; i++) { nums[i] = -nums[i]; k--; }
        int sum = 0, min = Integer.MAX_VALUE;
        for (int n : nums) { sum += n; min = Math.min(min, n); }
        // If k is still odd, flip the smallest
        return k % 2 == 0 ? sum : sum - 2 * min;
    }
}
