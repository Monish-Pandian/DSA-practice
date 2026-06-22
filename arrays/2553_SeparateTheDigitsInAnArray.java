import java.util.*;

/**
 * Problem: Separate The Digits In An Array (#2553)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n*d)
 * Space Complexity: O(n*d)
 * LeetCode: https://leetcode.com/problems/separate-the-digits-in-an-array/
 */
public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            List<Integer> digits = new ArrayList<>();
            while (n > 0) { digits.add(0, n%10); n /= 10; }
            res.addAll(digits);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
