class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int tcost=0;
        for(int i=0;i<gas.length;i++){
            tgas+=gas[i];
            tcost+=cost[i];
        }
        if(tcost>tgas) return -1;

        int s=0;
        int cf=0;
        for(int i=0;i<gas.length;i++){
            cf+=gas[i]-cost[i];
            if(cf<0) {
                s=i+1;
                cf=0;
            }

        }
        return s;
    }
}