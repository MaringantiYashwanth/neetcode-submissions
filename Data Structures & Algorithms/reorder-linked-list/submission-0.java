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
    public void reorderList(ListNode head) {
        // Step 1: find the middle
        if (head == null || head.next == null) {
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: split and reverse the second half
        ListNode second = slow.next;
        slow.next = null;
        ListNode previous = null;
        // here we are swapping the nodes
        while (second != null) {
            ListNode after = second.next;
            second.next = previous;
            previous = second;
            second = after;
        }
        // Step 3: Merge both the halves
        ListNode first = head;
        second = previous;
        while (second != null) {
            ListNode firstAfter = first.next;
            ListNode secondAfter = second.next;

            first.next = second;
            second.next = firstAfter;
            
            first = firstAfter;
            second = secondAfter;
        }
    }
}
