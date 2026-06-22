/**
 * Problem: Excel Sheet Column Title (#168)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(log n)
 * Space Complexity: O(log n)
 * LeetCode: https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
