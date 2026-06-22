/**
 * Problem: Delete Columns To Make Sorted (#944)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int j = 0; j < strs[0].length(); j++)
            for (int i = 1; i < strs.length; i++)
                if (strs[i].charAt(j) < strs[i-1].charAt(j)) { count++; break; }
        return count;
    }
}
