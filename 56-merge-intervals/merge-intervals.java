class Solution {
    public int[][] merge(int[][] in) {
        List<int[]>res=new ArrayList<>();
        if(in.length==0||in==null) return new int[0][];
        Arrays.sort(in,(i1,i2)->Integer.compare(i1[0],i2[0]));
        int s=in[0][0];
        int e=in[0][1];
        for(int[] i:in){
            if(i[0]<=e){
                e=Math.max(e,i[1]);
            }else{
                res.add(new int[]{s,e});
                s=i[0];
                e=i[1];
            }
        }
        res.add(new int[]{s,e});
        return res.toArray(new int[0][]);
    }
}