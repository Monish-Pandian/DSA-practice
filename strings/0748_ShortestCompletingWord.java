/**
 * Problem: Shortest Completing Word (#748)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/shortest-completing-word/
 */
public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];
        for (char c : licensePlate.toCharArray())
            if (Character.isLetter(c)) need[Character.toLowerCase(c)-'a']++;
        String res = null;
        for (String w : words) {
            int[] count = new int[26];
            for (char c : w.toCharArray()) count[c-'a']++;
            boolean ok = true;
            for (int i = 0; i < 26; i++) if (count[i] < need[i]) { ok = false; break; }
            if (ok && (res == null || w.length() < res.length())) res = w;
        }
        return res;
    }
}
