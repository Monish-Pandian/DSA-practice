import java.util.*;

/**
 * Problem: Shortest Distance To A Character (#821)
 * Difficulty: Easy
 * Pattern: TwoPass
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        Arrays.fill(res, n);
        int pos = -n;
        for (int i = 0; i < n; i++) { if (s.charAt(i) == c) pos = i; res[i] = i - pos; }
        pos = 2*n;
        for (int i = n-1; i >= 0; i--) { if (s.charAt(i) == c) pos = i; res[i] = Math.min(res[i], pos - i); }
        return res;
    }
}
