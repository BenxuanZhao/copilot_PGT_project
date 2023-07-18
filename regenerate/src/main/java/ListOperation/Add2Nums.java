package ListOperation;

import Partitioning.ListNode;

public class Add2Nums {
    /* Here is the explanation for the code above:
1. I create a new ListNode to store the sum of the 1st digit of l1 and l2.
2. I iterate through the rest of the list while l1 or l2 is not null.
3. When l1 or l2 is null, I will set a or b to 0 respectively.
4. I add a and b and store it in t.
5. I create a new ListNode of t and add it to the end of the list.
6. I iterate through the list and handle the carry.
7. If the last digit is 10, I create a new ListNode of 0 and add it to the end of the list.
8. I return the list. */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(l1.val + l2.val);

        l1 = l1.next;
        l2 = l2.next;
        ListNode temp = rs;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if (l2 != null) {
                b = l2.val;
            }

            int t = a + b;
            temp.next = new ListNode(t);
            temp = temp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        temp = rs;
        while (temp != null) {
            if (temp.val >= 10) {
                temp.val = temp.val - 10;
                if (temp.next == null) {
                    temp.next = new ListNode(0);
                }
                temp.next.val = temp.next.val + 1;
            }
            temp = temp.next;
        }

        return rs;
    }
}
