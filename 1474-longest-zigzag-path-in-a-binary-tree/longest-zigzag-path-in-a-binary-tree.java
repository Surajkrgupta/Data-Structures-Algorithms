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
    int res=0;
    private void dfs(TreeNode node,boolean l,int s){
        if(node==null) return;
        res=Math.max(res,s);
        if(l){
            dfs(node.left,false,s+1);
            dfs(node.right,true,1);
        }else{
            dfs(node.left,false,1);
            dfs(node.right,true,s+1);
        }
    }
    public int longestZigZag(TreeNode root) {
        dfs(root,true,0);
        return res;
    }
}