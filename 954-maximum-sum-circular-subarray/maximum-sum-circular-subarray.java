class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cMax = 0;
        int cMin = 0;
        int maS = nums[0];
        int miS = nums[0];
        int t = 0;
        for (int i : nums) {
            cMax = Math.max(cMax, 0) + i;
            maS = Math.max(maS, cMax);

            cMin = Math.min(cMin, 0) + i;
            miS = Math.min(miS, cMin);
            t += i;
        }
        if (t == miS)
            return maS;
        return Math.max(maS, t - miS);
    }
}