class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int pp=nums[0];
        int p=Math.max(nums[1],nums[0]);

        for(int i=2;i<n;i++){
            int c=Math.max(nums[i]+pp,p);
            pp=p;
            p=c;
        }
        return p;
    }
}