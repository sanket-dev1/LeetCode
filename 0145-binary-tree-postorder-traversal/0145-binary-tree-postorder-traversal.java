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
    List<Integer> lst= new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        helpher(root);
        return lst;
    }
    void helpher(TreeNode node){
        if(node==null){
            return;
        }
        helpher(node.left);
        helpher(node.right);
        lst.add(node.val);
    }
}