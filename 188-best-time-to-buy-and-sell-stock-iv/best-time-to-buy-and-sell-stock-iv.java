class Solution {
    Integer dp[][];

    public int fun(int[] prices,int i,int k,int K){
        if (i == prices.length || k == 2 * K) return 0;
        if(i==prices.length || k==2*K) return 0;
        if(dp[i][k]!=null) return dp[i][k];
        int ans=0;
        if(k%2==0){
            //buy or skip
            ans= Math.max(fun(prices, i+1, k+1, K)-prices[i],fun(prices, i+1, k, K));
        }else{
            ans= Math.max(fun(prices, i+1, k+1, K)+prices[i],fun(prices, i+1, k, K));
        }
        return  dp[i][k]=ans;
    }

    public int maxProfit(int k, int[] prices) {
        dp = new Integer[prices.length+1][2*k];
        return fun(prices, 0, 0, k);
    }
}