import java.util.*;

/**
 * Problem: Verifying An Alien Dictionary (#953)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for (int i = 0; i < order.length(); i++) rank[order.charAt(i)-'a'] = i;
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i], w2 = words[i+1];
            boolean found = false;
            for (int j = 0; j < Math.min(w1.length(), w2.length()); j++) {
                if (rank[w1.charAt(j)-'a'] < rank[w2.charAt(j)-'a']) { found = true; break; }
                if (rank[w1.charAt(j)-'a'] > rank[w2.charAt(j)-'a']) return false;
            }
            if (!found && w1.length() > w2.length()) return false;
        }
        return true;
    }
}
