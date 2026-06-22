/**
 * Problem: Ransom Note (#383)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) count[c-'a']++;
        for (char c : ransomNote.toCharArray()) if (--count[c-'a'] < 0) return false;
        return true;
    }
}
