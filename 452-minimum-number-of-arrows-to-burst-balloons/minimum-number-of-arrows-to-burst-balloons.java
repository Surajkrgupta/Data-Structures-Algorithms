class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int far=points[0][1];
        int res=1;
        for(int i=1;i<points.length;i++){
            if(far>=points[i][0]) far=Math.min(far,points[i][1]);
            else{
                res++;
                far=points[i][1];
            }
        }
        return res;
    }
}