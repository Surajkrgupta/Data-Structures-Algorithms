class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int l=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int cl=1;
                while(set.contains(i+cl)) cl++;
                l=Math.max(l,cl);
            }
        }
        return l;


    }
}