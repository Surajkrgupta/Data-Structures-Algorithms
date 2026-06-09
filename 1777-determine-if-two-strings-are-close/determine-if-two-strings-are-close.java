class Solution {
    public boolean closeStrings(String w1, String w2) {
        int m=w1.length();
        int n=w2.length();
        if(n!=m) return false;
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(int i=0;i<n;i++){
            char ch1=w1.charAt(i);
            char ch2=w2.charAt(i);
            f1[ch1-'a']++;
            f2[ch2-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f1[i]!=0 && f2[i]!=0) continue;
            if(f1[i]==0 && f2[i]==0) continue;
            return false;
        }
        Arrays.sort(f1);
        Arrays.sort(f2);

        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]) return false;
        }
        return true;
        
        
        
    }
}