import java.util.*;

/**
 * Problem: Keyboard Row (#500)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/keyboard-row/
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> res = new ArrayList<>();
        for (String w : words) {
            String lower = w.toLowerCase();
            for (String row : rows) {
                boolean ok = true;
                for (char c : lower.toCharArray()) if (row.indexOf(c) < 0) { ok = false; break; }
                if (ok) { res.add(w); break; }
            }
        }
        return res.toArray(new String[0]);
    }
}
