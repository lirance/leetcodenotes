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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k<=1) {
            return head;
        }
        // reverse times
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        count = count/k;
        cur = head;
        ListNode pre = null;
        
        while(cur!=null&&count>0){
            ListNode lastTail = pre;
            ListNode curTail = cur;
            
            int idx = 0;
            // revers k node
            while(idx < k && cur != null){
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
                idx ++;
            }
                
            
            if(lastTail!=null){
                lastTail.next = pre;
            }else{
                   head = pre;
            }

            curTail.next = cur;
            pre = curTail;
            count --;
        }
        
        return head;
        
    }
     
}
