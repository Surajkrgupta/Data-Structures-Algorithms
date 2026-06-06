class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int len = f.length;
        for (int i = 0; i < len; i++) {
            if (f[i] == 0) {
                boolean l = (i == 0) || (f[i - 1] == 0);
                boolean r = (i == len - 1) || (f[i + 1] == 0);
                if (l && r){
                    n--;
                    f[i]=1;
                    }
                if (n <= 0)
                    return true;
            }
        }
        return n <= 0;
    }
}