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
    private int SecondMin = -1;
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        SecondMinVal(root, min);
        return SecondMin;
    }
    private void SecondMinVal(TreeNode root, int curr){
        if(root == null) return;
        SecondMinVal(root.left, curr);
        SecondMinVal(root.right, curr);

        if(root.val >curr){
            if(SecondMin == -1){
                SecondMin = root.val;
            }
            else{
                SecondMin = Math.min(SecondMin, root.val); 
            }
        }
    }
}