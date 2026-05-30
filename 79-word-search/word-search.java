class Solution {
    public boolean dfs(char[][] board, char[] ch, int idx, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || board[i][j] == '*' || board[i][j] != ch[idx])
            return false;
        if (idx == ch.length - 1)
            return true;
        char c = board[i][j];
        board[i][j] = '*';
        boolean res = dfs(board, ch, idx + 1, i + 1, j, n, m) || dfs(board, ch, idx + 1, i - 1, j, n, m)
                || dfs(board, ch, idx + 1, i, j + 1, n, m) || dfs(board, ch, idx + 1, i, j - 1, n, m);
        board[i][j] = c;
        return res;

    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        char[] ch = word.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == ch[0] && dfs(board, ch, 0, i, j, n, m)) {
                    return true;
                }
            }
        }
        return false;

    }
}