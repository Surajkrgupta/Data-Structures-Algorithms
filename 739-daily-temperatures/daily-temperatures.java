class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans=new int[t.length];
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int pi=st.pop();
                ans[pi]=i-pi;
            }
            st.push(i);
        }
        return ans;

    }
}