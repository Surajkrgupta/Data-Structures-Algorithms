class triple {
    int i;
    int j;int k;

    triple(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int tm = 0;
        Queue<triple>q=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==2){
                    q.add(new triple(i,j,0));
                    vis[i][j]=2;
                }else vis[i][j]=0;
            }
        }
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        while(!q.isEmpty()){
            triple d=q.poll();
            int r=d.i;
            int c=d.j;
            int t=d.k;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                tm=Math.max(t,tm);
            if(nr>=0 &&nc>=0 && nr<n &&nc<m&& grid[nr][nc]==1 && vis[nr][nc]==0){
                q.add(new triple(nr,nc,t+1));
                vis[nr][nc]=2;
            }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1) return -1;
            }
        }

        
        return tm;
    }
}