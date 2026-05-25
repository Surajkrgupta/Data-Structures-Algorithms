class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n<m) return "";
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int req=map.size();
        int form=0;

        int start=0;
        int left=0;
        int len=Integer.MAX_VALUE;
        HashMap<Character,Integer>wmap=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            wmap.put(ch,wmap.getOrDefault(ch,0)+1);
            if(map.containsKey(ch) && map.get(ch).intValue()==wmap.get(ch).intValue()){
                form++;
            }
            while(left<=right && form==req){
                if(right-left+1<len){
                    len=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                wmap.put(remove,wmap.get(remove)-1);
                if(map.containsKey(remove) && wmap.get(remove)<map.get(remove)) form--;
                left++;
            }


        }




        return len==Integer.MAX_VALUE ? "":s.substring(start,start+len);
    }
}