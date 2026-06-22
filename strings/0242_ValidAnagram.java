/**
 * Problem: Valid Anagram (#242)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c-'a']++;
        for (char c : t.toCharArray()) if (--count[c-'a'] < 0) return false;
        return true;
    }
}
