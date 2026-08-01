/**
 * Problem: Minimum Number of Pushes to Type Word II (#3016)
 * Difficulty: Medium
 * Pattern: Greedy, Frequency Counting, Sorting
 * Time Complexity: O(n + 26 log 26)
 * Space Complexity: O(26)
 * LeetCode: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
 */

import java.util.*;
class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int ans = 0;
        int push = 1;
        int count = 0;

        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0)
                break;

            ans += freq[i] * push;
            count++;

            if (count % 8 == 0) {
                push++;
            }
        }

        return ans;
    }
}