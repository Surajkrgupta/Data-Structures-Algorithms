class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        if(n==0) return t.charAt(0);
        int[] ch=new int[26];
        for(int i=0;i<=n;i++){
            ch[t.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            ch[s.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]==1) return (char)(i+'a');
        }
        return ' ';


    }
}