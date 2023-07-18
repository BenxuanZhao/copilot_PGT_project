package BinaryTreeTraversal;

import DeleteBTSNode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HierarchicalTraversal {
    /* Here is the explanation for the code above:
1. Create a queue and add the root node to the queue.
2. Create a while loop that runs as long as the queue is not empty.
3. Inside the while loop, create a new list and add it to the levels list.
4. Create a levelLength variable that will store the current queue size.
5. Create a for loop and run it until the levelLength variable.
6. Inside the for loop, remove the first node from the queue and add it to the current level list.
7. Check if the removed node has a left child. If it does, add it to the queue.
8. Check if the removed node has a right child. If it does, add it to the queue.
9. Add 1 to the level variable.
10. Return the levels list. */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode node = queue.remove();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            levels.add(level);
        }
        return levels;
    }
}
