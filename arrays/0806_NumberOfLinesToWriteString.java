/**
 * Problem: Number Of Lines To Write String (#806)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/number-of-lines-to-write-string/
 */
public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1, width = 0;
        for (char c : s.toCharArray()) {
            int w = widths[c-'a'];
            if (width + w > 100) { lines++; width = 0; }
            width += w;
        }
        return new int[]{lines, width};
    }
}
