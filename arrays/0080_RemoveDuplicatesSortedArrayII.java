/**
 * Problem: Remove Duplicates From Sorted Array II (#80)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int n : nums) if (k < 2 || nums[k-2] != n) nums[k++] = n;
        return k;
    }
}
