class Solution {
    public int largestAltitude(int[] gain) {
        int m=0;
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        for(int i=0;i<arr.length;i++){
            m=Math.max(arr[i],m);
        }
        return m;
    }
}