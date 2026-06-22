/**
 * Problem: Two Sum II - Input Array Is Sorted (#167)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumIISortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) return new int[]{l+1, r+1};
            else if (sum < target) l++; else r--;
        }
        return new int[]{};
    }
}
