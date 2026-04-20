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
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }
    public boolean inorder(TreeNode curr){
        if(curr == null) return true;
        if(!inorder(curr.left)) return false;
        if(prev != null && prev.val >= curr.val) return false;
        prev = curr;
        return inorder(curr.right);
    }
}