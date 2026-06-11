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
    public int goodNodes(TreeNode root,int val){
        if(root==null) return 0;
        if(root.val>=val) return 1+goodNodes(root.left,Math.max(val,root.val))+goodNodes(root.right,Math.max(val,root.val));
        return goodNodes(root.left,Math.max(val,root.val))+goodNodes(root.right,Math.max(val,root.val));
        
        
    }
    int c=1;
    public int goodNodes(TreeNode root) {
        return 1+goodNodes(root.left,root.val)+goodNodes(root.right,root.val);
    }
}