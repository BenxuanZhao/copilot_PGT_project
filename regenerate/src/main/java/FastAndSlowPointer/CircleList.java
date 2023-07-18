package FastAndSlowPointer;

import Partitioning.ListNode;

public class CircleList {
/* Here is the explanation for the code above:
1. If there is no cycle, the fast pointer will stop at the end of the linkedlist.
2. If there is a cycle, the fast pointer will eventually meet with the slow pointer.
3. If there is a cycle, the fast pointer will eventually meet with the slow pointer. */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) { // fast != null && fast.next != null
            if (fast == slow) {
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
