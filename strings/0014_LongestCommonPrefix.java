/**
 * Problem: Longest Common Prefix (#14)
 * Difficulty: Easy
 * Pattern: VerticalScan
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length()-1);
        return prefix;
    }
}
