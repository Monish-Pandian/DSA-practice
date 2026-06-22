import java.util.*;

/**
 * Problem: Relative Ranks (#506)
 * Difficulty: Easy
 * Pattern: Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/relative-ranks/
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> score[b] - score[a]);
        String[] res = new String[n];
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0; i < n; i++) res[idx[i]] = i < 3 ? medals[i] : String.valueOf(i+1);
        return res;
    }
}
