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
     * @param {ListNode} list1
     * @param {ListNode} list2
     * @return {ListNode}
     */
    mergeTwoLists(list1, list2) {
        let arr = [];
    let cur = list1;
    while (cur !== null) {
      arr.push(cur.val);
      cur = cur.next;
    }
    cur = list2;
    while (cur !== null) {
      arr.push(cur.val);
      cur = cur.next;
    }
    arr.sort((a, b) => a - b);
    if (arr.length === 0) {
      return null;
    }
    let head = new ListNode(arr[0]);
    let current = head;
    for (let i = 1; i < arr.length; i++) {
      current.next = new ListNode(arr[i]);
      current = current.next;
    }
    return head;
    }
}
