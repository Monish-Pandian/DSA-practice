/**
 * Problem: Find the Smallest Missing Multiple of K(#3718)
 * Difficulty: Easy
 * Pattern: HashSet, Hashing, Simulation
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/smallest-missing-multiple-of-k/
 */
import java.util.*;
class Solution {

    public int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        int ans = k;

        while (seen.contains(ans)) {
            ans += k;
        }

        return ans;
    }
}