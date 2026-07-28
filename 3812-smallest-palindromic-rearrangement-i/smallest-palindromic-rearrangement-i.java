class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int part=n/2;

        char[] ch=s.toCharArray();
        Arrays.sort(ch,0,part);

        for(int i=0;i<part;i++){
            ch[n-1-i]=ch[i];
        }
        return new String(ch);
    }
}