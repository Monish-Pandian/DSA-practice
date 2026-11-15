/**
 * Problem: Number of Sub-arrays With Odd Sum (#1524)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
 */

class Solution {

    public int numOfSubarrays(int[] arr) {
        final int MOD = (int) (1e9 + 7);
        int n = arr.length;
        int count = 0;

        for (int startIndex = 0; startIndex < n; startIndex++) {
            int currentSum = 0;
            for (int endIndex = startIndex; endIndex < n; endIndex++) {
                currentSum += arr[endIndex];
                if (currentSum % 2 != 0) {
                    count++;
                }
            }
        }

        return count % MOD;
    }
}
