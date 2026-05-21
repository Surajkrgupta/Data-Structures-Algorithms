class TrieNode{
    TrieNode[] child=new TrieNode[10];
}
class Trie{
    TrieNode root=new TrieNode();

    void insert(int n){
        TrieNode node=root;
        String s=Integer.toString(n);
        for(char d:s.toCharArray()){
            int i=d-'0';
            if(node.child[i]==null){
                node.child[i]=new TrieNode();
            }
            node =node.child[i];
        }
    }
    int find(int n){
        TrieNode node = root;
        String s=Integer.toString(n);
        int l=0;

        for(char d:s.toCharArray()){
            int i=d-'0';
            if(node.child[i]!=null){
                l++;
                node=node.child[i];
            }else{
                break;
            }
        }
        return l;
    }
}
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie t=new Trie();

        for(int i:arr1){
            t.insert(i);
        }
        int l=0;

        for(int i:arr2){
            int len=t.find(i);
            l=Math.max(l,len);
        }
        return l;
        
    }
}