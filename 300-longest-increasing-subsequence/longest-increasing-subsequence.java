class Solution {
    int[][] dp;
    public int rec(int idx,int P,int[] nums){
        if(idx==nums.length) return 0;
        if(dp[idx][P+1]!=-1) return dp[idx][P+1];
        int NT=rec(idx+1,P,nums);
        int T=0;
        if(P==-1 || nums[P]<nums[idx]){
            T=1+rec(idx+1,idx,nums);
        }
        return dp[idx][P+1]=Math.max(T,NT);
    }
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length+1][nums.length+1];
        for(int i=0;i<=nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(0,-1,nums);
    }
}