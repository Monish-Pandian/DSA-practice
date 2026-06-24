/**
 * Problem: Count Good Nodes in Binary Tree (#1448)
 * Difficulty: Med.
 * Pattern: DFS, Binary Tree
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * LeetCode: https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxSoFar) {
        if (root == null) {
            return 0;
        }

        int currentNodeCount = 0;

        if (root.val >= maxSoFar) {
            currentNodeCount = 1;
            maxSoFar = root.val;
        }

        int leftCount = dfs(root.left, maxSoFar);
        int rightCount = dfs(root.right, maxSoFar);

        return currentNodeCount + leftCount + rightCount;
    }
}