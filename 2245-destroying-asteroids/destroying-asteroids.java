class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long m=mass;
        for(int i=0;i<ast.length;i++){
            if(ast[i]>m) return false;
            else{
                m+=ast[i];
            }
        }
        return true;
    }
}