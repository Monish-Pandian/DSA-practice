/**
 * Problem: Invert Binary Tree (#226)
 * Difficulty: Easy
 * Pattern: DFS
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}
