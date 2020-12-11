/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null){
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        boolean flag = true;
        while (!q.isEmpty()) {
            int size = q.size();
                List<Integer> l = new LinkedList<>();
            while (size > 0) {
                TreeNode temp = q.poll();
                if(flag){//left to right;
                    l.add(temp.val);
                }else{
                    l.add(0,temp.val);
                }
                
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                size--;
            }
            flag = !flag;
            res.add(l);
        }
        return res;
        
        
    }
}
