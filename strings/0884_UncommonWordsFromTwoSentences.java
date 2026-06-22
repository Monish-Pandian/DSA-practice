import java.util.*;

/**
 * Problem: Uncommon Words From Two Sentences (#884)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : (s1 + " " + s2).split(" ")) map.merge(w, 1, Integer::sum);
        return map.entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .toArray(String[]::new);
    }
}
