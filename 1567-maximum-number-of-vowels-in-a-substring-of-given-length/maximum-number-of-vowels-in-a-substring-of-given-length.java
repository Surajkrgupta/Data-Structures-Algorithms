class Solution {
    public int maxVowels(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int m = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            
            char c = ch[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count+=1;
            m = Math.max(m, count);
        }
        count=m;
        for (int i = k; i < n; i++) {
            
            char cl = ch[i - k];
            if (cl == 'a' || cl == 'e' || cl == 'i' || cl == 'o' || cl == 'u')
                count-=1;
            char c = ch[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count+=1;
            m=Math.max(count,m);
        }
        return m;

    }
}