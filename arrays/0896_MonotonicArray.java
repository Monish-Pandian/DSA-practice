/**
 * Problem: Monotonic Array (#896)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/monotonic-array/
 */
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) dec = false;
            if (nums[i] < nums[i-1]) inc = false;
        }
        return inc || dec;
    }
}
