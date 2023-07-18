package Recursion;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLeafNodesTest {
    @Test
    public void testRemoveLeafNodes() {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);

        RemoveLeafNodes removeLeafNodes = new RemoveLeafNodes();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 删除值为2的叶子节点
        TreeNode result = removeLeafNodes.removeLeafNodes(root, 2);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果是否正确
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(3, result.right.val);
        assertNull(result.right.left);
        assertEquals(4, result.right.right.val);
    }
}