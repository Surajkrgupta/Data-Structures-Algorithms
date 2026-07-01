class Solution {
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size();
        int[][] mat =new int[n][n];
        Queue<int[]>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                    q.add(new int[]{i,j});
                    mat[i][j]=0;
                }else{
                    mat[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int[] curr = q.poll();
                for(int[] d:dir){
                    int di=curr[0]+d[0];
                    int dj=curr[1]+d[1];
                    int val=mat[curr[0]][curr[1]];
                    if(isValidCell(mat,di,dj)&&mat[di][dj]==-1){
                        mat[di][dj]=val+1;
                        q.add(new int[]{di,dj});
                    }
                }

            }
        }

        int s=0;
        int e=n*2;
        int res=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidSafe(mat,mid)){
                res=mid;
                s=mid+1;
            }else e=mid-1;
        }
        return res;

    }
    boolean isValidSafe(int[][] grid,int mid){
        int n=grid.length;
        if(grid[0][0]<mid || grid[n-1][n-1]<mid) return false;

        Queue<int[]>tq=new LinkedList<>();
        tq.add(new int[]{0,0});
        boolean[][] vis=new boolean[n][n];
        vis[0][0]=true;

        while(!tq.isEmpty()){
            int[] curr=tq.poll();
            if(curr[0]==n-1 && curr[1]==n-1) return true;
            for(int[] d:dir){
                int di=curr[0]+d[0];
                int dj=curr[1]+d[1];
                if(isValidCell(grid,di,dj) && !vis[di][dj] && grid[di][dj]>=mid){
                    vis[di][dj]=true;
                    tq.add(new int[]{di,dj});
                }
            }
           
        }

         return false;
    }
    boolean isValidCell(int[][] mat,int i,int j){
        int n=mat.length;
        return i>=0 && j>=0 && i<n && j<n;
    }
}