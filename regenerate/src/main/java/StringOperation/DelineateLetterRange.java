package StringOperation;

import java.util.ArrayList;
import java.util.List;

public class DelineateLetterRange {
    /* Here is the explanation for the code above:
1. We need an array to store the last index of each char;
2. We need one variable to store the end index of the current sub string;
3. We need one variable to store the start index of the current sub string;
4. We need one arraylist to store the length of each partition.

The loop is to traverse the string and update the end index of the current partition. If i == end, then we get one partition. */
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); ++i) {
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}
