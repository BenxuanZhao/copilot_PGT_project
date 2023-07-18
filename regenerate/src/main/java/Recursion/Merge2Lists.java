package Recursion;

import Partitioning.ListNode;

public class Merge2Lists {
    /* Here is the explanation for the code above:
1. The base cases are when either list is null. Then there's nothing to merge, so you just return the other non-null list.
2. Otherwise, you compare the heads of the two lists, and add the smaller one to the merged list. The next element of the merged list is then set to the merge of the lists that didn't contribute the head.
3. Finally, you return the merged list. */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Base cases
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // Recursive cases
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2); // Merge the rest of l1 with l2
            return l1; // Return l1
        } else {
            l2.next = mergeTwoLists(l1, l2.next); // Merge the rest of l2 with l1
            return l2; // Return l2
        }
    }
}
