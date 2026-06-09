class Solution {
    public int equalPairs(int[][] g) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        int n = g.length;
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str.append(g[i][j]).append(".");
            }
            String k = str.toString();
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str.append(g[j][i]).append(".");
            }
            String k = str.toString();
            res += map.getOrDefault(k, 0);
        }
        return res;
    }
}