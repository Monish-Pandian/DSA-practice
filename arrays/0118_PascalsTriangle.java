import java.util.*;

/**
 * Problem: Pascal's Triangle (#118)
 * Difficulty: Easy
 * Pattern: DP
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 * LeetCode: https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++)
                row.add(j == 0 || j == i ? 1 : res.get(i-1).get(j-1) + res.get(i-1).get(j));
            res.add(row);
        }
        return res;
    }
}
