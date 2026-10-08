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
    public int kthSmallest(TreeNode root, int k) {
        find(root);
        return lst.get(k-1);
    }
    void find(TreeNode node){
        if(node==null){
            return;
        }
        find(node.left);
        lst.add(node.val);
        find(node.right);
    }
}