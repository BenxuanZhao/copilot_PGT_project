package Recursion;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricBinaryTreeTest {
    @Test
    public void testIsSymmetric() {
        // 构造测试用例
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // 创建待测试的对象
        SymmetricBinaryTree symmetricBinaryTree = new SymmetricBinaryTree();

        // 判断二叉树是否对称
        long startTime = System.nanoTime();
        boolean result = symmetricBinaryTree.isSymmetric(root);
        long endTime = System.nanoTime();

        // 验证结果
        assertTrue(result);

        // 打印运行时间
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }
}