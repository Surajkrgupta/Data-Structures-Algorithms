class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int curr=0;
        int last=0;

        for(int i=0;i<nums.length-1;i++){
            last=Math.max(last,nums[i]+i);
            if(i==curr){
                curr=last;
                jump++;
            }
        }
        return jump;
    }
}