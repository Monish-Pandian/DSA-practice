/**
 * Problem: Range Addition II (#598)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/range-addition-ii/
 */
public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        return minRow * minCol;
    }
}
