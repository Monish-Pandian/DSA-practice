import java.util.*;

/**
 * Problem: Combination Sum II (#40)
 * Difficulty: Med.
 * Pattern: Backtracking
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/combination-sum-ii/
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] c, int rem, int start, List<Integer> cur, List<List<Integer>> res) {
        if (rem == 0) { res.add(new ArrayList<>(cur)); return; }
        for (int i = start; i < c.length && c[i] <= rem; i++) {
            if (i > start && c[i] == c[i-1]) continue;
            cur.add(c[i]);
            backtrack(c, rem - c[i], i+1, cur, res);
            cur.remove(cur.size()-1);
        }
    }
}
