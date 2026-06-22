import java.util.*;

/**
 * Problem: Positions Of Large Groups (#830)
 * Difficulty: Easy
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/positions-of-large-groups/
 */
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            if (j - i >= 3) res.add(Arrays.asList(i, j-1));
            i = j;
        }
        return res;
    }
}
