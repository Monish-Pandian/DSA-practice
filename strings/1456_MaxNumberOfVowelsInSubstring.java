/**
 * Problem: Maximum Number Of Vowels In Substring Of Given Length (#1456)
 * Difficulty: Med.
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 */
public class MaxNumberOfVowelsInSubstring {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) count++;
            if (i >= k && vowels.indexOf(s.charAt(i-k)) >= 0) count--;
            max = Math.max(max, count);
        }
        return max;
    }
}
