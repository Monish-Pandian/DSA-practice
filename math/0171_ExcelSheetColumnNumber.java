/**
 * Problem: Excel Sheet Column Number (#171)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/excel-sheet-column-number/
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
