class Solution {
    public int countKthRoots(int l, int r, int k) {
        return count(r, k) - count(l - 1, k);
    }

    private int count(int n, int k) {
        if (n < 0)
            return 0;
        int l = 0;
        int h = n;
        int ans = 0;
        while (l <= h) {
            int m = l + (h-l) / 2;
            if (power(m, k, n)) {
                ans = m;
                l = m + 1;
            } else
                h = m - 1;
        }
        return ans+1;
    }

    boolean power(long base, int k, int limit) {
        long res = 1;
        for (int i = 0; i < k; i++) {
            res *= base;
            if (res > limit)
                return false;
        }
        return true;
    }
}