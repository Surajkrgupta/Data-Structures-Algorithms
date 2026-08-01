class Solution {
    public void sortColors(int[] nums) {
        int ones = 0;
        int zeros = 0;
        int n = nums.length;
        int twos = n - 1;
        while (ones <= twos) {
            int num = nums[ones];
            if (num == 2) {
                int t = nums[twos];
                nums[twos] = nums[ones];
                nums[ones] = t;
                twos--;
            } else if (num == 0) {
                int t = nums[zeros];
                nums[zeros] = nums[ones];
                nums[ones] = t;
                zeros++;
                ones++;
            } else
                ones++;
        }
    }
}