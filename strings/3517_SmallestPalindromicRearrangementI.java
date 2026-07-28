/**
 * Problem: Lexicographically Smallest Palindrome (#3786)
 * Difficulty: Medium
 * Pattern: String, Frequency Counting, Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/lexicographically-smallest-palindrome/
 */

class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }

            if (freq[i] % 2 == 1) {
                middle = (char) (i + 'a');
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();

      
        if (middle != 0) {
            left.append(middle);
        }

        left.append(right);

        return left.toString();
    }
}