class Solution {
    List<String> res = new ArrayList<>();

    public void back(int o, int c, int n, StringBuilder sb) {
        if (o == n && c == n) {
            res.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append("(");
            back(o + 1, c, n, sb);
            sb.deleteCharAt(sb.length()-1);

        }
        if(c<o){
            sb.append(")");
            back(o , c+1, n, sb);
            sb.deleteCharAt(sb.length()-1);

        }
    }

    public List<String> generateParenthesis(int n) {

        back(0, 0, n, new StringBuilder());

        return res;

    }
}