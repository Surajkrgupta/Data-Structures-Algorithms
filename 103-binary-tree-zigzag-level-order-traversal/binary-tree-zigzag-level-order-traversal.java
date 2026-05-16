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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        boolean ltr = false;

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> t=new ArrayList<>();

            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                t.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }
            if(ltr==false) ans.add(t);
            else{
                Collections.reverse(t);
                ans.add(t);
            }
            ltr=!ltr;

        }
        return ans;
    }
}