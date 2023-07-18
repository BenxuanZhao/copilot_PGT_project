package ListOperation;

import Partitioning.ListNode;

public class RotateList {
    /* Here is the explanation for the code above:
1. Get the length of the list;
2. Move to the (l - k % l)th node;
3. Put the tail node to the head and cut the connection between the tail and the (l - k % l - 1)th node. */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode oldTail = head;
        int n;
        for (n = 1; oldTail.next != null; n++) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;
        ListNode newTail = head;
        for (int i = 0; i < n - k % n - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
