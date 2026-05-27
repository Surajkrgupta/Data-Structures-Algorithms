class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int k=0;
        for(int i:nums1)arr[k++]=i;
        for(int i:nums2)arr[k++]=i;
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==1) return arr[n/2];
        else{
            int num=arr[n/2]+arr[n/2-1];
            return num/2.0;
        }
        //return 1.0d;

    }
}