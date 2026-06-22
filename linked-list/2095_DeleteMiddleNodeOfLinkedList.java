/**
 * Problem: Delete The Middle Node Of A Linked List (#2095)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 */
public class DeleteMiddleNodeOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
