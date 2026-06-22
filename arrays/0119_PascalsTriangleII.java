import java.util.*;

/**
 * Problem: Pascal's Triangle II (#119)
 * Difficulty: Easy
 * Pattern: DP
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i-1; j > 0; j--) row.set(j, row.get(j) + row.get(j-1));
            row.add(1);
        }
        return row;
    }
}
