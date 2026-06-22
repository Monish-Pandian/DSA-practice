import java.util.*;

/**
 * Problem: Add To Array Form Of Integer (#989)
 * Difficulty: Easy
 * Pattern: Math+Simulation
 * Time Complexity: O(max(n, log k))
 * Space Complexity: O(max(n, log k))
 * LeetCode: https://leetcode.com/problems/add-to-array-form-of-integer/
 */
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = num.length-1; i >= 0 || k > 0; i--) {
            k += (i >= 0 ? num[i] : 0);
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
