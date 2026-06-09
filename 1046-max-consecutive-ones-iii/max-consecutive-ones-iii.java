class Solution {
    public int longestOnes(int[] nums, int k) {
        int c = 0;
        int m = 0;
        int n = nums.length;
        int left = -1;
        int right = 0;

        while (right < n) {
            if (nums[right] == 0) {
                c++;
                right++;
            } else {
                right++;
            }
            while (c > k) {
                left++;
                if (nums[left] == 0) {
                    c--;
                }
            }
            int res = right - left - 1;
            m = Math.max(m, res);
        }
        return m;
    }
}