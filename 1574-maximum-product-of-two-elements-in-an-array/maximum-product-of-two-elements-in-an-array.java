class Solution {
    public int maxProduct(int[] nums) {
        int ma1=Integer.MIN_VALUE;
        int ma2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=ma1){
                ma2=ma1;
                ma1=nums[i];
            }else if(nums[i]>ma2) ma2=nums[i];
        }
        return ((ma1-1)*(ma2-1));
    }
}