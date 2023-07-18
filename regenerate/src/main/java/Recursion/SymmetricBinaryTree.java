package Recursion;

import DeleteBTSNode.TreeNode;

public class SymmetricBinaryTree {
    /* Here is the explanation for the code above:
1. Initially, the algorithm checks if the root node is null. If so, then we conclude that the tree is symmetric. Otherwise, we call the recursive helper function isMirror.
2. The isMirror function takes two TreeNode objects as arguments. The function checks if the two TreeNode objects are null. If so, the function returns true. If not, the function checks if the values of the TreeNode objects are equal. If not, the function returns false. Otherwise, the function returns the result of a recursive call to isMirror. The two recursive calls are made with the following arguments: the left subtree of the left TreeNode object and the right subtree of the right TreeNode object; the right subtree of the left TreeNode object and the left subtree of the right TreeNode object. */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both nodes are null, then they are mirror images
        if (t1 == null && t2 == null) {
            return true;
        }
        // If one node is null and the other is not, then they are not mirror images
        if (t1 == null || t2 == null) {
            return false;
        }
        // If the values of the nodes are not equal, then they are not mirror images
        return (t1.val == t2.val)
                // If the values of the nodes are equal, then check if the left subtree of the left node is the mirror image of the right subtree of the right node and if the right subtree of the left node is the mirror image of the left subtree of the right node
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
}
