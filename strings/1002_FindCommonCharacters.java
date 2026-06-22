import java.util.*;

/**
 * Problem: Find Common Characters (#1002)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] min = new int[26];
        Arrays.fill(min, Integer.MAX_VALUE);
        for (String w : words) {
            int[] count = new int[26];
            for (char c : w.toCharArray()) count[c-'a']++;
            for (int i = 0; i < 26; i++) min[i] = Math.min(min[i], count[i]);
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < min[i]; j++) res.add(String.valueOf((char)('a'+i)));
        return res;
    }
}
