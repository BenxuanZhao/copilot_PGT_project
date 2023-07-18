package TreeTraversal;

import DeleteBTSNode.TreeNode;

import java.util.Stack;

public class TreeTraversal {
    //* 1. put root in stack
    // * 2. if stack is not empty, pop one node and print its value
    // * 3. push its right child, if it has one
    // * 4. push its left child, if it has one
    // * 5. repeat 2-4 */
    public void dlr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    ///* Here is the explanation for the code above:
    //1. Check if the root node is null, if yes, return, else print the root node.
    //2. Recursively call the DLR function on the left subtree.
    //3. Recursively call the DLR function on the right subtree. */
    public void dlr_dg(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        dlr_dg(root.left);
        dlr_dg(root.right);
    }

    ///* Here is the explanation for the code above:
    //1. Recursively traverse the left subtree
    //2. Print the value of the root node
    //3. Recursively traverse the right subtree */
    public void ldr_dg(TreeNode root) {
        if (root == null) {
            return;
        }
        ldr_dg(root.left);
        System.out.println(root.val);
        ldr_dg(root.right);
    }

    ///* Here is the explanation for the code above:
    //1. First, we should know what is the definition of inorder traversal.
    //For a binary tree, inorder traversal is defined as follows:
    //(1) Traverse the left subtree.
    //(2) Visit root.
    //(3) Traverse the right subtree.
    //So, we can see that for each node, we should first traverse its left subtree, then visit the node, and finally traverse its right subtree.
    //2. Then we can use a stack to simulate the recursion process.
    //We push the root node to the stack.
    //Then we traverse its left subtree by pushing the left child of the root to the stack, and then the left child of the left child to the stack, and so on.
    //When we traverse to the end of the left subtree, we pop a node from the stack and visit it. Then we traverse its right subtree by pushing the right child of the node to the stack, and then the right child of the right child to the stack, and so on.
    //3. When we traverse the right subtree to the end, we pop a node from the stack and visit it.
    //4. We repeat step 2 and step 3 until the stack is empty. */
    public void ldr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            System.out.println(node.val);
            root = node.right;
        }
    }

    ///* Here is the explanation for the code above:
    //1. If the root is null, return.
    //2. If the root is not null, go to the left subtree and recursively traverse it.
    //3. If the root is not null, go to the right subtree and recursively traverse it.
    //4. Print the node. */
    public void lrd_dg(TreeNode root) {
        if (root == null) {
            return;
        }
        lrd_dg(root.left);
        lrd_dg(root.right);
        System.out.println(root.val);
    }

    ///* Here is the explanation for the code above:
    //1. We use two stacks: one for storing the nodes, another for storing the values.
    //2. We first push the root into the first stack.
    //3. We then pop the root out of the first stack, and push the value of the root into the second stack.
    //4. We continue this process until the first stack is empty.
    //5. Once the first stack is empty, we pop all values from the second stack and print them one by one.
    //6. This way, we could get the reversed order of the post-order traversal. */
    public void lrd(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.empty()) {
            TreeNode node = stack1.pop();
            stack2.push(node.val);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.empty()) {
            System.out.println(stack2.pop());
        }
    }


}
