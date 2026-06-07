class Solution {
    Integer[] memo;
    public int rec(int[] cost,int i,int n){
        if(i>=n) return 0;
        if(memo[i]!=null) return memo[i];
        int a=cost[i]+rec(cost,i+1,n);
        int b=cost[i]+rec(cost,i+2,n);
        return memo[i]=Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        memo=new Integer[cost.length+1];
        return Math.min(rec(cost,0,cost.length),rec(cost,1,cost.length));
    }
}