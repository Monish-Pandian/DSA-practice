import java.util.*;

/**
 * Problem: Longest Harmonious Subsequence (#594)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/longest-harmonious-subsequence/
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.merge(n, 1, Integer::sum);
        int res = 0;
        for (int k : map.keySet())
            if (map.containsKey(k+1)) res = Math.max(res, map.get(k) + map.get(k+1));
        return res;
    }
}
