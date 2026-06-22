/**
 * Problem: Same Tree (#100)
 * Difficulty: Easy
 * Pattern: DFS
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/same-tree/
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}
