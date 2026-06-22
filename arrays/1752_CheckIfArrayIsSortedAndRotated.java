/**
 * Problem: Check If Array Is Sorted And Rotated (#1752)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */
public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) if (nums[i] > nums[(i+1)%n]) count++;
        return count <= 1;
    }
}
