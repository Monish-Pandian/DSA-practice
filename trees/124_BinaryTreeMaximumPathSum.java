/**
 * Problem: Binary Tree Maximum Path Sum (#124)
 * Difficulty: Hard
 * Pattern: DFS, Binary Tree
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int path=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gain(root);
        return path;
    }
    private int gain(TreeNode root){
        if(root==null) return 0;
        int leftgain=Math.max(0,gain(root.left));
        int rightgain=Math.max(0,gain(root.right));
        path=Math.max(path,leftgain+root.val+rightgain);
        return root.val+Math.max(leftgain,rightgain);

    }
}