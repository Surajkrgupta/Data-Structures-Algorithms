class Solution {
    public int findMinArrowShots(int[][] po) {
        Arrays.sort(po, (a, b) -> Integer.compare(a[1], b[1]));

        int n = po.length;
        int c = 0;
        int i = 0;
        int m = 0;
        while (i < n) {
            if (c==0 || po[i][0] > m) {
                c++;
                m = po[i][1];
            }
            i++;

        }
        return c;
    }
}