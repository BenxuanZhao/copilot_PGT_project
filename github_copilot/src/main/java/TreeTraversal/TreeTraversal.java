package TreeTraversal;

import DeleteBTSNode.TreeNode;

import java.util.Stack;

public class TreeTraversal {

    public void dlr_dg(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        dlr_dg(root.left);
        dlr_dg(root.right);
    }


    public void dlr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
    }


    public void ldr_dg(TreeNode root) {
        if (root == null) {
            return;
        }
        ldr_dg(root.left);
        System.out.println(root.val);
        ldr_dg(root.right);
    }


    public void ldr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }


    public void lrd_dg(TreeNode root) {
        if (root == null) {
            return;
        }
        lrd_dg(root.left);
        lrd_dg(root.right);
        System.out.println(root.val);
    }


    public void lrd(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> rs = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            rs.push(temp.val);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }

        while (!rs.empty()) {
            System.out.println(rs.pop());
        }
    }
}
