class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> t = new ArrayList<>();

        back(1, n, k, t);
        return res;

    }

    public void back(int s, int n, int k, List<Integer> t) {
        if (k == 0) {
            res.add(new ArrayList<>(t));
            return;

        }
        for(int i=s;i<=n;i++){
            t.add(i);
            back(i+1,n,k-1,t);
            t.remove(t.size()-1);
            //back(i+1,n,k,t);
        }
    }
}