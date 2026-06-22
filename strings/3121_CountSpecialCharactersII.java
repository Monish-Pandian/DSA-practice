import java.util.*;

/**
 * Problem: Count Special Characters II (#3121)
 * Difficulty: Med.
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/count-the-number-of-special-characters-ii/
 */
public class CountSpecialCharactersII {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> lastLower = new HashMap<>(), firstUpper = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) lastLower.put(c, i);
            else if (!firstUpper.containsKey(Character.toLowerCase(c)))
                firstUpper.put(Character.toLowerCase(c), i);
        }
        int count = 0;
        for (char c : lastLower.keySet())
            if (firstUpper.containsKey(c) && lastLower.get(c) < firstUpper.get(c)) count++;
        return count;
    }
}
