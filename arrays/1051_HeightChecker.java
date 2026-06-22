import java.util.*;

/**
 * Problem: Height Checker (#1051)
 * Difficulty: Easy
 * Pattern: Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/height-checker/
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) if (heights[i] != expected[i]) count++;
        return count;
    }
}
