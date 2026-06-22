/**
 * Problem: Find First And Last Position Of Element In Sorted Array (#34)
 * Difficulty: Med.
 * Pattern: BinarySearch
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FindFirstAndLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{find(nums, target, true), find(nums, target, false)};
    }
    private int find(int[] nums, int target, boolean first) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                res = mid;
                if (first) r = mid - 1; else l = mid + 1;
            } else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }
}
