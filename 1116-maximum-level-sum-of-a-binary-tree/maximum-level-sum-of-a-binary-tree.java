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
    public int maxLevelSum(TreeNode root) {
        long ma=Long.MIN_VALUE;
        Queue<TreeNode>q=new LinkedList<>();
        int c=1;
        int mc=0;
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            long sum=0L;
            for(int i=0;i<n;i++){
                TreeNode r=q.remove();
                sum+=r.val;
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            if(sum>ma){
                mc=c;
                ma=sum;
                c++;
            }else{
                c++;
            }
        }
        return mc;
        
    }
}