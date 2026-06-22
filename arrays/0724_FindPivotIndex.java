/**
 * Problem: Find Pivot Index (#724)
 * Difficulty: Easy
 * Pattern: PrefixSum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-pivot-index/
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0; for (int n : nums) total += n;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }
}
