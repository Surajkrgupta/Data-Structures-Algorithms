class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int c = 0;
        int sum=0;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i--){
            c++;
            if(c%3==0) continue;
            sum+=cost[i];
        }
        return sum;


    }
}