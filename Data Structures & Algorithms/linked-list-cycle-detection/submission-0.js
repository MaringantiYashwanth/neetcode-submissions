/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {boolean}
     */
    hasCycle(head) {
        let map = new Map();
        let current = head;
        while (current != null) {
            map.set(current.val, (map.get(current.val) || 0) + 1);
            if (map.get(current.val) > 1) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
