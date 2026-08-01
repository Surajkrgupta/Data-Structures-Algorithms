class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ma=0;
        int l=0;
        int r=n-1;
        while(l<r){
            int water=Math.min(height[l],height[r])*(r-l);
            ma=Math.max(ma,water);
            //System.out.println(water +" "+ma);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return ma;
    }
}