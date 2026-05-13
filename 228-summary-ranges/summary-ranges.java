class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int s=nums[i];
            while(i<n-1 && nums[i+1]-nums[i]==1){
                i++;
            }
            if(s!=nums[i]){
                // this is range
                res.add(s+"->"+nums[i]);
            }else{
                // this is single 
                res.add(String.valueOf(s));
            }
        }
        return res;
    }
}