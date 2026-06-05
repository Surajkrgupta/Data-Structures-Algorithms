class Solution {
    Integer[][][] memo;
    public int rec(int[] prices, int i, boolean bos, int k) {
        if (k == 0 || i == prices.length)
            return 0;
     int state = bos ? 1 : 0;

        if(memo[i][state][k]!=null) return memo[i][state][k];
        int x = 0;
        if (bos) {
            // buy or not Choice
            int b = rec(prices, i + 1, false, k) - prices[i];
            int nb = rec(prices, i + 1, true, k);
            x=Math.max(b,nb);

        } else {
            // sell or not Choice
            int s=rec(prices, i+1, true, k-1)+prices[i];
            int ns=rec(prices,i+1,false,k);
            x=Math.max(s,ns);
        }
        return memo[i][state][k]=x;
    }

    public int maxProfit(int[] prices) {
        memo=new Integer[prices.length][2][3];
        return rec(prices, 0, true, 2);
    }
}