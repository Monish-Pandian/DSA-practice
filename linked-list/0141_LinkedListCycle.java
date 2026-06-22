/**
 * Problem: Linked List Cycle (#141)
 * Difficulty: Easy
 * Pattern: FloydCycle
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
