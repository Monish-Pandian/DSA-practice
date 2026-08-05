/**
 * Problem: Find Missing Elements
 * Difficulty: Easy
 * Pattern: Array, Hashing
 * Time Complexity: O(n + range)
 * Space Complexity: O(1)
 */

import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean[] present = new boolean[101];

        for (int num : nums) {
            present[num] = true;
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}