class Solution {
    public String gcdOfStrings(String s, String t) {
        if(!(s+t).equals(t+s)) return "";
        int l=gcd(s.length(),t.length());
        return s.substring(0,l);
  
    }
    public int gcd(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}