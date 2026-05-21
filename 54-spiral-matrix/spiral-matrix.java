class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res=new ArrayList<>();
        int n=mat.length;
        if(n==0) return res;
        int m=mat[0].length;
        int rb=0;
        int re=n-1;
        int cb=0;
        int ce=m-1;

        while(rb<=re && cb<=ce){
            for(int j=cb;j<=ce;j++){
                res.add(mat[rb][j]);
            }
            rb++;
            for(int j=rb;j<=re;j++){
                res.add(mat[j][ce]);
            }
            ce--;
            if(rb<=re){
                for(int j=ce;j>=cb;j--){
                    res.add(mat[re][j]);
                }
            }
            re--;
            if(cb<=ce){
                for(int j=re;j>=rb;j--){
                    res.add(mat[j][cb]);
                }
            }
            cb++;
        }
        return res;
    }
}