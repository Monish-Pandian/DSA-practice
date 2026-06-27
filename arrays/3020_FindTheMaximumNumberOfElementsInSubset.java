/**
 * Problem: Maximum Length of Square-Chain Subsequence(#3020)
 * Difficulty: Medium
 * Pattern: HashMap + Frequency Counting + Greedy Expansion
 * Time Complexity: O(n + k log k) 
 * Space Complexity: O(k)
 * LeetCode: https://leetcode.com/problems/maximum-length-of-squared-subsequence/ 
 */
import java.util.*;
class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put((long) i, freq.getOrDefault((long) i, 0) + 1);
        }

        int ans = 1;

        for (long start : freq.keySet()) {
            int len = 0;
            long x = start;

            if (x == 1) {
                ans = Math.max(ans, freq.get(1L) % 2 == 0 
                                    ? freq.get(1L) - 1 
                                    : freq.get(1L));
                continue;
            }

           while (freq.containsKey(x) && freq.get(x) >= 2) {
                    len += 2;
                    long next = x * x;
                    if (next / x != x) break; 
                    x = next;
                }

                if (freq.containsKey(x) && freq.get(x) >= 1) {
                    len += 1;
                } else {
                    len = Math.max(len - 2 + 1, 1); 
                }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}