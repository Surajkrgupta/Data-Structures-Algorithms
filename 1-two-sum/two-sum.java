class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int rest=target-num;
            if(map.containsKey(rest)){
                // Ans Exi
                return new int[] {map.get(rest),i};
            }else {
                map.put(num,i);
            }
        }
        return res;


    }
}