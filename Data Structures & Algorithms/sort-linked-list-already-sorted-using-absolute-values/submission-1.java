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
    public ListNode sortLinkedList(ListNode head) {
        ListNode dummy = new ListNode(0), negative = null, tail = dummy;
        while (head != null) {
            ListNode following = head.next;
            if (head.val < 0) {
                head.next = negative;
                negative = head;
            } else {
                tail.next = head;
                tail = head;
                tail.next = null;
            }
            head = following;
        }
        if(negative == null) {
            return dummy.next;
        }
        ListNode curr = negative;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = dummy.next;
        return negative;
    }
}
