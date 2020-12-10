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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        
        ListNode pre = null;
        ListNode cur = head;
        
        int idx = 1;
        while( idx < m){
            pre = cur;
            cur = cur.next;
            idx ++ ;
        }
        
        ListNode preM = pre;
        ListNode first = cur;
        pre = null;
        // reverse
        while (idx <= n && cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
            idx ++ ;
        }
        
        if(preM!=null){
            preM.next = pre;
        }else{ // we are changing the head of the 
            head = pre;
        }
        
        first.next = cur;
        
        return head;
    }
}
