/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return recur(root,sum,0);
         
    }
    
    private boolean recur(TreeNode root, int sum, int cur){
        
        if(cur+root.val==sum && root.left==null && root.right == null){
            return true;
        }

        boolean left = false, right = false;
        
        if(root.left!=null){
            left = recur(root.left, sum ,cur+root.val);
        }
    
        if(root.right!=null){
            right = recur(root.right, sum, cur+root.val);
        }
        
        return left|right;
        
    }
}
