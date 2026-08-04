class Solution {
    public int[][] merge(int[][] inte) {
        Arrays.sort(inte,(a,b)->Integer.compare(a[0],b[0]));
        int n=inte.length;
        if(n==1) return inte;
        int s=inte[0][0];
        int e=inte[0][1];

        List<int[]>res=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(inte[i][0]<=e){
                e=Math.max(e,inte[i][1]);
            }else{
                res.add(new int[]{s,e});
                s=inte[i][0];
                e=inte[i][1];
            }
        }
        res.add(new int[]{s,e});
        return res.toArray(new int[0][]);
        
    }
}