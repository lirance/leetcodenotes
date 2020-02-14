/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode root: lists){
            while(root!=null){
                pq.add(root.val);
                root = root.next;
            }
        }
        
        if(pq.isEmpty()){
            return null;
        }
        ListNode root = new ListNode(pq.poll());
        ListNode cur = root;
        while(!pq.isEmpty()){
            ListNode temp = new ListNode(pq.poll());
            temp.next = null;
            cur.next = temp;
            cur = temp;
        }
        return root;
    }
}
