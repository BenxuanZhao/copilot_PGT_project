package DictTree;

public class TrieNode {
    TrieNode[] children;
    String word;

    TrieNode() {
        children = new TrieNode[26];
    }
}
