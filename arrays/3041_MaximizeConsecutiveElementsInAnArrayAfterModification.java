/**
 * Problem: Maximize Consecutive Elements in an Array After Modification (#3041)
 * Difficulty: Medium
 * Pattern: Array, Hash Map
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/
 */

import java.util.*;
class Solution {

    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 0;
        for (int x : nums) {
            dp.put(
                x + 1,
                Math.max(dp.getOrDefault(x + 1, 0), dp.getOrDefault(x, 0) + 1)
            );
            dp.put(
                x,
                Math.max(dp.getOrDefault(x, 0), dp.getOrDefault(x - 1, 0) + 1)
            );
            ans = Math.max(ans, Math.max(dp.get(x), dp.get(x + 1)));
        }
        return ans;
    }
}
