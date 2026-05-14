class Solution {
    public boolean isGood(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;
        if(n==1) return false;

        for(int i=0;i<n-1;i++){
            if(nums[i]!=i+1) return false;
        }

        return nums[n-1]==nums[n-2];
        
        // int c=0;
        // int n=nums.length;
        // int max=n-1;
        // int m=-1;


        // for(int i=0;i<n;i++){
        //     if(max==nums[i]) c++;
        //     m=Math.max(m,nums[i]);
        // }
        // if(m>n) return false;
        // return c==2;

    }
}