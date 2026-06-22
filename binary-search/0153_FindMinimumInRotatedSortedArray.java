/**
 * Problem: Find Minimum In Rotated Sorted Array (#153)
 * Difficulty: Med.
 * Pattern: BinarySearch
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[r]) l = mid + 1; else r = mid;
        }
        return nums[l];
    }
}
