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
    int c=0;
    int ans=0;
    public void halper(TreeNode root){
        if(root.left!=null) halper(root.left);
        c--;
        if(c==0) {
            ans=root.val;
            return;
        }
        if(root.right!=null) halper(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        c=k;
        halper(root);
        return ans;
    }
}