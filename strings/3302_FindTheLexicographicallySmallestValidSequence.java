/**
 * Problem: Find the Lexicographically Smallest Valid Sequence (#3302)
 * Difficulty: Hard
 * Pattern: String, Greedy, Subsequence
 * Time Complexity: O(n + m)
 * Space Complexity: O(m)
 * LeetCode: https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence/
 */

import java.util.*;
class Solution {

    public int[] validSequence(String word1, String word2) {
        int n = word1.length(),
            m = word2.length();
        int[] last = new int[m];
        Arrays.fill(last, -1);
        int j = m - 1;
        for (int i = n - 1; i >= 0; --i) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j -= 1;
            }
        }
        int[] res = new int[m];
        int skip = 0;
        j = 0;
        for (int i = 0; i < n; ++i) {
            if (j == m) break;
            if (
                word1.charAt(i) == word2.charAt(j) ||
                (skip == 0 && (j == m - 1 || i < last[j + 1]))
            ) {
                skip += word1.charAt(i) != word2.charAt(j) ? 1 : 0;
                res[j] = i;
                j += 1;
            }
        }
        return j == m ? res : new int[0];
    }
}