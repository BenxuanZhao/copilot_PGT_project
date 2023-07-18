package Recursion;

public class LowestCommonAncestor {
    /* Here is the explanation for the code above:
1. if root is null, then it means we have reached the end of the tree and we return null
2. if root is either p or q, then we return root because we know that the other node is in the subtree of this root
3. if root is neither p nor q, then we recursively search for p and q in the left and right subtree
4. if both left and right are not null, then it means that p and q are in different subtrees, so we return root
5. if either left or right is null, then it means that both p and q are in the same subtree, so we return the one that is not null */
    public DeleteBTSNode.TreeNode lowestCommonAncestor(DeleteBTSNode.TreeNode root, DeleteBTSNode.TreeNode p, DeleteBTSNode.TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root; // 1
        }
        DeleteBTSNode.TreeNode left = lowestCommonAncestor(root.left, p, q); // 2
        DeleteBTSNode.TreeNode right = lowestCommonAncestor(root.right, p, q); // 3
        if (left != null && right == null) { // 4
            return left;
        } else if (left == null) { // 5
            return right;
        }
        return root;
    }
}
