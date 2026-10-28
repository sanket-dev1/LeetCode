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
    int val=Integer.MAX_VALUE;
    int pre=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helpher(root);
        return val;
    }
    void helpher(TreeNode root){
        if(root==null){
            return;
        }
        helpher(root.left);
        val=Math.min(val,Math.abs(pre-root.val));
        pre=root.val;
        helpher(root.right);
    }
}