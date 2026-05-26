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
    public int maxPathSum(TreeNode root) {
        int[] maxval=new int[1];
        maxval[0]=Integer.MIN_VALUE;
        func(root,maxval);
        return maxval[0];
    }
    public int func(TreeNode root,int[] maxval){
        if(root==null) return 0;
        int l=Math.max(0,func(root.left,maxval));
        int r=Math.max(0,func(root.right,maxval));
        maxval[0]=Math.max(maxval[0],l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}