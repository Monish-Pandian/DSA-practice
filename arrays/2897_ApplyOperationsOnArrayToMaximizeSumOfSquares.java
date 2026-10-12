/**
 * Problem: Apply Operations on Array to Maximize Sum of Squares (#2897)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/
 */

import java.util.*;
class Solution {

    public int maxSum(List<Integer> nums, int k) {
        final int MOD = 1000000007;
        int[] cnt = new int[30];
        for (int num : nums) {
            for (int i = 0; i < 30; i++) {
                if ((num & (1 << i)) != 0) {
                    cnt[i]++;
                }
            }
        }

        long res = 0;
        for (int i = 0; i < k; i++) {
            long cur = 0;
            for (int j = 29; j >= 0; j--) {
                if (cnt[j] > 0) {
                    cur |= 1L << j;
                    cnt[j]--;
                }
            }
            res = (res + cur * cur) % MOD;
        }

        return (int) res;
    }
}
