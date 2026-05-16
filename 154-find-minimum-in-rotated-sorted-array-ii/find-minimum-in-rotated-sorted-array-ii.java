class Solution {
    public int findMin(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i: nums){
            m=Math.min(m,i);
        }
        return m;
    }
}