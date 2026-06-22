/**
 * Problem: Subtree Of Another Tree (#572)
 * Difficulty: Easy
 * Pattern: DFS
 * Time Complexity: O(n*m)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/subtree-of-another-tree/
 */
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null || s.val != t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}
