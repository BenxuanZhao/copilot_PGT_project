package Partitioning;

public class MergeLists {
    /* Here is the explanation for the code above:
1. We need to define a head node, and a pre node which points to the head node. The reason is that we need to modify the linked list, but we still need to return the head node.
2. We need to compare the first element of l2 with the first element of the linked list. If l2.val is smaller than the first element of the linked list, we need to insert l2 to the linked list. Otherwise, we need to find the proper position to insert l2. If we find the end of the linked list, then we need to insert l2 to the end of the linked list.
3. We need to move the pre node to the next position.
4. We need to move the l2 node to the next position. */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = l1;
        ListNode pre = head;
        while (l2 != null) {
            ListNode t1 = pre.next;
            ListNode t2 = l2.next;
            while (l2.val > t1.val) {
                if (t1.next == null) {
                    t1.next = l2;
                    return head.next;
                } else {
                    pre = pre.next;
                    t1 = t1.next;
                }
            }
            pre.next = l2;
            l2.next = t1;
            l2 = t2;
        }
        return head.next;
    }

    /* Here is the explanation for the code above:
1. mergeTwoLists(ListNode l1, ListNode l2): merge two sorted list into one single sorted list;
2. mergeKLists(ListNode[] lists): merge all the sorted list into a single sorted list. */
    public ListNode mergeKLists(ListNode[] lists) {
        // write your code here
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = mergeTwoLists(result, lists[i]);
        }
        return result;
    }
}
