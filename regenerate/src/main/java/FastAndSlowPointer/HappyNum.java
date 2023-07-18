package FastAndSlowPointer;

public class HappyNum {
    /* Here is the explanation for the code above:
1. First of all, let's suppose there is a cycle in this sequence, and the cycle starts with number x, ends with number y. We use function f(n) to calculate the next number, f(f(f...(f(n)))) = y.
2.  There are two pointers in this sequence, one goes one step each time, another one goes two steps each time. So when they meet, we know there is a cycle. Let's suppose the length of the cycle is k.
3.  When the two pointers meet, the slow one goes k steps. At this time, the fast one goes 2k steps. Since the fast one goes two steps each time, and it already goes k steps, so the number of steps it needs to go to reach y is (k - (2k - k)) = k.
4.  f(f(f...(f(y)))) = y, which means the next number of y is y itself, which means the number of steps it needs to go to reach y is 1. So we know the slow pointer needs to go k more steps after they meet. Since the slow pointer already goes k steps, so the total steps it goes to reach y is 2k, which means the total steps it goes to reach y is the length of the cycle.
5.  We already know the length of the cycle is k, so we can conclude that the slow pointer goes k steps to reach y, and go k steps to reach x. Since the total steps it goes is 2k, we can conclude that the slow pointer goes k steps to reach x. So the next number of x is x itself.
6.  Now we have proved that if there is a cycle, then there must be a number x, the next number of x is x itself. So if the number is not a happy number, then it must contains some numbers which are visited twice since there are a cycle. So we can use this conclusion to solve this problem. */
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
