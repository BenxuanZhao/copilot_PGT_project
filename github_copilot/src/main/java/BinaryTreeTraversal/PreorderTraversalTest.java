package BinaryTreeTraversal;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {
    @Test
    public void testPreorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        PreorderTraversal traversal = new PreorderTraversal();

        List<Integer> expected = Arrays.asList(1, 2, 3);

        long startTime = System.nanoTime();
        List<Integer> result = traversal.preorderTraversal(root);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Preorder Traversal: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }

}