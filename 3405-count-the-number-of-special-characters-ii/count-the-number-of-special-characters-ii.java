class Solution {
    public int numberOfSpecialChars(String word) {
        if(word.length()<2) return 0;
        Map<Character,Integer>l=new HashMap<>();
        Map<Character,Integer>u=new HashMap<>();
        Set<Character>seen=new HashSet<>();
        int c=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                
                l.put(ch,i);

            }else if(Character.isUpperCase(ch) && !u.containsKey(ch)){
                u.put(ch,i);
                
            }
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch) && l.containsKey(Character.toLowerCase(ch)) && !seen.contains(ch)){
                int ui=i;
                int li=l.get(Character.toLowerCase(ch));
                seen.add(ch);
                if(li<ui) c++;
            }
        }
        return c;

    }
}