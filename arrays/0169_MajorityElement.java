/**
 * Problem: Majority Element (#169)
 * Difficulty: Easy
 * Pattern: BoyerMooreVoting
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int n : nums) {
            if (count == 0) candidate = n;
            count += (n == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
