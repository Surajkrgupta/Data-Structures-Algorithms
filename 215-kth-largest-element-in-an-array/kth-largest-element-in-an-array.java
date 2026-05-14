class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            max.add(i);
        }
        while(k>1){
            max.remove();
            k--;
        }
        return max.peek();

    }
}