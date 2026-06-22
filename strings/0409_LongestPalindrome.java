/**
 * Problem: Longest Palindrome (#409)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) count[c]++;
        int res = 0;
        for (int c : count) res += c / 2 * 2;
        return res < s.length() ? res + 1 : res;
    }
}
