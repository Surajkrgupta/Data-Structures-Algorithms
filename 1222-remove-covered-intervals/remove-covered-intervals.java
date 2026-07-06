class Solution {
    public int removeCoveredIntervals(int[][] in) {

        Arrays.sort(in, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); // First column ascending
            }
            return Integer.compare(b[1], a[1]); // Second column descending
        });
        int si = in[0][0];
        int ei = in[0][1];
        if (in.length == 1)
            return 1;
        int c = 0;
        for (int i = 1; i < in.length; i++) {
            int nsi = in[i][0];
            int nei = in[i][1];
            if (si <= nsi && nei <= ei) {
                c++;
            } else {
                si = nsi;
                ei = nei;
            }
        }
        return in.length - c;

    }
}