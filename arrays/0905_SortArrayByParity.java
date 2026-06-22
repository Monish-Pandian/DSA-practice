/**
 * Problem: Sort Array By Parity (#905)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length-1;
        while (l < r) {
            if (nums[l] % 2 != 0) { int t = nums[l]; nums[l] = nums[r]; nums[r--] = t; }
            else l++;
        }
        return nums;
    }
}
