class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int h = s.length() - 1;
        char[] chr = s.toCharArray();
        while (l < h) {
            char cl = chr[l];
            char ch = chr[h];
            if (cl != 'a' && cl != 'A' && cl != 'e' && cl != 'E' && cl != 'i' && cl != 'I' && cl != 'o' && cl != 'O'
                    && cl != 'u' && cl != 'U')
                l++;
            else if (ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o'
                    && ch != 'O' && ch != 'u' && ch != 'U')
                h--;
            else {
                char t = chr[l];
                chr[l] = chr[h];
                chr[h] = t;
                l++;
                h--;
            }
        }
        return new String(chr);
    }
}