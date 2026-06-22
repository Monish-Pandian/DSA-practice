/**
 * Problem: Find Index Of First Occurrence In A String (#28)
 * Difficulty: Easy
 * Pattern: SlidingWindow
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindIndexFirstOccurrence {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++)
            if (haystack.startsWith(needle, i)) return i;
        return -1;
    }
}
