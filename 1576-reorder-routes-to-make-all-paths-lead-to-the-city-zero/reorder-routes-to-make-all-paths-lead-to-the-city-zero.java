class Solution {
    int dfs(List<List<Integer>> g,int[] vis,int s){
        int res=0;
        vis[s]=1;
        for(int to:g.get(s)){
            if(vis[Math.abs(to)]==0) res+=dfs(g,vis,Math.abs(to))+(to>0?1:0);
        }
        return res;
    }

    public int minReorder(int n, int[][] connections) {
        int[] vis=new int[n];
        Arrays.fill(vis,0);
        List<List<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++) g.add(new ArrayList<>());
        for(int[] i:connections){
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(-i[0]);
        }
        return dfs(g,vis,0);


        
    }
}