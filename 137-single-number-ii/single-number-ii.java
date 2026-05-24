class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<32;i++){
            int temp=(1<<i);
            
            int one=0;
            for(int num:nums){
                if((num & temp)==0){}
                else one++;
            }
            if(one%3==1) res=(res|temp);

        }
        
        return res;
        
    }
}