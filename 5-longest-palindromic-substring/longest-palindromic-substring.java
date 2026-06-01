class Solution {
    public boolean solve(String s,int i,int n){
        if(i>=n) return true;
        if(s.charAt(i)!=s.charAt(n)) return false;
        return solve(s,i+1,n-1);
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int m=Integer.MIN_VALUE;
        int sp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)){
                    int len=j-i+1;
                    if(len>m){
                        m=len;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+m);
    }
}