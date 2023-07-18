package DictTree;

import java.util.List;

public class ReplaceWord {
    /* Here is the explanation for the code above:
1. The first for loop is to build a Trie Tree. (I'm not gonna explain the Trie Tree here since it's not the point for this question)
2. The second for loop is to find the shortest root for each word.
3. The time complexity depends on the length of the sentence O(n) and the number of roots we have O(m), which is O(n*m).
4. The space complexity is the size of the Trie Tree which is O(26*n) = O(n). */
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode trie = new TrieNode();
        for (String root: dict) {
            TrieNode cur = trie;
            for (char letter: root.toCharArray()) {
                if (cur.children[letter - 'a'] == null) {
                    cur.children[letter - 'a'] = new TrieNode();
                }
                cur = cur.children[letter - 'a'];
            }
            cur.word = root;
        }

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split("\\s+")) {
            if (ans.length() > 0) {
                ans.append(" ");
            }

            TrieNode cur = trie;
            for (char letter: word.toCharArray()) {
                if (cur.children[letter - 'a'] == null || cur.word != null) {
                    break;
                }
                cur = cur.children[letter - 'a'];
            }
            ans.append(cur.word != null ? cur.word : word);
        }
        return ans.toString();
    }
}
