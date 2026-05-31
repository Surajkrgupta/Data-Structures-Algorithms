class Solution {
    Boolean[] memo;
    Set<String>set;
    public boolean rec(int idx,String s,int n){
        if(idx==s.length()) return true;
        if(memo[idx]!=null) return memo[idx];
        for(int i=idx+1;i<=s.length();i++){
            String sb=s.substring(idx,i);
            if(set.contains(sb) && rec(i,s,n)) return memo[idx]=true;
        }
        return memo[idx]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        set=new HashSet<>(wordDict);
        memo=new Boolean[s.length()];
        int n=s.length();
        return rec(0,s,n);
    }
}