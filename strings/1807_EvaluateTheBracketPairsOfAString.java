/**
 * Problem: Evaluate the Bracket Pairs of a String (#1807)
 * Difficulty: Medium
 * Pattern: String, Hash Map
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
 */

import java.util.*;
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> knowledgeMap = new HashMap<>();

        for (List<String> pair : knowledge) {
            knowledgeMap.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                int start = i + 1;

                int end = start;
                while (s.charAt(end) != ')') {
                    end++;
                }

                String key = s.substring(start, end);

                String value = knowledgeMap.getOrDefault(key, "?");

                sb.append(value);

                i = end;
            } 
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
