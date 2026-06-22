import java.util.*;

/**
 * Problem: Average Of Levels In Binary Tree (#637)
 * Difficulty: Easy
 * Pattern: BFS
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            long sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                sum += n.val;
                if (n.left != null) q.offer(n.left);
                if (n.right != null) q.offer(n.right);
            }
            res.add((double) sum / size);
        }
        return res;
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}
