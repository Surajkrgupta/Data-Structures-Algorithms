class Solution {
    List<List<Integer>> res;

    public void rec(int[] nums, int idx, List<Integer> t) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(t));
            return;
        }

        t.add(nums[idx]);
        rec(nums, idx + 1, t);
        t.remove(t.size() - 1);
        rec(nums, idx + 1, t);

    }

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        rec(nums, 0, t);
        return res;
    }
}