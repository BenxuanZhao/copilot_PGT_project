package Recursion;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {
    @Test
    public void testMaxDepth() {
        // 构造测试用例
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // 创建待测试的对象
        MaxDepth maxDepth = new MaxDepth();

        // 计算二叉树的最大深度
        long startTime = System.nanoTime();
        int depth = maxDepth.maxDepth(root);
        long endTime = System.nanoTime();

        // 验证最大深度结果
        assertEquals(3, depth);

        // 打印运行时间
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }
}