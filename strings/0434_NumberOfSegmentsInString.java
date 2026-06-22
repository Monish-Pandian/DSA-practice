/**
 * Problem: Number Of Segments In String (#434)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/number-of-segments-in-a-string/
 */
public class NumberOfSegmentsInString {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) count++;
        return count;
    }
}
