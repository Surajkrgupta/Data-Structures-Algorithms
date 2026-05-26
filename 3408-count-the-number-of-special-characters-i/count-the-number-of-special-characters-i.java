class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        Set<Character>l=new HashSet<>();
        Set<Character>u=new HashSet<>();
        int c=0;
        if(n<=1) return 0;
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                l.add(ch);
            }else{
                u.add(Character.toLowerCase(ch));
            }
        } 
        for(Character ch:l){
            if(u.contains(ch))c++;
        }
        return c;      
    }
}