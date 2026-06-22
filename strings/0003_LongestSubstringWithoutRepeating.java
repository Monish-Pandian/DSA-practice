import java.util.*;

/**
 * Problem: Longest Substring Without Repeating Characters (#3)
 * Difficulty: Med.
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(min(n,m))
 * LeetCode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0, left = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c)) left = Math.max(left, map.get(c) + 1);
            map.put(c, r);
            max = Math.max(max, r - left + 1);
        }
        return max;
    }
}
