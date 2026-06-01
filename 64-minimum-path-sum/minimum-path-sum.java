class Solution {
    int[][] memo;
    public int rec(int[][] g,int i,int j,int n,int m){
        if(i>=n || j>=m) return Integer.MAX_VALUE;
        if(i==n-1 && j==m-1) return g[i][j];
        if(memo[i][j]!=-1) return memo[i][j];
        return memo[i][j]=g[i][j]+Math.min(rec(g,i+1,j,n,m),rec(g,i,j+1,n,m));
    }
    public int minPathSum(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        memo=new int[n][m];
        for(int[] i:memo) Arrays.fill(i,-1);
        return rec(g,0,0,n,m);
    }
}