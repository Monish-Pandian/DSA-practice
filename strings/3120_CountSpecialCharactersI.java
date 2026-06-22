import java.util.*;

/**
 * Problem: Count Special Characters I (#3120)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/count-the-number-of-special-characters-i/
 */
public class CountSpecialCharactersI {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower = new HashSet<>(), upper = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) lower.add(c);
            else upper.add(Character.toLowerCase(c));
        }
        int count = 0;
        for (char c : lower) if (upper.contains(c)) count++;
        return count;
    }
}
