class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int col=1;
        int row=1;

        for(int i=0;i<m;i++){
            if(mat[0][i]==0)row=0;
        }
        for(int i=0;i<n;i++){
            if(mat[i][0]==0) col=0;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==0){
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][0]==0 || mat[0][j]==0) mat[i][j]=0;
            }
        }
        if(row==0){
            for(int i=0;i<m;i++) mat[0][i]=0;
        }
        if(col==0){
            for(int i=0;i<n;i++) mat[i][0]=0;
        }



    }
}