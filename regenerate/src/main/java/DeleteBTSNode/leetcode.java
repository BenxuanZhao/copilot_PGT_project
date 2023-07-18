package DeleteBTSNode;

public class leetcode {
//1) If key is greater than root's key, then key lies in right subtree.
//        So we recur for right subtree.
//    2) If key is smaller than root's key, then key lies in left subtree.
//        So we recur for left subtree.
//    3) If key is equal to root's key, then this is the node to be deleted.
//        a) Node to be deleted is leaf: Simply remove from the tree.
//        b) Node to be deleted has only one child: Copy the child to the node and delete the child
//        c) Node to be deleted has two children: Find inorder successor of the node.
//            Copy contents of the inorder successor to the node and delete the inorder successor.
//            Note that inorder predecessor can also be used. */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        }

        if (root.left == null) {
            return root.right;
        }

        if (root.right == null) {
            return root.left;
        }
        //求前驱节点
        TreeNode predecessor = maximum(root.left);
        TreeNode predecessorCopy = new TreeNode(predecessor.val);
        //先remove再衔接
        predecessorCopy.left = removeMax(root.left);
        predecessorCopy.right = root.right;
        root.left = null;
        root.right = null;
        return predecessorCopy;
    }
    private TreeNode removeMax(TreeNode node) {
        if (node.right == null) {
            return node.left;
        }
        node.right = removeMax(node.right);
        return node;
    }

    private TreeNode maximum(TreeNode node) {
        if (node.right == null) {
            return node;
        }
        return maximum(node.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(2);
//        TreeNode n4 = new TreeNode(4);
//        TreeNode n5 = new TreeNode(7);
//
//        root.left = n1;
        root.right = n2;
//        n1.left = n3;
//        n1.right = n4;
//        n2.right = n5;

        new leetcode().deleteNode(root, 1);
    }
}

