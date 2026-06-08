class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int l=0;int h=n-1;
        StringBuilder sb=new StringBuilder();
        while(l<=h){
            while(l<h && s.charAt(l)==' ')l++;
            while(h>l && s.charAt(h)==' ')h--;
            int e=h;
            while(h>=l && s.charAt(h)!=' ')h--;
            sb.append(s.substring(h+1,e+1));
            if(l<h) sb.append(' ');
            
        }
        return sb.toString();
    }
}