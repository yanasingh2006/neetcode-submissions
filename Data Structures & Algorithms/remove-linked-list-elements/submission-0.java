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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> ls = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            if(cur.val != val){
                ls.add(cur.val);
            }
            cur = cur.next;
        }
        if(ls.isEmpty()){
            return null;
        }
        ListNode res = new ListNode(ls.get(0));
        cur = res;
        for(int i = 1; i < ls.size(); i++){
            ListNode newnode = new ListNode(ls.get(i));
            cur.next = newnode;
            cur = newnode;
        }
        return res;
    }
}