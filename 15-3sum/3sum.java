class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        Set<List<Integer>> set = new HashSet<>();

        while (i < n - 2) {
            int j = i + 1;
            int k = n - 1;
            int target = 0 - nums[i];
            while (j < k) {
                if ((nums[i] + nums[j] + nums[k]) == 0) {
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[j]);
                    t.add(nums[k]);
                    Collections.sort(t);
                    if (!set.contains(t)) {
                        res.add(t);
                        set.add(t);
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else if (nums[i] + nums[j] + nums[k] > 0)
                    k--;
            }
            i++;
        }
        return res;
    }
}