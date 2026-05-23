class Solution {

    public void dfs(char[][] b, int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m || b[i][j] != 'O')
            return;

        b[i][j] = '#';

        dfs(b, i + 1, j, n, m);
        dfs(b, i - 1, j, n, m);
        dfs(b, i, j + 1, n, m);
        dfs(b, i, j - 1, n, m);
    }

    public void solve(char[][] board) {

        int n = board.length;

        if (n == 0)
            return;

        int m = board[0].length;

        // First column and last column
        for (int i = 0; i < n; i++) {

            if (board[i][0] == 'O')
                dfs(board, i, 0, n, m);

            if (board[i][m - 1] == 'O')
                dfs(board, i, m - 1, n, m);
        }

        // First row and last row
        for (int j = 0; j < m; j++) {

            if (board[0][j] == 'O')
                dfs(board, 0, j, n, m);

            if (board[n - 1][j] == 'O')
                dfs(board, n - 1, j, n, m);
        }

        // Convert remaining O -> X
        // Convert # -> O
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }
}