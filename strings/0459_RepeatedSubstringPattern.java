/**
 * Problem: Repeated Substring Pattern (#459)
 * Difficulty: Easy
 * Pattern: KMP
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/repeated-substring-pattern/
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }
}
