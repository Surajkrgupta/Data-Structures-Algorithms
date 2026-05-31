class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0;
        int F=0;
        int res=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            F+=i*nums[i];
        }
        res=F;
        for(int i=0;i<n;i++){
            int newF=F+sum-n*nums[n-i-1];
            res=Math.max(newF,res);
            F=newF;
        }
        return res;
    }
}