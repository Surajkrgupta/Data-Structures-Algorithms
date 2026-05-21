class Solution {
    public boolean isHappy(int n) {
        int s=n;
        int f=n;

        do{
            s=s(s);
            f=s(s(f));
        }while(s!=f);
        return s==1;
    }
    int s(int n){
        int ans=0;
        while(n>0){
            int r=n%10;
            ans+=r*r;
            n/=10;
        }
        return ans;
    }
}