class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> originalCount=new HashMap<>();
        for(int i=0;i<words.length;i++){
            originalCount.put(words[i],originalCount.getOrDefault(words[i],0)+1);
        }
        int n=s.length();
        int wordCount=words.length;
        int wordSize=words[0].length();
        int windowSize=wordSize*n;
        List<Integer> ans=new ArrayList<>();

        for(int offset=0;offset<wordSize;offset++){
            HashMap<String,Integer>current=new HashMap<>();
            int start=offset;
            int count=0;
            for(int end=offset;end+wordSize<=n;end+=wordSize){
                String currWord=s.substring(end,end+wordSize);
                if(originalCount.containsKey(currWord)){
                    current.put(currWord,current.getOrDefault(currWord,0)+1);
                    count++;
                    while(current.get(currWord)>originalCount.get(currWord)){
                        String startWord =s.substring(start,start+wordSize);
                        current.put(startWord,current.get(startWord)-1);
                        start+=wordSize;
                        count--;
                    }
                    if(count==wordCount) ans.add(start);
                }
                else{
                    count=0;
                    start=end+wordSize;
                    current.clear();
                }

            }
        }
        return ans;

        
    }
}