/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int depth = 1;
        return dfs(root, depth);
        
    }
    
    private int dfs(Node root, int depth){
        //List<Node> chil = root.children;
        if(root.children==null){
            return depth;
        }else{
            int res = depth;
            for(Node node:root.children){
                res = Math.max(dfs(node,depth+1),res);
            }
            return res;
        }
    }
}
