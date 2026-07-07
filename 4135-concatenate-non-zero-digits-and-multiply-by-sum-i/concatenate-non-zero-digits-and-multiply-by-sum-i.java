class Solution {
    public long sumAndMultiply(int n) {
        int nz=0;
        int sum=0;
        while(n>0){
            int ld=n%10;
            if(ld!=0){
                nz=(nz*10)+ld;
                sum+=ld;
            }
            n=n/10;
            
        }
        int num = nz;
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return (long)reversed*sum;
    }
}