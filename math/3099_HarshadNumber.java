/**
 * Problem: Harshad Number (#3099)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/harshad-number/
 */
public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, tmp = x;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        return x % sum == 0 ? sum : -1;
    }
}
