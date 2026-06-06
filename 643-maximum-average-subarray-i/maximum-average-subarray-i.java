class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double m = 0;
        for (int i = 0; i < k; i++)
            m += nums[i];
        double mm = m;
        mm = Math.max(m, mm);
        for (int i = k; i < nums.length; i++) {
            m -= nums[i - k];
            m += nums[i];
            mm = Math.max(m, mm);
        }
        return mm / k;
    }
}