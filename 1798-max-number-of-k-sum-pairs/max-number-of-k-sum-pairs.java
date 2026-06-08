class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        int res=0;
        Arrays.sort(nums);
        int l=0;
        int h=n-1;
        while(l<h){
            int s=nums[l]+nums[h];
            if(s==k){
                l++;
                h--;
                res++;                
            }
            else if(s<k)l++;
            else h--;
        }
        return res;
    }
}