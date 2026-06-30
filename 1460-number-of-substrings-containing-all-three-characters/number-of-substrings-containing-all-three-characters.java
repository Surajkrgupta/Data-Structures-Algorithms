class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int[] f=new int[3];
        int res=0;
        while(r<n){
            char ch=s.charAt(r);
            f[ch-'a']++;
            while(f[0]>0 && f[1]>0 && f[2]>0){
                res+=(n-r);
                char lch=s.charAt(l);
                f[lch-'a']--;
                l++;

            }
            r++;

        }
        return res;
    }
}