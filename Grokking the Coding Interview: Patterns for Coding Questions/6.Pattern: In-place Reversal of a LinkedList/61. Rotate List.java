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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur = head;
        if(head==null||k==0){
            return head;
        }
        
        int count = 1;
        while(cur.next!=null){
            count++;
            cur=cur.next;
        }
        ListNode tail = cur;
        tail.next = head;
        
        k=k%count;
        
        cur = head;
        ListNode pre = tail;
        
        while(k<count){
            cur = cur.next;
            pre = pre.next;
            k++;
        }
        
        pre.next = null;
        return cur;
        
        
    }
}
