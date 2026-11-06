/**
 * Problem: Count Zero Request Servers (#2747)
 * Difficulty: Medium
 * Pattern: Array, Two Pointers
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/count-zero-request-servers/
 */

import java.util.*;
class Solution {

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int m = queries.length;
        Integer[] ids = new Integer[m];
        for (int i = 0; i < m; i++) ids[i] = i;
        Arrays.sort(ids, (i, j) -> Integer.compare(queries[i], queries[j]));

        int[] ans = new int[m];
        int[] cnt = new int[n + 1];
        int left = 0,
            right = 0,
            active = 0;

        for (int i : ids) {
            int q = queries[i];
            while (right < logs.length && logs[right][1] <= q) {
                int id = logs[right++][0];
                if (cnt[id]++ == 0) {
                    ++active;
                }
            }
            while (left < right && logs[left][1] < q - x) {
                int id = logs[left++][0];
                if (--cnt[id] == 0) {
                    --active;
                }
            }
            ans[i] = n - active;
        }
        return ans;
    }
}
