class Solution {
    public void moveZeroes(int[] nums) {
        int nz=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int t=nums[nz];
                nums[nz]=nums[i];
                nums[i]=t;
                nz++;
            }
        }
    }
}