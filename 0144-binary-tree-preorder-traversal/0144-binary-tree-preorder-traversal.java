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
    List<Integer> lst=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        helpher(root);
        return lst;
    }
    void helpher(TreeNode root){
        if(root==null){
            return;
        }
        lst.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}