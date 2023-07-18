package Recursion;

import DeleteBTSNode.TreeNode;

public class RemoveLeafNodes {
    /* Here is the explanation for the code above:
1. We need to go to the bottom of the tree first, then go up to the root.
2. So we use post-order traversal.
3. When we reach a leaf node, we check whether its value is equal to target.
4. If it is equal to target, we return null, which means that this node should be removed.
5. If it is not equal to target, we return this node.
6. When we return a non-null value, we need to assign it to the left or right child of its parent node.
7. When we assign the value to the left or right child of its parent node, we need to check whether the left or right child is null.
8. If the left or right child is null, we need to assign null to the left or right child of the parent node.
9. Otherwise, we do nothing.
10. After we traverse all the nodes, we will return the root node of the tree. */
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }
}
