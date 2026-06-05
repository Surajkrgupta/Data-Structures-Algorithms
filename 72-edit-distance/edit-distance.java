class Solution {
    int[][] memo;
    int rec(String word1, String word2, int i, int j) {
        if (i == word1.length()) {
            return word2.length() - j;
        }
        if (j == word2.length()) {
            return word1.length() - i;
        }
        if(memo[i][j]!=-1) return memo[i][j];
        int ans = 0;
        if (word1.charAt(i) == word2.charAt(j))
            return rec(word1, word2, i + 1, j + 1);
        else {
            int ins = 1 + rec(word1, word2, i, j + 1);
            int del = 1 + rec(word1, word2, i + 1, j);
            int rep = 1 + rec(word1, word2, i + 1, j + 1);
            ans = Math.min(ins, Math.min(del, rep));
        }
        return memo[i][j]=ans;
    }

    public int minDistance(String word1, String word2) {
        memo=new int[word1.length()+1][word2.length()+1];
        for(int[] i:memo) Arrays.fill(i,-1);
        return rec(word1, word2, 0, 0);
    }
}