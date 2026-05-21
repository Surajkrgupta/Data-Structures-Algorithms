class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int tar = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int ntar = tar - nums[i];
            int li = i + 1;
            int ri = n - 1;
            while (li < ri) {
                if (nums[li] + nums[ri] < ntar)
                    li++;
                else if (nums[li] + nums[ri] > ntar)
                    ri--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[li], nums[ri]));
                    li++;
                    ri--;
                    while(li<ri && nums[li]==nums[li-1]) li++;
                    while(li<ri && nums[ri]==nums[ri]+1) ri--;

                }

            }
        }
        return ans;

    }
}