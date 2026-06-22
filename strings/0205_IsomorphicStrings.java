import java.util.*;

/**
 * Problem: Isomorphic Strings (#205)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> st = new HashMap<>(), ts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if ((st.containsKey(sc) && st.get(sc) != tc) ||
                (ts.containsKey(tc) && ts.get(tc) != sc)) return false;
            st.put(sc, tc); ts.put(tc, sc);
        }
        return true;
    }
}
