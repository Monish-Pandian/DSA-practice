/**
 * Problem: Move Zeroes (#283)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int n : nums) if (n != 0) nums[k++] = n;
        while (k < nums.length) nums[k++] = 0;
    }
}
