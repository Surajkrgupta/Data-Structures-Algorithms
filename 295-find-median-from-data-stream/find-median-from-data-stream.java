class MedianFinder {
    PriorityQueue<Integer> mi;
    PriorityQueue<Integer> ma;
    boolean even=true;
    public MedianFinder() {
        mi=new PriorityQueue<>();
        ma=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(even){
            ma.offer(num);
            mi.offer(ma.poll());
        }else{
            mi.offer(num);
            ma.offer(mi.poll());
        }
        even=!even;
    }
    
    public double findMedian() {
        if(even==true){
            return (mi.peek()+ma.peek())/2.0;
        }else {
            return mi.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */