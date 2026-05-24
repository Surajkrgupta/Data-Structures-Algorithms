class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int l=1;
        int h=x;
        int res=1;
        while(l<=h){
            int m=l+(h-l)/2;
            long sq=(long)m*m;
            if(sq==x) return m;
            else if(sq<x) {
                res=m;
                l=m+1;

            }else h=m-1;
            
        }
        return res;

    }
}