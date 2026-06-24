/**
 * Problem: Diameter of Binary Tree (#543)
 * Difficulty: Easy
 * Pattern: DFS, Binary Tree
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/
 */
class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {

        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(
            diameter,
            leftHeight + rightHeight
        );

        return 1 + Math.max(
            leftHeight,
            rightHeight
        );
    }
}