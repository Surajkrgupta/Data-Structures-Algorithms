class Solution {
    public int maxSubArray(int[] nums) {
        int ma = Integer.MIN_VALUE;
        int add = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            add += nums[i];
            ma = Math.max(ma, add);
            if (add < 0) add = 0;

        }
        return ma;

    }
}