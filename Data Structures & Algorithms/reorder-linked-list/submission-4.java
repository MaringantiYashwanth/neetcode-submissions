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
        // we find the middle of the list
        if (head == null || head.next == null) {
            return ;
        }
        ListNode curr = head;
        int middle = 0;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        middle = length / 2;
        ListNode firstHalfEnd = head;
        int index = 0;

        while (index < middle) {
            firstHalfEnd = firstHalfEnd.next;
            index++;
        }

        // reversing the second half of list
        ListNode prev = null;
        
        ListNode second = firstHalfEnd.next;
        firstHalfEnd.next = null;
        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        // then merge the two halves

        curr = head;
        ListNode last = prev;
        ListNode first = curr;
        while (first != null && last != null) {
            ListNode firstNext = first.next;
            ListNode lastNext = last.next;
            first.next = last;
            if (firstNext == null) {
                break;
            }
            last.next = firstNext;
            first = firstNext;
            last = lastNext;
        }
    }
}
