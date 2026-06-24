/**
 * Problem: Binary Tree Zigzag Level Order Traversal (#103)
 * Difficulty: Med.
 * Pattern: BFS, Binary Tree
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
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
import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size =q.size();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                ll.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
               
            }
            if(!leftToRight){
                    Collections.reverse(ll);
                }
            l.add(ll);
            leftToRight=!leftToRight;
        }
        return l;
    }
}