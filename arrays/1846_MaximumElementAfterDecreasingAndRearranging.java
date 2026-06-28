/**
 * Problem: Maximum Element After Decreasing and Rearranging (#1846)
 * Difficulty: Medium
 * Pattern: Greedy, Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) // Excluding sorting space
 * LeetCode: https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
 */
import java.util.*;
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }

        return arr[arr.length - 1];
    }
}