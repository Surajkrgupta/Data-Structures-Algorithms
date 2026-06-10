class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int as : asteroids) {
            boolean dis = false;
            while (!st.isEmpty() && st.peek() > 0 && as < 0) {
                if (Math.abs(st.peek()) == Math.abs(as)) {
                    st.pop();
                    dis = true;
                    break;
                } else if (Math.abs(st.peek()) < Math.abs(as))
                    st.pop();
                else{
                    dis = true;
                    break;
                }
                    
            }
            if (dis == false){
                st.push(as);
            }
                
        }
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;

    }
}