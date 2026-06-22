/**
 * Problem: Max Consecutive Ones (#485)
 * Difficulty: Easy
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int n : nums) { cur = n == 1 ? cur+1 : 0; max = Math.max(max, cur); }
        return max;
    }
}
