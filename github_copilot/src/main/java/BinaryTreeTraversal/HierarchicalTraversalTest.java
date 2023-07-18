package BinaryTreeTraversal;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HierarchicalTraversalTest {
    @Test
    public void testLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        HierarchicalTraversal traversal = new HierarchicalTraversal();

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        long startTime = System.nanoTime();
        List<List<Integer>> result = traversal.levelOrder(root);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Level Order: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}