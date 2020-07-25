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
    List<List<Integer>> result = new ArrayList<>();
    
    
    public void DFS(TreeNode node,int l){
        if(result.size()==l){
            result.add(new ArrayList<Integer>());
        }
        result.get(l).add(node.val);
        
        if(node.left!=null){
            DFS(node.left,l+1);
        }
        if(node.right!=null){
            DFS(node.right,l+1);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return result;
        }
        DFS(root,0);
        Collections.reverse(result);
        return result;
        
        
    }
}
