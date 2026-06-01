class Solution {
    int c=0;
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0,n);
        return c;        
    }
    private void nqueen(char[][] board,int r,int n){
        if(r==n){
            c++;
            return;
        }
        for(int c=0;c<n;c++){
            if(isSafe(board,r,c,n)){
                board[r][c]='Q';
                nqueen(board,r+1,n);
                board[r][c]='.';
            }
        }
    }
    private boolean isSafe(char[][] board,int r,int c,int n){
        int i,j;
        for(i=0;i<n;i++){
            if(board[i][c]=='Q') return false;
        }
        i=r;
        j=c;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        i=r;
        j=c;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
}