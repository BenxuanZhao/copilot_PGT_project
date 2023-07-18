package StringOperation;

import java.util.ArrayList;
import java.util.List;

public class ZTransfer {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int len = s.length();
        int col = 0;
        int n = 0;
        List<StringBuffer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            StringBuffer temp = new StringBuffer();
            list.add(temp);
        }
        while (n < len) {
            int y = col % (numRows - 1);
            if (y == 0) {
                for (int i = 0; i < numRows && n < len; i++) {
                    list.get(i).append(s.charAt(n));
                    n++;
                }
            } else {
                list.get(numRows - 1 - y).append(s.charAt(n));
                n++;
            }
            col++;
        }
        String rs = "";
        for (int i = 0; i < list.size(); i++) {
            rs += list.get(i).toString();
        }
        return rs;
    }
}
