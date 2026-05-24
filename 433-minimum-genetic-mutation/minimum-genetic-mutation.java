class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end))
            return 0;

        Set<String> banks = new HashSet<>();
        for (String b : bank)
            banks.add(b);

        char[] charSet = new char[] { 'A', 'C', 'G', 'T' };

        int level = 0;
        Set<String> vis = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(start);
        vis.add(start);

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                String curr = q.poll();
                if (curr.equals(end))
                    return level;

                char[] currArray = curr.toCharArray();
                for (int i = 0; i < currArray.length; i++) {
                    char old = currArray[i];
                    for (char c : charSet) {
                        currArray[i] = c;
                        String next = new String(currArray);
                        if (!vis.contains(next) && banks.contains(next)) {
                            vis.add(next);
                            q.add(next);
                        }
                    }
                    currArray[i] = old;
                }
            }
            level++;
        }
        return -1;

    }
}