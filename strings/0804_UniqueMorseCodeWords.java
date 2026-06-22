import java.util.*;

/**
 * Problem: Unique Morse Code Words (#804)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n*m)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : w.toCharArray()) sb.append(morse[c-'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}
