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
    int total=0;
    public void find(TreeNode root,Long cs,int tg,HashMap<Long,Integer> map){
        if(root==null) return;
        cs+=root.val;
        if(map.containsKey(cs-tg)){
            total+=map.get(cs-tg);
        }
        map.put(cs,map.getOrDefault(cs,0)+1);
        find(root.left,cs,tg,map);
        find(root.right,cs,tg,map);
        map.put(cs,map.get(cs)-1);
        return;
        
    }
    public int pathSum(TreeNode root, int tg) {
        if(root==null) return 0;
        HashMap<Long,Integer>map=new HashMap<>();
        map.put(0L,1);
        find(root,0L,tg,map);
        return total;
    }
}