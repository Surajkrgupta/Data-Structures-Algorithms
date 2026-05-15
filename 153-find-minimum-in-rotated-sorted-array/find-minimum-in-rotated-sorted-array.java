class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(nums[0]<nums[n-1]) return nums[0];
        int l=0;
        int h=n-1;
        while(l<h){
            int m=(l+h)/2;
            if(nums[m]>nums[h]) l=m+1;
            else h=m;
        }
        return nums[l];
    }
}