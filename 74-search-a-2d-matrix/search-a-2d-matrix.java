class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0;
        int h = m * n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            int r = mid / m;
            int c = mid % m;

            if (mat[r][c] == t)
                return true;
            else if (t < mat[r][c])
                h=mid-1;
            else
                l=mid+1;
        }
        return false;
    }
}