package StringOperation;

public class ZTransfer {
    /* Here is the explanation for the code above:
1. We need to consider the special cases that numRows = 1 and numRows = 2.
2. We need to find the relationship between the index of the characters in the original string and the index of the characters in the ZigZag string.
3. For the first and the last row, the characters' indexes in the original string are arithmetic sequence with the common difference of 2 * (numRows - 1).
4. For the other rows, the characters' indexes in the original string are arithmetic sequence with the common difference of 2 * (numRows - 1 - i) and 2 * i, respectively.
5. We can find the corresponding characters in the original string according to the indexes in the ZigZag string and append them to the ZigZag string. */
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.length());
        int step = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {
            int interval = step - 2 * i;
            for (int j = i; j < s.length(); j += step) {
                sb.append(s.charAt(j));
                if (interval < step && interval > 0 && j + interval < s.length() && i != numRows - 1) {
                    sb.append(s.charAt(j + interval));
                }
            }
        }
        return sb.toString();
    }
}
