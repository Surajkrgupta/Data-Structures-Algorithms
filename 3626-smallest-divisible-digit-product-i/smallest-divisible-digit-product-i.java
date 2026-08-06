class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++){
            int pro=1;
            int temp=i;
            while(temp>0){
                int ld=temp%10;
                temp=temp/10;
                pro=pro*ld;

            }
            if(pro%t==0) return i;
        }
    }
}