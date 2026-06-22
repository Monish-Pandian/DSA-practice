/**
 * Problem: Find The Difference (#389)
 * Difficulty: Easy
 * Pattern: BitManipulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) res ^= c;
        for (char c : t.toCharArray()) res ^= c;
        return res;
    }
}
