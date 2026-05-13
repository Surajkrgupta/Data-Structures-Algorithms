class Solution {
    public int lengthOfLongestSubstring(String s) {
        int f = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        if (n == 1 || n == 0)
            return n;
        int m = 0;

        while (l < n) {
            if (!set.contains(s.charAt(l))) {
                set.add(s.charAt(l));
                l++;
                m = Math.max(m, l - f);
            } else {
                set.remove(s.charAt(f));
                f++;
            }
        }
        return m;
    }
}