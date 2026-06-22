/**
 * Problem: Next Permutation (#31)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/next-permutation/
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
        }
        int l = i+1, r = nums.length-1;
        while (l < r) { int tmp = nums[l]; nums[l++] = nums[r]; nums[r--] = tmp; }
    }
}
