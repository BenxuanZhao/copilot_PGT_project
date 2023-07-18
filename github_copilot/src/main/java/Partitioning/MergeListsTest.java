package Partitioning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeListsTest {
    @Test
    public void testMergeTwoLists() {
        // 创建两个已排序的链表
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeLists mergeLists = new MergeLists();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 合并链表
        ListNode result = mergeLists.mergeTwoLists(l1, l2);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果是否正确
        int[] expected = {1, 1, 2, 3, 4, 4};
        int i = 0;
        while (result != null) {
            assertEquals(expected[i++], result.val);
            result = result.next;
        }
    }

    @Test
    public void testMergeKLists() {
        // 创建三个已排序的链表
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        MergeLists mergeLists = new MergeLists();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 合并链表
        ListNode result = mergeLists.mergeKLists(lists);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果是否正确
        int[] expected = {1, 1, 2, 3, 4, 4, 5, 6};
        int i = 0;
        while (result != null) {
            assertEquals(expected[i++], result.val);
            result = result.next;
        }
    }
}