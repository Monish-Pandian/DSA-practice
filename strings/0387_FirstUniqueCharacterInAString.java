/**
 * Problem: First Unique Character In A String (#387)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c-'a']++;
        for (int i = 0; i < s.length(); i++) if (count[s.charAt(i)-'a'] == 1) return i;
        return -1;
    }
}
