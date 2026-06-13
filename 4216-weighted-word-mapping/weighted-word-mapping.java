class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        int p=0;
        for(int i=0;i<words.length;i++){
            int s=0;
            int cp=0;
            String str=words[i];
            while(cp<str.length()){
                char ch=str.charAt(cp);
                s+=weights[ch-'a'];
                cp++;
            }
            s=s%26;
            sb.append((char)('z'- s));
        }
        return sb.toString();
    }
}