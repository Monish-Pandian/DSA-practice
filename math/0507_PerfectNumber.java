/**
 * Problem: Perfect Number (#507)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(sqrt n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/perfect-number/
 */
public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        return sum == num;
    }
}
