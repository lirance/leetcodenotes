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
    public boolean isCousins(TreeNode root, int x, int y) {
        Map<Integer,Integer> depth = new HashMap<>();
        Map<Integer,Integer> parent = new HashMap<>();
        
        depth.put(root.val,0);
        parent.put(root.val,0);
        dfs(root,0,depth,parent);
        
        return depth.get(x)==depth.get(y)&&parent.get(x)!=parent.get(y);
        
    }
    
    private void dfs(TreeNode root, int d, Map<Integer,Integer> depth,Map<Integer,Integer> parent){
        if(root==null){
            return;
        }
        
        if(root.left!=null){
            depth.put(root.left.val,d+1);
            parent.put(root.left.val,root.val);
            dfs(root.left,d+1,depth,parent);
        }
        
        if(root.right!=null){
            depth.put(root.right.val,d+1);
            parent.put(root.right.val,root.val);
            dfs(root.right,d+1,depth,parent);
        }
    }
}
