class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String i: tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int f=st.pop();
                int s=st.pop();
                if(i.equals("+")){
                    st.push(f+s);
                }else if(i.equals("-")){
                    st.push(s-f);
                }else if(i.equals("*")){
                    st.push(f*s);
                }else {
                    st.push(s/f);
                }

            }else{
                int n=Integer.parseInt(i);
                st.push(n);
            }
        }
        return st.peek();
    }
}