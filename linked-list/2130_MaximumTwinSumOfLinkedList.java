/**
 * Problem: Maximum Twin Sum Of A Linked List (#2130)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */
public class MaximumTwinSumOfLinkedList {
    public int pairSum(ListNode head) {
        // Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse second half
        ListNode prev = null, cur = slow;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        // Find max twin sum
        int max = 0;
        ListNode left = head, right = prev;
        while (right != null) {
            max = Math.max(max, left.val + right.val);
            left = left.next;
            right = right.next;
        }
        return max;
    }

    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
