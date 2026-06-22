/**
 * Problem: Reverse Words In String III (#557)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) sb.append(new StringBuilder(w).reverse()).append(" ");
        return sb.toString().trim();
    }
}
