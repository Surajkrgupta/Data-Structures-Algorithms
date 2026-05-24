class Node {
    boolean end;
    Node[] child = new Node[26];
}

class WordDictionary {
    Node root;

    public WordDictionary() {
        this.root = new Node();
    }

    public void addWord(String word) {
        Node root = this.root;

        for (char letter : word.toCharArray()) {
            int idx = letter - 'a';

            if (root.child[idx] == null) {
                root.child[idx] = new Node();
            }

            root = root.child[idx];
        }

        root.end = true;
    }

    public boolean serchin(Node root, String word, int s, int e) {

        for (int i = s; i < e; i++) {

            char letter = word.charAt(i);

            if (letter == '.') {

                for (Node child : root.child) {

                    if (child != null &&
                        serchin(child, word, i + 1, e)) {
                        return true;
                    }
                }

                return false;
            }

            int idx = letter - 'a';

            if (root.child[idx] == null) {
                return false;
            }

            root = root.child[idx];
        }

        return root.end;
    }

    public boolean search(String word) {
        return serchin(this.root, word, 0, word.length());
    }
}