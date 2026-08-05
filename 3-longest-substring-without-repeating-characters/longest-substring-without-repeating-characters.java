class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int ma=0;
        int n=s.length();
        if (n == 1 || n == 0)
            return n;
        int f=0;
        int l=0;
        while(l<n){
            if(set.contains(s.charAt(l))){
                set.remove(s.charAt(f));
                f++;
            }else{
                set.add(s.charAt(l));
                l++;
                ma=Math.max(ma,l-f);
            }
        }
        return ma;
    }
}