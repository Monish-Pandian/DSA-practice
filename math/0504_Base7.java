/**
 * Problem: Base7 (#504)
 * Difficulty: Easy
 * Pattern: Conversion
 * Time Complexity: O(log n)
 * Space Complexity: O(log n)
 * LeetCode: https://leetcode.com/problems/base7/
 */
public class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (negative) sb.append('-');
        return sb.reverse().toString();
    }
}
