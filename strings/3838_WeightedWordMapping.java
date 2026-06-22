/**
 * Problem: Weighted Word Mapping (#3838)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/weighted-word-mapping/
 */
public class WeightedWordMapping {
    public int minOperations(String word1, String word2) {
        int[] count = new int[26];
        for (char c : word1.toCharArray()) count[c-'a']++;
        for (char c : word2.toCharArray()) count[c-'a']--;
        int ops = 0;
        for (int c : count) ops += Math.abs(c);
        return ops / 2;
    }
}
