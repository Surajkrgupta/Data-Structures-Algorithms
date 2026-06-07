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
    public TreeNode createBinaryTree(int[][] desc) {
        Set<Integer> s = new HashSet<>();
        Map<Integer, TreeNode> m = new HashMap<>();
        int n = desc.length;
        for (int i = 0; i < n; i++) {
            int p = desc[i][0];
            int c = desc[i][1];
            int isl = desc[i][2];
            if (!m.containsKey(p)) {
                TreeNode pn = new TreeNode(p);
                m.put(p, pn);
            }
            if (!m.containsKey(c)) {
                TreeNode cn = new TreeNode(c);
                m.put(c, cn);
            }
            TreeNode tp = m.get(p);
            TreeNode tc = m.get(c);
            
            if (isl == 1) {
                tp.left=tc;
            } else {
                tp.right=tc;
            }
            s.add(c);
        }
        for(int i=0;i<n;i++){
            int p=desc[i][0];
            if(!s.contains(p)){
                return m.get(p);
            }
        }
        return null;
    }
}