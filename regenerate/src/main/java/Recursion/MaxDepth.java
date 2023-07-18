package Recursion;

import DeleteBTSNode.TreeNode;

public class MaxDepth {
    /* Here is the explanation for the code above:
1. We need to find the depth of the tree, so we need to return the max value of the depth of the left subtree and the right subtree.
2. We use recursion to find the depth of the tree.
3. The recursion has a base case, which is when the root is null, we return 0.
4. Otherwise, we calculate the depth of the left subtree and the right subtree, and return the max value of them.
5. In the recursion, we use a variable to record the depth of the left subtree and the right subtree, and we need to add them by 1, because the root is not null.
6. At last, we return the max value of the depth of the left subtree and the right subtree plus 1. */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
