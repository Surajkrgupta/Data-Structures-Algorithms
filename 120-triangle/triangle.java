class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> t=triangle;
        int n=triangle.size();
        for(int r=n-2;r>=0;r--){
            for(int c=0;c<=r;c++){
                t.get(r).set(c,t.get(r).get(c)+Math.min(t.get(r+1).get(c),t.get(r+1).get(c+1)));
            }
        }
        return t.get(0).get(0);

    }
}