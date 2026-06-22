import java.util.*;

/**
 * Problem: String Matching In Array (#1408)
 * Difficulty: Easy
 * Pattern: BruteForce
 * Time Complexity: O(n²*m)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/string-matching-in-an-array/
 */
public class StringMatchingInArray {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (i != j && words[j].contains(words[i])) { res.add(words[i]); break; }
        return res;
    }
}
