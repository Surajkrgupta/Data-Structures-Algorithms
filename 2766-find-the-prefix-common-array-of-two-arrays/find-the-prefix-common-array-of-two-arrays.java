class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] f = new int[n + 1];
        int[] res = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            f[A[i]]++;
            if (f[A[i]] == 2)
                c++;
            f[B[i]]++;
            if (f[B[i]] == 2) {
                c++;

            }

            res[i] = c;
        }
        return res;
    }
}