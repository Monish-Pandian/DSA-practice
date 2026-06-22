/**
 * Problem: Process String With Special Operations I (#3612)
 * Difficulty: Med.
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/process-string-with-special-operations-i/
 */
public class ProcessStringWithSpecialOperationsI {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') { if (sb.length() > 0) sb.deleteCharAt(sb.length()-1); }
            else if (c == '#') { String t = sb.toString(); sb.append(t); }
            else if (c == '%') sb.reverse();
            else sb.append(c);
        }
        return sb.toString();
    }
}
