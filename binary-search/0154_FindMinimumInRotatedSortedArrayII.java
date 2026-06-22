/**
 * Problem: Find Minimum In Rotated Sorted Array II (#154)
 * Difficulty: Hard
 * Pattern: BinarySearch
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[r]) l = mid + 1;
            else if (nums[mid] < nums[r]) r = mid;
            else r--; // can't determine which side, shrink right
        }
        return nums[l];
    }
}
