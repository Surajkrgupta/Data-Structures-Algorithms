class Solution {
    public int[] findOrder(int numCourse, int[][] prerequisites) {
        List<List<Integer>> g = new ArrayList<>();
        int[] inDegree = new int[numCourse];

        for (int i = 0; i < numCourse; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prereq = edge[1];

            g.get(prereq).add(course);
            inDegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourse; i++) {
            if (inDegree[i] == 0)
                q.offer(i);
        }
        int[] order = new int[numCourse];
        int index = 0;

        while (!q.isEmpty()) {
            int c = q.poll();
            order[index++] = c;
            for (int neg : g.get(c)) {
                inDegree[neg]--;
                if (inDegree[neg] == 0)
                    q.offer(neg);
            }
        }
        return index == numCourse ? order : new int[0];
    }

}