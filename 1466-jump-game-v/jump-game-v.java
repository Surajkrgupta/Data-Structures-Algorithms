class Solution {
    int[] dp;
    public int solve(int[] arr, int s, int d, int n) {
        if(dp[s]!=-1) return dp[s];
        int best = 1;
        for (int i = s + 1; i <= Math.min(n - 1, s + d); i++) {
           
            if (arr[i] >= arr[s])
                break;
            best = Math.max(best, 1 + solve(arr, i, d, n));
        }
        for (int i = s - 1; i >= Math.max(0, s - d); i--) {
            
            if (arr[i] >= arr[s])
                break;
            best = Math.max(best, 1 + solve(arr, i, d, n));
        }
        return dp[s]=best;

    }

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=1;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, solve(arr, i, d, n));
        }
        return ans;
    }
}