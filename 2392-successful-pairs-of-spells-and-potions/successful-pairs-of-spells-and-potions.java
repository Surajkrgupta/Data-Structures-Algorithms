class Solution {
    public int solve(int spell,int[] potions, long success){
        int l=0;
        int h=potions.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if((long)spell*potions[m]>=success) h=m-1;
            else l=m+1;
        }
        return l;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int idx=solve(spells[i],potions,success);
            res[i]=potions.length-idx;
        }
        return res;        
    }
}