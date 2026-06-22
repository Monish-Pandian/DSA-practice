/**
 * Problem: Longest Uncommon Subsequence I (#521)
 * Difficulty: Easy
 * Pattern: BrainTeaser
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-uncommon-subsequence-i/
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
