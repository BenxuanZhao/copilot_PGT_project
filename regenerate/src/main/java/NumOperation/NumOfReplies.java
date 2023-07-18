package NumOperation;

public class NumOfReplies {
    /* Here is the explanation for the code above:
1. Negative numbers are not palindrome, for example -123 is not a palindrome since the '-' does not equal to '3'. So we can return false for negative numbers.
2. Now let's think about how to revert the last half of the number. For number 1221, if we do 1221 % 10, we get the last digit 1, to get the second to the last digit, we need to remove the last digit from 1221, we could do so by dividing it by 10, 1221 / 10 = 122. Then we can get the last digit again by doing a modulus by 10, 122 % 10 = 2, and if we multiply the last digit by 10 and add the second last digit, 1 * 10 + 2 = 12, it gives us the reverted number we want. Continuing this process would give us the reverted number with more digits.
Now the question is, how do we know that we've reached the half of the number?
Since we divided the number by 10, and multiplied the reversed number by 10, when the original number is less than the reversed number, it means we've processed half of the number digits. */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int rs = 0;
        int y = x;

        while (y > 0) {
            rs = rs * 10 + y % 10;
            y /= 10;
        }

        return rs == x;
    }
}
