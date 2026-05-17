class Solution {
    int n;
    public boolean dfs(int[] arr,int s){
        if(s<0 || s>=n || arr[s]<0) return false;
        if(arr[s]==0) return true;
        arr[s]*=-1;
        boolean l=dfs(arr,s-arr[s]);
        boolean r=dfs(arr,s+arr[s]);
        return l||r;
    }
    public boolean canReach(int[] arr, int start) {
        n=arr.length;
        return dfs(arr,start);
    }
}