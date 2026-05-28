class Solution {
    class Project{
        int profit;
        int capital;
        Project(int p,int c){
            this.profit=p;
            this.capital=c;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Project[] arr=new Project[capital.length];
        for(int i=0;i<capital.length;i++){
            arr[i]=new Project(profits[i],capital[i]);
        }
        Arrays.sort(arr,new Comparator<Project>(){
            public int compare(Project p1,Project p2){
                return p1.capital-p2.capital;
            }
        });
        PriorityQueue<Project>pq=new PriorityQueue<>(new Comparator<Project>(){
            public int compare(Project p1,Project p2){
                return p2.profit-p1.profit;
            }
        });
        int i=0;
        while(k-->0){
            while(i<arr.length && arr[i].capital<=w){
                pq.add(arr[i]);
                i++;
            }
            if(pq.size()==0) break;
            w+=pq.poll().profit;
        }
        return w;
    }
}