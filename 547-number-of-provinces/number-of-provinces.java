class Solution {
    public void dfs(int[][] isConnected, int i,boolean[] vis) {
        vis[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && vis[j]==false) {
                dfs(isConnected, j, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int res = 0;
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                res++;
                dfs(isConnected, i, vis);
            }
        }
        return res;
    }
}