/**
 * Problem: Rotate List (#61)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/rotate-list/
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) { tail = tail.next; len++; }
        k %= len;
        if (k == 0) return head;
        tail.next = head; // make circular
        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) newTail = newTail.next;
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }

    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
