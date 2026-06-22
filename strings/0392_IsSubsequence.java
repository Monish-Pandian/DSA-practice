/**
 * Problem: Is Subsequence (#392)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char c : t.toCharArray()) if (i < s.length() && c == s.charAt(i)) i++;
        return i == s.length();
    }
}
