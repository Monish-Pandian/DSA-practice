/*
* Problem: Lowest Common Ancestor of a Binary Tree (#236)
* Difficulty: Medium
* Pattern: DFS, Binary Tree
* Time Complexity: O(n)
* Space Complexity: O(h) 
* LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ 
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p||root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null &&right ==null)return null;
        if(left!=null &&right==null)return left;
        if(left==null && right!=null)return right;
        return root;
    }
}