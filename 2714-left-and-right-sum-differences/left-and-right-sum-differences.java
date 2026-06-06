class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        ls[0]=0;
        rs[n-1]=0;
        //ls
        for(int i=1;i<n;i++){
            ls[i]=ls[i-1]+nums[i-1];
        }
        //rs
        for(int i=n-2;i>=0;i--){
            rs[i]=rs[i+1]+nums[i+1];
        }

        for(int i=0;i<n;i++){
            nums[i]=Math.abs(ls[i]-rs[i]);
        }
        return nums;
    }
}