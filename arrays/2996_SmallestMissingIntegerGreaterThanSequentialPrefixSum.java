/**
 * Problem: Missing Integer (#2996)
 * Difficulty: Easy
 * Pattern: Array, Hashing
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
 */
import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        while (hs.contains(sum)) {
            sum++;
        }

        return sum;
    }
}