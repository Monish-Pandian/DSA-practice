/**
 * Problem: Insert into a Binary Search Tree (#701)
 * Difficulty: Medium
 * Pattern: Binary Search Tree, DFS
 * Time Complexity: O(h)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/insert-into-a-binary-search-tree/
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
             return new TreeNode(val);
            };
        if(root.val<=val) {
            root.right=insertIntoBST(root.right,val);}
        else{
            root.left= insertIntoBST(root.left,val);}
        return root;
    }
}