package ListOperation;

import Partitioning.ListNode;

public class ReverseList {
    /* Here is the explanation for the code above:
1. First, we define a pre pointer, which is null at the beginning.
2. Then, we define a temp pointer, which points to head at the beginning.
3. Then, we start a while loop. The loop runs when temp is not null.
4. In the loop, we define a new node t, which points to temp.next.
5. Then, we set temp.next to pre.
6. Then, we set pre to temp.
7. Then, we set temp to t.
8. Then, we continue the loop.
9. Finally, we return pre. */
    public ListNode reverseList(ListNode head) {
        ListNode pre  = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode t = temp.next;
            temp.next = pre;
            pre = temp;
            temp = t;
        }
        return pre;
    }
}
