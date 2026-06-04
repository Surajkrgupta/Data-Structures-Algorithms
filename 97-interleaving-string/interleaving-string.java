class Solution {
    int n, m, N;
    Boolean[][] memo;

    public boolean solve(String s1, String s2, String s3, int i, int j, int k) {
        if (i == n && j == m && k == N)
            return true;
        if(memo[i][j]!=null) return memo[i][j];
        boolean res = false;
        if (i < n && s1.charAt(i) == s3.charAt(k))
            res |= solve(s1, s2, s3, i + 1, j, k + 1);
        if (j < m && s2.charAt(j) == s3.charAt(k))
            res |= solve(s1, s2, s3, i, j + 1, k + 1);
        return memo[i][j]=res;

    }

    public boolean isInterleave(String s1, String s2, String s3) {
        n = s1.length();
        m = s2.length();
        N = s3.length();
        memo = new Boolean[n + 1][m + 1];
        if (n + m != N)
            return false;
        return solve(s1, s2, s3, 0, 0, 0);
    }
}