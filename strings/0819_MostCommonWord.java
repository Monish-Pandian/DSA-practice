import java.util.*;

/**
 * Problem: Most Common Word (#819)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        for (String w : paragraph.toLowerCase().split("[^a-z]+"))
            if (!ban.contains(w)) count.merge(w, 1, Integer::sum);
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
