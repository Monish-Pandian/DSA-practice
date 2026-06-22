/**
 * Problem: Shuffle The Array (#1470)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for (int i = 0; i < n; i++) { res[2*i] = nums[i]; res[2*i+1] = nums[n+i]; }
        return res;
    }
}
