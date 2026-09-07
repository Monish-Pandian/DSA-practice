/**
 * Problem: Nodes Between Critical Points (#2058)
 * Difficulty: Medium
 * Pattern: Linked List, Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = { -1, -1 };

        int minDistance = Integer.MAX_VALUE;

        ListNode previousNode = head;
        ListNode currentNode = head.next;
        int currentIndex = 1;
        int previousCriticalIndex = 0;
        int firstCriticalIndex = 0;

        while (currentNode.next != null) {
            if (
                (currentNode.val < previousNode.val &&
                    currentNode.val < currentNode.next.val) ||
                (currentNode.val > previousNode.val &&
                    currentNode.val > currentNode.next.val)
            ) {
                if (previousCriticalIndex == 0) {
                    previousCriticalIndex = currentIndex;
                    firstCriticalIndex = currentIndex;
                } else {
                    minDistance = Math.min(
                        minDistance,
                        currentIndex - previousCriticalIndex
                    );
                    previousCriticalIndex = currentIndex;
                }
            }

            currentIndex++;
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (minDistance != Integer.MAX_VALUE) {
            int maxDistance = previousCriticalIndex - firstCriticalIndex;
            result = new int[] { minDistance, maxDistance };
        }

        return result;
    }
}