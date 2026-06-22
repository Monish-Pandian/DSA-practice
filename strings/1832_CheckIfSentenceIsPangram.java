import java.util.*;

/**
 * Problem: Check If Sentence Is Pangram (#1832)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
public class CheckIfSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) set.add(c);
        return set.size() == 26;
    }
}
