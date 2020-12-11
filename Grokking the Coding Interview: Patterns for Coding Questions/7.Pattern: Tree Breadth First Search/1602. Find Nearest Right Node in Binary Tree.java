/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            while (size > 0) {
                TreeNode node = q.poll();
                if (flag) {
                    return node;
                }
                if (node.val == u.val) {
                    flag = true;
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                size--;
            }
            flag = false;
        }

        return null;
    }
}
