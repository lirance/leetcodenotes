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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        sumPath(root,0);
        return sum;
    }
    
    public void sumPath(TreeNode root, int pathSum){
        if (root == null) {
            return;
        }
        
        pathSum = pathSum*10 + root.val;
        
        if( root.left == null && root.right == null){
            sum += pathSum;
            return;
        }
        
        sumPath( root.left, pathSum);
        sumPath( root.right, pathSum);
        
        
    }
}
