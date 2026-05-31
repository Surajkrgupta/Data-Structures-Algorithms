class Solution {
    int[] memo;
    public int rec(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return Integer.MAX_VALUE;
        if(memo[amount]!=-1) return memo[amount];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = rec(coins, amount - coins[i]);
            if (res != Integer.MAX_VALUE)
                min = Math.min(min, res + 1);
        }
        return memo[amount]=min;
    }

    public int coinChange(int[] coins, int amount) {
        memo=new int[amount+1];
        Arrays.fill(memo,-1);
        int ans = rec(coins, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}