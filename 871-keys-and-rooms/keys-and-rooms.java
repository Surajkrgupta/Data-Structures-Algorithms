class Solution {
    public void dfs(List<List<Integer>> rooms,int source,boolean[] vis){
        vis[source]=true;
        for(int i:rooms.get(source)){
            if(vis[i]==false) dfs(rooms,i,vis);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
        Arrays.fill(vis,false);
        dfs(rooms,0,vis);
        for(boolean i:vis){
            if(!i)return false;
        }
        return true;
    }
}