package ListOperation;

import Partitioning.ListNode;

public class DeleteNNodeFromEnd {
    /* Here is the explanation for the code above:
1. We use two pointers to locate the position of the node to be deleted.
2. We need to use dummy node to handle the case when the head node is removed.
3. The second pointer is always n+1 nodes behind the first pointer. */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; // 2
        ListNode first = dummy; // 1
        ListNode second = dummy; // 1

        for (int i = 1; i <= n + 1; i++) { // 3
            first = first.next;
        }

        while (first != null) { // 1
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
