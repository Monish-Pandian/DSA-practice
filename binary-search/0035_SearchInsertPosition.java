/**
 * Problem: Search Insert Position (#35)
 * Difficulty: Easy
 * Pattern: BinarySearch
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) l = mid + 1; else r = mid;
        }
        return l;
    }
}
