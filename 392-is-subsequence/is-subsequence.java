class Solution {
    public boolean isSubsequence(String s, String t) {
        int p=0;
        int m=s.length();
        if(m==0) return true;
        int n=t.length();
        if(n==0) return false;
        for(int i=0;i<n;i++){
            char chs=s.charAt(p);
            char cht=t.charAt(i);
            if(chs==cht) p++;
            if(p==m) return true;
            
        }
        return p==m;
    }
}