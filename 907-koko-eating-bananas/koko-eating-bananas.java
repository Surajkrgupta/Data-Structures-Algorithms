class Solution {
    public boolean eatt(int[] piles,int m,int h){
        int res=0;
        for(int i:piles){
            res+=i/m;
            if(i%m!=0) res++;
        }
        return res<=h;
    }
    public int minEatingSpeed(int[] piles, int t) {
        int res=-1;
        int l=1;
        int h=0;
        for(int i:piles) h=Math.max(i,h);
        while(l<h){
            int m=(l+h)/2;
            if(eatt(piles,m,t)) h=m;
            else l=m+1;
        }
        return h;
    }
}