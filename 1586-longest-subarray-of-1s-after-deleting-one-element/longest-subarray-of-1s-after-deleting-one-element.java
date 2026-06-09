class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int cz=0;
        int res=0;
        int l=0;
        int r=0;
        while(r<n){
            if(nums[r]==1){
                r++;
            }else{
                cz++;
                r++;
            }
            while(cz>1){
                if(nums[l]==0){ cz--;}
                l++;
            }
            res=Math.max(res,r-l-1);
            
        }
        return res;
    }
}