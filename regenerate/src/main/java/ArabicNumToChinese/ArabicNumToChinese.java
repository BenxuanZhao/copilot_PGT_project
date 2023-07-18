package ArabicNumToChinese;

public class ArabicNumToChinese {
/* Here is the explanation for the code above:
1. The first part is to declare some constant arrays and a StringBuilder to store the answer.
2. The second part is the main part of the code, which is to convert the integer to Chinese number.
3. The third part is to run the code and see the results. */
    private static final char[] numArrays = {'零', '一', '二', '三', '四', '五', '六', '七', '八', '九'};
    private static final char[] units = {'十', '百', '千', '万', '亿'};
    private static final StringBuilder ans = new StringBuilder();

    private static void intToChineseNum(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int n = chars.length;

        if (n == 1) {
            ans.append(numArrays[chars[0] - '0']);
        } else if (n >= 5) {
            n = n >= 9 ? 9 : 5;
            int multi = (int) Math.pow(10, n - 1);
            int div = num / multi;
            int mod = num % multi;
            intToChineseNum(div);
            ans.append(n == 5 ? units[3] : units[4]);
            String s1 = String.valueOf(div);
            String s2 = String.valueOf(mod);
            if (s.charAt(s1.length() - 1) == '0' || s2.length() < n - 1) ans.append("零");
            intToChineseNum(mod);
        } else {
            int multi = (int) Math.pow(10, n - 1);
            int div = num / multi;
            int mod = num % multi;
            ans.append(numArrays[div]).append(units[n - 2]);
            if (mod != 0) {
                if (String.valueOf(mod).length() < n - 1) {
                    ans.append("零");
                }
                intToChineseNum(mod);
            }
        }
    }
}
