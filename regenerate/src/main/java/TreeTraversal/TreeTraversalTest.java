package TreeTraversal;

import DeleteBTSNode.TreeNode;
import org.junit.jupiter.api.Test;

class TreeTraversalTest {
    @Test
    public void testTreeTraversal() {
        // 构造测试用例
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // 创建待测试的对象
        TreeTraversal treeTraversal = new TreeTraversal();

        // 前序遍历 - 递归
        long startTime = System.nanoTime();
        System.out.println("前序遍历 - 递归");
        treeTraversal.dlr_dg(root);
        long endTime = System.nanoTime();
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");

        System.out.println();

        // 前序遍历 - 迭代
        startTime = System.nanoTime();
        System.out.println("前序遍历 - 迭代");
        treeTraversal.dlr(root);
        endTime = System.nanoTime();
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");

        System.out.println();

        // 中序遍历 - 递归
        startTime = System.nanoTime();
        System.out.println("中序遍历 - 递归");
        treeTraversal.ldr_dg(root);
        endTime = System.nanoTime();
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");

        System.out.println();

        // 中序遍历 - 迭代
        startTime = System.nanoTime();
        System.out.println("中序遍历 - 迭代");
        treeTraversal.ldr(root);
        endTime = System.nanoTime();
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");

        System.out.println();

        // 后序遍历 - 递归
        startTime = System.nanoTime();
        System.out.println("后序遍历 - 递归");
        treeTraversal.lrd_dg(root);
        endTime = System.nanoTime();
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");

        System.out.println();

        // 后序遍历 - 迭代
        startTime = System.nanoTime();
        System.out.println("后序遍历 - 迭代");
        treeTraversal.lrd(root);
        endTime = System.nanoTime();
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }
}