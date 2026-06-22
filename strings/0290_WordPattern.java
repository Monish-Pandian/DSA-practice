import java.util.*;

/**
 * Problem: Word Pattern (#290)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/word-pattern/
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> pw = new HashMap<>();
        Map<String, Character> wp = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char p = pattern.charAt(i); String w = words[i];
            if ((pw.containsKey(p) && !pw.get(p).equals(w)) ||
                (wp.containsKey(w) && wp.get(w) != p)) return false;
            pw.put(p, w); wp.put(w, p);
        }
        return true;
    }
}
