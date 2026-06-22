import java.util.*;

/**
 * Problem: Buddy Strings (#859)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/buddy-strings/
 */
public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            Set<Character> seen = new HashSet<>();
            for (char c : s.toCharArray()) seen.add(c);
            return seen.size() < s.length();
        }
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) != goal.charAt(i)) diff.add(i);
        return diff.size() == 2
            && s.charAt(diff.get(0)) == goal.charAt(diff.get(1))
            && s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
    }
}
