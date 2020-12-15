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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(root==null){
            return arr.length == 0;
        }
        return isValid(root, arr, 0);
    }
    
    public boolean isValid(TreeNode root, int[] arr, int idx) {
        if(root == null) {
            return false;
        }
        
        if(idx>=arr.length || root.val != arr[idx]) {
            return false;
        }
        
        if(root.left == null && root.right == null){
            return idx==arr.length-1;
        }
    
        return isValid(root.left, arr, idx+1)||isValid(root.right, arr, idx+1);    
    }
}
