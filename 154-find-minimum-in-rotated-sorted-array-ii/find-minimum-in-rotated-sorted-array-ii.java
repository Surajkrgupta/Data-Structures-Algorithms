class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            while(s<e && nums[s]==nums[s+1])s++;
            while(e>s && nums[e]==nums[e-1])e--;
            int m=(s+e)/2;
            if(nums[m]>nums[e])s=m+1;
            else e=m;
        }
        return nums[s];
    }
}