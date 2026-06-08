class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1)
            return 1;
        int i=0;
        int p=0;
        while (i<n) {
            char ch = chars[i];
            int c = 0;
            while (i < n && ch == chars[i]) {
                c++;
                i++;
            }
            chars[p++]=ch;
            if(c>1){
                String s=new String(Integer.toString(c));
                for(int j=0;j<s.length();j++) chars[p++]=s.charAt(j);
            }
            
        }
        return p;
    }
}