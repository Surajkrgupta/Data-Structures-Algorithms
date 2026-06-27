class Solution {
    public int maximumLength(int[] nums) {
        int res=1;
        int ones=0;
        Map<Long,Integer>map= new HashMap<>();
        for(int i:nums){
            if(i==1) ones++;
            map.put((long)i,map.getOrDefault((long)i,0)+1);
        }
        if(ones%2==0) ones--;
        res=Math.max(res,ones);

        for(long x:map.keySet()){
            if(x==1L) continue;
            long curr=x;
            int len=0;
            while(map.getOrDefault(curr,0)>=2){
                len+=2;
                if (curr > 1_000_000_000L) break;
                curr*=curr;
                
            }
            if(map.getOrDefault(curr,0)==0) len--;
            else len++;
            res = Math.max(res, len);
        }
        return res;
    }
}