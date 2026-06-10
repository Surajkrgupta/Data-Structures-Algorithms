class Solution {
    public String predictPartyVictory(String sen) {
        Queue<Integer>r=new LinkedList<>();
        int n=sen.length();
        Queue<Integer>d=new LinkedList<>();
        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i)=='R')r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int ri=r.remove();
            int di=d.remove();
            if(ri<di) r.add(ri+n);
            else d.add(di+n);
        }
        if(r.isEmpty()){
            return "Dire";
        }else{
            return "Radiant";
        }
        
    }
}