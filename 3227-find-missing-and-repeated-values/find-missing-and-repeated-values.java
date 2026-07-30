class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res=new int[2];
        int n=grid.length;
        int[] map=new int[(n*n)+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[grid[i][j]]++;
            }
        }
        for(int i=1;i<=n*n;i++){
            if(map[i]==0)res[1]=i;
            else if(map[i]==2)res[0]=i;
        }
        return res;

    }
}