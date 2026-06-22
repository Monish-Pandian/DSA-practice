import java.util.*;

/**
 * Problem: Longest Common Suffix Queries (#3093)
 * Difficulty: Hard
 * Pattern: Trie
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/longest-common-suffix-queries/
 */
public class LongestCommonSuffixQueries {
    int[][] trie = new int[500001][26];
    int[] best = new int[500001], bestLen = new int[500001];
    int node = 1;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        Arrays.fill(bestLen, Integer.MAX_VALUE);
        for (int i = 0; i < wordsContainer.length; i++) {
            String w = wordsContainer[i];
            int cur = 0;
            if (w.length() < bestLen[0]) { best[0] = i; bestLen[0] = w.length(); }
            for (int j = w.length()-1; j >= 0; j--) {
                int c = w.charAt(j) - 'a';
                if (trie[cur][c] == 0) trie[cur][c] = node++;
                cur = trie[cur][c];
                if (w.length() < bestLen[cur]) { best[cur] = i; bestLen[cur] = w.length(); }
            }
        }
        int[] res = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            String q = wordsQuery[i];
            int cur = 0;
            for (int j = q.length()-1; j >= 0; j--) {
                int c = q.charAt(j) - 'a';
                if (trie[cur][c] == 0) break;
                cur = trie[cur][c];
            }
            res[i] = best[cur];
        }
        return res;
    }
}
