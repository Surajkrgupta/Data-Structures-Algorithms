class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> t = new ArrayList<>();
        back(nums, t);
        return res;
    }

    public void back(int[] nums, List<Integer> t) {
        if (nums.length == t.size()) {
            res.add(new ArrayList<>(t));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                t.add(nums[i]);
                set.add(nums[i]);
                back(nums, t);
                t.remove(t.size() - 1);
                set.remove(nums[i]);
            }
        }
    }
}