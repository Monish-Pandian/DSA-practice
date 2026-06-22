/**
 * Problem: String To Integer - atoi (#8)
 * Difficulty: Med.
 * Pattern: Parsing
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/string-to-integer-atoi/
 */
public class StringToInteger {
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1;
        long res = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+'))
            sign = s.charAt(i++) == '-' ? -1 : 1;
        while (i < n && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i++) - '0');
            if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(res * sign);
    }
}
