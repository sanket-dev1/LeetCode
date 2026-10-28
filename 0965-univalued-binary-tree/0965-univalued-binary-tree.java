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
    boolean val1=true;
    public boolean isUnivalTree(TreeNode root) {
        helpher(root);
        return val1;
    }
    void helpher(TreeNode root){
        if(root==null){
            return;
        }
        int v=root.val;
        if(root.left != null && v != root.left.val){
            val1=false;
        }
        if(root.right != null && v != root.right.val){
            val1=false;
        }
        helpher(root.left);
        helpher(root.right);
    }
}