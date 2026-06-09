class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int ma=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for(int i:nums){
            ma=Math.max(i,ma);
            mi=Math.min(i,mi);            
        }
        long res=ma-mi;
        return res*k;
    }
}