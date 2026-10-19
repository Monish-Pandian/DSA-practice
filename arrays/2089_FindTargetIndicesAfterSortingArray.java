/**
 * Problem: Find Target Indices After Sorting Array (#2089)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */

import java.util.*;
class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (int num : nums) {
            if (num < target) {
                cnt1++;
            } else if (num == target) {
                cnt2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = cnt1; i < cnt1 + cnt2; i++) {
            res.add(i);
        }
        return res;
    }
}
