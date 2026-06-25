import java.util.*;

/**
 * Problem: Create Binary Tree From Descriptions (#2196)
 * Difficulty: Med.
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/create-binary-tree-from-descriptions/
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

public class CreateBinaryTreeFromDescriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        for (int[] d : descriptions) {
            map.putIfAbsent(d[0], new TreeNode(d[0]));
            map.putIfAbsent(d[1], new TreeNode(d[1]));
            if (d[2] == 1) map.get(d[0]).left = map.get(d[1]);
            else map.get(d[0]).right = map.get(d[1]);
            children.add(d[1]);
        }
        for (int key : map.keySet())
            if (!children.contains(key)) return map.get(key);
        return null;
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}
