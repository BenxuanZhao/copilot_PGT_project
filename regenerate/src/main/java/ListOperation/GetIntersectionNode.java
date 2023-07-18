package ListOperation;

import Partitioning.ListNode;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {
    /* Here is the explanation for the code above:
1. Traverse list A and store the address / reference to each node in a hash set.
2. Then check every node bi in list B: if bi appears in the hash set, then bi is the intersection node.
Complexity Analysis
Time complexity : O(m+n)O(m+n).
Space complexity : O(m)O(m) or O(n)O(n). */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
