/**
 * Problem: Remove Element (#27)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) if (n != val) nums[k++] = n;
        return k;
    }
}
