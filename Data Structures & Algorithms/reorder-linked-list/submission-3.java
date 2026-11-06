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
        ListNode middleNode = head;
        int index = 0;

        while (middleNode != null && index < middle) {
            middleNode = middleNode.next;
            index++;
        }

        // reversing the second half of list
        ListNode prev = null;
        
        ListNode next = middleNode.next;
        ListNode mid = middleNode;
        while (mid != null) {
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        // then merge the two halves

        curr = head;
        ListNode last = prev;
        ListNode first = curr;
        while (last != null) {
            ListNode firstNext = first.next;
            ListNode lastNext = last.next;
            first.next = last;
            last.next = firstNext;
            firstNext.next = lastNext;
            first = firstNext;
            last = lastNext;
        }
    }
}
