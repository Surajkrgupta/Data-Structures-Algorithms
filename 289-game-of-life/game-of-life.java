class Solution {
    public int solve(int i, int j, int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int c = 0;
        if (i + 1 < n && board[i + 1][j] == 1)
            c++;
        if (j + 1 < m && board[i][j + 1] == 1)
            c++;
        if (i - 1 >= 0 && board[i - 1][j] == 1)
            c++;
        if (j - 1 >= 0 && board[i][j - 1] == 1)
            c++;

        if (i + 1 < n && j + 1 < m && board[i + 1][j + 1] == 1)
            c++;
        if (i - 1 >= 0 && j + 1 < m && board[i - 1][j + 1] == 1)
            c++;
        if (i + 1 < n && j - 1 >= 0 && board[i + 1][j - 1] == 1)
            c++;
        if (i -1 >=0 && j - 1 >=0 && board[i - 1][j - 1] == 1)
            c++;
        return c;

    }

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] clone = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                clone[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int c = solve(i, j, clone);
                if (board[i][j] == 1) {
                    if (c == 2 || c == 3)
                        continue;
                    else
                        board[i][j] = 0;
                } else {
                    if (c == 3)
                        board[i][j] = 1;
                }
            }
        }

    }
}