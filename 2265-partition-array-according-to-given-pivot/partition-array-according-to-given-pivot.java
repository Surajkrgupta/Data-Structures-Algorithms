class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res=new int[nums.length];
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot) res[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot) res[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot) res[k++]=nums[i];
        }
        return res;
    }
}