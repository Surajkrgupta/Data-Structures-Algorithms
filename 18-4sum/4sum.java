class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        Set<ArrayList<Integer>> s = new HashSet<>();

        int n = nums.length;
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n) {
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        if (!s.contains(t)) {
                            res.add(t);
                            s.add(t);
                        }
                        k++;
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
                j++;

            }
            i++;
        }
        return res;

    }
}