/**
 * Problem: Range Sum Query - Immutable (#303)
 * Difficulty: Easy
 * Pattern: PrefixSum
 * Time Complexity: O(1) query, O(n) build
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/range-sum-query-immutable/
 */
public class RangeSumQueryImmutable {
    private int[] prefix;
    public RangeSumQueryImmutable(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) prefix[i+1] = prefix[i] + nums[i];
    }
    public int sumRange(int left, int right) {
        return prefix[right+1] - prefix[left];
    }
}
