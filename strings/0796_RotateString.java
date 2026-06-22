/**
 * Problem: Rotate String (#796)
 * Difficulty: Easy
 * Pattern: Concatenation
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/rotate-string/
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
