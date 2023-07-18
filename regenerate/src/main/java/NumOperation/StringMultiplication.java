package NumOperation;

public class StringMultiplication {
    /* Here is the explanation for the code above:
1. The product of two numbers cannot exceed the sum of the two lengths. (e.g. 99 * 99 cannot be five digit)
2. num1[i] * num2[j]` will be placed at indices `[i + j`, `i + j + 1]`
3. We initialize our answer array with `0`s and fill it from the right
4. Similar to how we would do multiplication on paper, for each `i` in `num1` and `j` in `num2`
5. We get the current product from `num1[i] * num2[j]` (plus the carry from the previous index)
6. The current digit will be `products % 10` and the carry will be `products / 10`
7. We then update the answer at `i + j` (the first index) and `i + j + 1` (second index) with the new digit
8. After the two loops, we remove any leading `0`s from our answer
9. If the entire answer array is `0`s, we return 0, otherwise we return the string built from the answer array */
    public String multiply(String num1, String num2) {
        int[] ans = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; 0 <= i; --i) {
            for (int j = num2.length() - 1; 0 <= j; --j) {
                int products = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1, sum = products + ans[p2];
                ans[p1] += sum / 10;
                ans[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : ans) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
