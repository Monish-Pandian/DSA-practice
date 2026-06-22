/**
 * Problem: Count Binary Substrings (#696)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/count-binary-substrings/
 */
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int prev = 0, cur = 1, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) cur++;
            else { prev = cur; cur = 1; }
            if (prev >= cur) res++;
        }
        return res;
    }
}
