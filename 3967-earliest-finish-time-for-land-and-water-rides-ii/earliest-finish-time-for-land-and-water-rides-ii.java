class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;

        int land=Integer.MAX_VALUE;
        int water=Integer.MAX_VALUE;
        int lw=Integer.MAX_VALUE;
        int wl=Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            land=Math.min(land,landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<m;i++){
            water=Math.min(water,waterStartTime[i]+waterDuration[i]);
        }
        for(int i=0;i<n;i++){
            wl=Math.min(wl,Math.max(water,landStartTime[i])+landDuration[i]);
        }
        for(int i=0;i<m;i++){
            lw=Math.min(lw,Math.max(land,waterStartTime[i])+waterDuration[i]);
        }
        return Math.min(lw,wl);
        
    }
}