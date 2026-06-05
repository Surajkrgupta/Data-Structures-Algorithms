class Solution {
    int m, n;
    Integer dp[][];

    public int fun(char[][] mat, int i, int j, int m, int n) {
        if (i >= m || j >= n || mat[i][j] == '0')
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        int r = fun(mat, i + 1, j, m, n);
        int d = fun(mat, i + 1, j + 1, m, n);
        int l = fun(mat, i, j + 1, m, n);

        return dp[i][j] = 1 + Math.min(r, Math.min(d, l));

    }

    public int maximalSquare(char[][] mat) {
        int res = 0;
        int m = mat.length;
        int n = mat[0].length;
        dp = new Integer[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res = Math.max(res,fun(mat, i, j, m, n));
            }
        }
        return res*res;

    }
}