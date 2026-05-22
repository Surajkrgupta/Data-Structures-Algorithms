class Solution {
    public int[][] insert(int[][] in, int[] newin) {
        int n=in.length;
        int i=0;
        List<int[]> res=new ArrayList<>();
        while(i<n && in[i][1]<newin[0]){
            res.add(in[i++]);
        }
        while(i<n && in[i][0]<=newin[1]){
            newin[0]=Math.min(newin[0],in[i][0]);
            newin[1]=Math.max(newin[1],in[i][1]);
            i++;
        }
        res.add(newin);
        while(i<n)res.add(in[i++]);

        return res.toArray(new int[res.size()][]);
        
    }
}