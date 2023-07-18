package Recursion;

import DeleteBTSNode.TreeNode;

import java.util.Stack;

public class InvertTree {
    /* Here is the explanation for the code above:
1. for any node, we swap its left and right child.
2. for the left child, we swap its left and right child
3. for the right child, we swap its left and right child

We can use a stack to store all the left and right child of a node.
For example, we have a tree like this:
         1
        / \
       2   3
      / \ / \
     4  5 6  7
    / \
   8   9

Initially, we push 1 in the stack. The stack is [1]. Then we pop 1 out of the stack and swap its left and right child. The tree becomes:
         1
        / \
       3   2
      / \ / \
     6  7 4  5
    / \
   8   9
We push 2 and 3 in the stack. The stack is [2, 3]. Then we pop 3 out of the stack and swap its left and right child. The tree becomes:
         1
        / \
       3   2
      / \ / \
     7  6 4  5
    / \
   8   9
We push 6 and 7 in the stack. The stack is [2, 6, 7]. Then we pop 7 out of the stack and swap its left and right child. The tree becomes:
         1
        / \
       3   2
      / \ / \
     7  6 4  5
    / \
   9   8
We push 4, 5, 6 in the stack. The stack is [2, 6, 5, 4]. Then we pop 4 out of the stack and swap its left and right child. The tree becomes:
         1
        / \
       3   2
      / \ / \
     7  6 5  4
    / \
   9   8
We push 8, 9 in the stack. The stack is [2, 6, 5, 9, 8]. Then we pop 8 out of the stack and swap its left and right child. The tree becomes:
         1
        / \
       3   2
      / \ / \
     7  6 5  4
    / \
   9   8

We push 9 in the stack. The stack is [2, 6, 5, 9]. Then we pop 9 out of the stack and swap its left and right child. The tree becomes:
         1
        / \
       3   2
      / \ / \
     7  6 5  4
    / \
   8   9
The stack is empty now, so the algorithm ends here. */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
}
