class Solution {
    public int fun(int num){
        String s=String.valueOf(num);
        int n=s.length();
        if(n<=2) return 0;
        int res=0;
        for(int i=1;i<=n-2;i++){
            char c=s.charAt(i);
            char l=s.charAt(i-1);
            char r=s.charAt(i+1);
            if((c>l && c>r) ||(c<l && c<r)) res++;

        }
        return res;
    }
    public int totalWaviness(int num1, int num2) {
        int s=0;
        for(int i=num1;i<=num2;i++){
            s+=fun(i);
        }
        return s;
    }
}