class Node{
    Node[] child=new Node[26];
    boolean end;
}
class Trie {
    Node root;

    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        int n=word.length();
        Node t=root;
        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(t.child[idx]==null){
                t.child[idx]=new Node();
            }
            t=t.child[idx];
            
        }
        t.end=true;
    }
    
    public boolean search(String word) {
        int n=word.length();
        Node t=root;
        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(t.child[idx]==null) return false;
            t=t.child[idx];
        }
        return t.end;
    }
    
    public boolean startsWith(String prefix) {
        int n=prefix.length();
        Node t=root;
        for(int i=0;i<n;i++){
            int idx=prefix.charAt(i)-'a';
            if(t.child[idx]==null) return false;
            t=t.child[idx];
        }
        return  true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */