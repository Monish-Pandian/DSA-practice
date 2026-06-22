/**
 * Problem: Squares Of Sorted Array (#977)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, l = 0, r = n-1, k = n-1;
        int[] res = new int[n];
        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) res[k--] = nums[l] * nums[l++];
            else res[k--] = nums[r] * nums[r--];
        }
        return res;
    }
}
