class SmallestInfiniteSet {
    PriorityQueue<Integer>pq;
    Set<Integer>set;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        set=new HashSet<>();
        for(int i=1;i<=1000;i++){
            pq.offer(i);
            set.add(i);
        }
        
        
    }
    
    public int popSmallest() {
        int num=pq.poll();
        set.remove(num);
        return num;
        
    }
    
    public void addBack(int num) {
        if(set.contains(num)) return;
        pq.offer(num);
        set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */