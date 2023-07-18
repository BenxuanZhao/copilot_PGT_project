package NumOperation;

public class IntReverse {
    /* Here is the explanation for the code above:
1. Get the last digit of the number: y = x % 10.
2. Update the last digit of the reverse: rs = rs * 10 + y.
3. Remove the last digit of the number: x = x / 10.
4. Repeat steps 1. to 3. until x is no longer greater than zero.
5. Check overflow/underflow condition: if (rs * 10 / 10 != rs) return 0; */
    public int reverse(int x) {
        int rs = 0;
        while (true) {
            int y = x % 10;
            x = x / 10;
            if (rs * 10 / 10 != rs) {
                return 0;
            }
            rs = rs * 10 + y;
            if (x == 0) {
                break;
            }
        }
        return rs;
    }
}
