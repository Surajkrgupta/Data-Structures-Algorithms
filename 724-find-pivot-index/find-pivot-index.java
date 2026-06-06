class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int ls=0;
        for(int i:nums)sum+=i;
        for(int i=0;i<n;i++){
            int rs=sum-ls-nums[i];
            if(ls==rs) return i;
            ls+=nums[i];
        }
        return -1;
    }
}