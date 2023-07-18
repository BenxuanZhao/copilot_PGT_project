package Recursion;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertTreeTest {
    @Test
    public void testInvertTree() {
        // 构造测试用例
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // 创建待测试的对象
        InvertTree invertTree = new InvertTree();

        // 执行翻转操作
        long startTime = System.nanoTime();
        TreeNode inverted = invertTree.invertTree(root);
        long endTime = System.nanoTime();

        // 验证翻转结果
        assertEquals(4, inverted.val);
        assertEquals(7, inverted.left.val);
        assertEquals(2, inverted.right.val);
        assertEquals(9, inverted.left.left.val);
        assertEquals(6, inverted.left.right.val);
        assertEquals(3, inverted.right.left.val);
        assertEquals(1, inverted.right.right.val);

        // 打印运行时间
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }
}