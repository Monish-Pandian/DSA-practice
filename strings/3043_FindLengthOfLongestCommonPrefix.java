import java.util.*;

/**
 * Problem: Find Length Of Longest Common Prefix (#3043)
 * Difficulty: Med.
 * Pattern: Trie
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
 */
public class FindLengthOfLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixes = new HashSet<>();
        for (int n : arr1) {
            while (n > 0) { prefixes.add(n); n /= 10; }
        }
        int res = 0;
        for (int n : arr2) {
            while (n > 0) {
                if (prefixes.contains(n)) {
                    res = Math.max(res, String.valueOf(n).length());
                    break;
                }
                n /= 10;
            }
        }
        return res;
    }
}
