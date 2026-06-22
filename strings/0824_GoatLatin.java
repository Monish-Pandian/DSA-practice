import java.util.*;

/**
 * Problem: Goat Latin (#824)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/goat-latin/
 */
public class GoatLatin {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (vowels.contains(w.charAt(0))) sb.append(w).append("ma");
            else sb.append(w.substring(1)).append(w.charAt(0)).append("ma");
            for (int j = 0; j <= i; j++) sb.append('a');
            if (i < words.length - 1) sb.append(' ');
        }
        return sb.toString();
    }
}
