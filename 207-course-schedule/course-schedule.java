class Solution {
    public boolean canFinish(int numCourse, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourse; i++) {
            adj.add(new ArrayList<>());
        }
        int n = prerequisites.length;
        for (int i = 0; i < n; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] in = new int[numCourse];
        for (int i = 0; i < numCourse; i++) {
            for (int it : adj.get(i))
                in[it]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourse; i++) {
            if (in[i] == 0)
                q.add(i);
        }
        List<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {
            int node = q.remove();
            topo.add(node);
            for (int it : adj.get(node)) {
                in[it]--;
                if (in[it] == 0)
                    q.add(it);
            }
        }
        if (topo.size() == numCourse)
            return true;
        return false;

    }
}