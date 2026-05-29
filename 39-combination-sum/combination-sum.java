class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> t = new ArrayList<>();
        back(candidates, target, 0, t,0);
        return res;
    }

    public void back(int[] cand, int target, int sum, List<Integer> t,int start) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            res.add(new ArrayList(t));
            return;
        }
        for (int i = start; i < cand.length; i++) {
            t.add(cand[i]);
            back(cand, target, sum + cand[i], t,i);
            t.remove(t.size() - 1);
        }

    }
}