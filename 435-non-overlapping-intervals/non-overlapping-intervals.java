class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        Arrays.sort(in,(a,b)->Integer.compare(a[0],b[0]));
        int res=0;
        int p=in[0][1];
        for(int i=1;i<in.length;i++){
            if(p>in[i][0]){
                res++;
                p=Math.min(p,in[i][1]);
            }else{
                p=in[i][1];
            }

            //System.out.println(res);
        }
        return res;
    }
}