package ListOperation;

import java.util.HashMap;

public class CopyRandomList {
    /* Here is the explanation for the code above:
1. If we encounter a node which is already visited then we return the clone of it.
2. We create a copy of the given node and put it in the visited dictionary.
3. Recursively copy the remaining linked list starting once from the next pointer and then from the random pointer.
4. Now we update the next and random pointers for the clones using the visited dictionary. */
    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (this.visitedHash.containsKey(head)) {
            return this.visitedHash.get(head);
        }

        Node node = new Node(head.val);

        this.visitedHash.put(head, node);
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
