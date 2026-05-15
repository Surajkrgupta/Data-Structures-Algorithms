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
    public int lefth(TreeNode root){
        int c=0;
        while(root.left!=null){
            c++;
            root=root.left;
        }
        return c;
    }

    public int righth(TreeNode root){
        int c=0;
        while(root.right!=null){
            c++;
            root=root.right;
        }
        return c;
    }


    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lh=lefth(root);
        int rh=righth(root);
        if(lh==rh) return (1<<(lh+1))-1;
        return 1+countNodes(root.left)+countNodes(root.right);


    }
}