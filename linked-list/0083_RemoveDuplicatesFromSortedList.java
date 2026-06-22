/**
 * Problem: Remove Duplicates From Sorted List (#83)
 * Difficulty: Easy
 * Pattern: Iteration
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
    }

    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
