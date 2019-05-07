/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// public class Solution {
//     public List < Double > averageOfLevels(TreeNode root) {
//         List < Integer > count = new ArrayList < > ();
//         List < Double > res = new ArrayList < > ();
//         average(root, 0, res, count);
//         for (int i = 0; i < res.size(); i++)
//             res.set(i, res.get(i) / count.get(i));
//         return res;
//     }
//     public void average(TreeNode t, int i, List < Double > sum, List < Integer > count) {
//         if (t == null)
//             return;
//         if (i < sum.size()) {
//             sum.set(i, sum.get(i) + t.val);
//             count.set(i, count.get(i) + 1);
//         } else {
//             sum.add(1.0 * t.val);
//             count.add(1);
//         }
//         average(t.left, i + 1, sum, count);
//         average(t.right, i + 1, sum, count);
//     }
// }

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> result = new ArrayList<>();
        Queue<TreeLayer> q = new LinkedList<>();
        
        q.offer(new TreeLayer(root,0));
        int curLayer = 0;
        int curCount = 0;
        double cursum = 0;
        result.add(1.0*root.val);
        while(!q.isEmpty()){
            TreeLayer n = q.poll();
            int layer = n.layer;
            if(layer!=curLayer){
               // System.out.println(cursum);
                result.add(cursum/curCount);
                curLayer++;
                curCount = 0;
                cursum = 0;
            }
            if(n.node.left!=null){
                cursum+=n.node.left.val;
                curCount++;
                q.offer(new TreeLayer(n.node.left,layer+1));
            }
            if(n.node.right!=null){
                cursum+=n.node.right.val;
                curCount++;
                q.offer(new TreeLayer(n.node.right,layer+1));
            }
        }
        
        return result;
        
        
        
    }
}
class TreeLayer{
    TreeNode node;
    int layer;
    TreeLayer(TreeNode root, int layer){
        this.node = root;
        this.layer = layer;
    }
}
