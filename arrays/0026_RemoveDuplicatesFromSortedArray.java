/**
 * Problem: Remove Duplicates From Sorted Array (#26)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[i-1]) nums[k++] = nums[i];
        return k;
    }
}
