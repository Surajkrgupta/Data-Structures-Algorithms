class Solution {
    public int minimumPushes(String word) {
        
        Set<Character>set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        int dc=set.size();

        if(dc<=8) return dc;
        int res=0;
        res+=8;
        dc-=8;
        if(dc<=8) return res+dc*2;
        res+=16;
        dc-=8;
        if(dc<=8) return res+dc*3;
        res+=24;
        dc-=8;
        return res+dc*4;
        
    }
}