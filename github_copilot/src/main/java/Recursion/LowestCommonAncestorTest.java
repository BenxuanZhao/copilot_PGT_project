package Recursion;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {
    @Test
    public void testLowestCommonAncestor() {
        // 构造测试用例
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // 创建待测试的对象
        LowestCommonAncestor lca = new LowestCommonAncestor();

        // 执行最低公共祖先操作
        TreeNode p = root.left;
        TreeNode q = root.right;
        long startTime = System.nanoTime();
        TreeNode ancestor = lca.lowestCommonAncestor(root, p, q);
        long endTime = System.nanoTime();

        // 验证最低公共祖先结果
        assertEquals(3, ancestor.val);

        // 打印运行时间
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }
}