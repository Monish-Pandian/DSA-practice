/**
 * Problem: Detect Capital (#520)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/detect-capital/
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        boolean allUpper = Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1));
        boolean allLower = Character.isLowerCase(word.charAt(1));
        for (int i = 2; i < word.length(); i++) {
            if (allUpper && !Character.isUpperCase(word.charAt(i))) return false;
            if (allLower && !Character.isLowerCase(word.charAt(i))) return false;
        }
        return allUpper || allLower;
    }
}
