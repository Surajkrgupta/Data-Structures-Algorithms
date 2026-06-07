class Solution {
    public int tribonacci(int n) {
        int z=0;
        int o=1;
        int t=1;
        if(n==0) return 0;
        if(n<=t) return 1;
        for(int i=3;i<=n;i++){
            int sum=z+o+t;
            z=o;
            o=t;
            t=sum;
        }
        return t;
        
    }
}