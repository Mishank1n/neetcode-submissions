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
    public int maxDepth(TreeNode root) {
        return recDepth(root);
    }
    
    public int recDepth(TreeNode cur){
        if (cur == null){
            return 0;
        }
        if (cur.right==null && cur.left==null){
            return 1;
        } else {
            return 1 + Math.max(recDepth(cur.right), recDepth(cur.left));
        }
    }
}
