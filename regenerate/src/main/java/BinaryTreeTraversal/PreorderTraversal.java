package BinaryTreeTraversal;

import DeleteBTSNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    /* Here is the explanation for the code above:
1. push root to stack
2. while stack is not empty or root is not null
	a. while root is not null
		i. add root to list
		ii. push root to stack
		iii. root = root.left
	b. root = stack.pop()
	c. root = root.right */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                rs.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return rs;
    }
}
