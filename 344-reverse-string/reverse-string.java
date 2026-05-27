class Solution {
    public void rev(char[] s,int i,int j){
        if(i>=j) return;
        char c=s[i];
        s[i]=s[j];
        s[j]=c;
        rev(s,++i,--j);

    }
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
}