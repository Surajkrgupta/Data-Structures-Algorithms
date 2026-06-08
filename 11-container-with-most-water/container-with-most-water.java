class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int res=0;
        int lm=height[0];
        int hm=height[n-1];
        int l=0;
        int h=n-1;
        while(l<h){
            lm=Math.max(lm,height[l]);
            hm=Math.max(hm,height[h]);
            int c=Math.min(lm,hm)*(h-l);
            res=Math.max(res,c);
            if(lm<hm)l++;
            else h--;
        }
        return res;
    }
}