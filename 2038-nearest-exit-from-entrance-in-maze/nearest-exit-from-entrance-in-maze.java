class Pair {
    int i, j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int res = 0;
        int n = maze.length;
        int m = maze[0].length;
        int[][] vis = new int[n][m];
        for (int[] i : vis)
            Arrays.fill(i, 0);
        Queue<Pair> q = new LinkedList<>();
        vis[entrance[0]][entrance[1]] = 1;
        q.add(new Pair(entrance[0], entrance[1]));
        while (!q.isEmpty()) {
            int N = q.size();
            while (N-- != 0) {
                Pair ent = q.poll();
                int r = ent.i;
                int c = ent.j;
                if ((r != entrance[0] || c != entrance[1]) &&
                        (r == 0 || r == n - 1 || c == m - 1 || c == 0))
                    return res;
                int[] dr = { -1, 0, 1, 0 };
                int[] dc = { 0, 1, 0, -1 };
                for (int i = 0; i < 4; i++) {

                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 0 && maze[nr][nc] == '.') {
                        q.add(new Pair(nr, nc));
                        vis[nr][nc] = 1;

                    }
                }
            }
            res++;
        }

        return -1;
    }
}