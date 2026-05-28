class Node{
    Node[] child=new Node[26];
    int ml=Integer.MAX_VALUE;
    int idx=Integer.MAX_VALUE;

    Node(){
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }
}
class Trie{
    Node root=new Node();
    void insert(String s,int i){
        int n=s.length();
        Node node=root;
        if(n<node.ml){
            node.ml=n;
            node.idx=i;
        }
        for(char ch:s.toCharArray()){
            int c=ch-'a';
            if(node.child[c]==null){
                node.child[c]=new Node();
            }
            node =node.child[c];
            if(n<node.ml){
                node.ml=n;
                node.idx=i;
            }
        }
    }

    int query(String s){
        Node node=root;
        for(char ch:s.toCharArray()){
            int c=ch-'a';
            if(node.child[c]!=null){
                node=node.child[c];
            }else break;

        }
        return node.idx;
    }
}
class Solution {
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        Trie t=new Trie();
        for(int i=0;i<wordsContainer.length;i++){
            String rev=new StringBuilder(wordsContainer[i]).reverse().toString();
            t.insert(rev,i);
        }
        int[] res=new int[wordsQuery.length];
        for(int i=0;i<wordsQuery.length;i++){
            String q=wordsQuery[i];
            String r=new StringBuilder(q).reverse().toString();
            res[i]=t.query(r);
        }
        return res;
    }
}