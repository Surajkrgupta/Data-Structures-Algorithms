class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res=0;
        while(res<costs.length && coins>=costs[res]){
            coins-=costs[res];
            res+=1;
        }
        return res;
    }
}