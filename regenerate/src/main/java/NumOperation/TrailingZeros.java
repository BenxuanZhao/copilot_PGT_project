package NumOperation;

public class TrailingZeros {
    /* Here is the explanation for the code above:
1. First, let's see how the number of 0s is generated.
If we write down all the numbers from 1 to n, and count the number of 0s in each column, we'll find that the number of 0s at each column is [n/5] + [n/5^2] + [n/5^3] + ....
For example, the number of 0s from 1 to 105 is 20, from 1 to 1010 is 249.
The reason that we use [n/5] + [n/5^2] + [n/5^3] + ... to compute the number of 0s at each column is as follows:
    1) [n/5] is the number of numbers from 1 to n that are multiples of 5.
    2) [n/5^2] is the number of numbers from 1 to n that are multiples of 5^2 and not multiples of 5.
    3) [n/5^3] is the number of numbers from 1 to n that are multiples of 5^3 and not multiples of 5^2.
    ... and so on.
This way, we can count the number of 0s in O(logn) time.

2. Then, let's see how the number of 5s is generated.
If we write down all the numbers from 1 to n, and count the number of numbers that are multiples of 5, we'll find that the number of 5s at each column is [n/5] + [n/5^2] + [n/5^3] + ....
For example, the number of 5s from 1 to 105 is 25, from 1 to 1010 is 252.
The reason that we use [n/5] + [n/5^2] + [n/5^3] + ... to compute the number of 5s at each column is as follows:
    1) [n/5] is the number of numbers from 1 to n that are multiples of 5.
    2) [n/5^2] is the number of numbers from 1 to n that are multiples of 5^2.
    3) [n/5^3] is the number of numbers from 1 to n that are multiples of 5^3.
    ... and so on.
This way, we can count the number of 5s in O(logn) time.

3. Finally, let's see how the number of 2s is generated.
If we write down all the numbers from 1 to n, and count the number of numbers that are multiples of 2, we'll find that the number of 2s at each column is [n/2] + [n/2^2] + [n/2^3] + ....
For example, the number of 2s from 1 to 105 is 52, from 1 to 1010 is 504. */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
