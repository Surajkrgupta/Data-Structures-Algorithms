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
    TreeNode help(int[] nums,int s,int e){
        if(s>e) return null;
        int m=(s+e)/2;

        TreeNode bst=new TreeNode(nums[m]);
        bst.left=help(nums,s,m-1);
        bst.right=help(nums,m+1,e);

        return bst;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
            return help(nums,0,nums.length-1);
    }
}