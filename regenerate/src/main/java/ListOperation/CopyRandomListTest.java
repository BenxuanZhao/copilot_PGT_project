package ListOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CopyRandomListTest {
    @Test
    public void testCopyRandomList() {
        // 创建一个带有random指针的链表
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.random = head.next.next;  // 1->3
        head.next.random = head;  // 2->1
        head.next.next.random = head.next;  // 3->2

        CopyRandomList copyList = new CopyRandomList();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 复制链表
        Node newHead = copyList.copyRandomList(head);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证复制出的链表是否正确
        assertNotNull(newHead);
        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(3, newHead.next.next.val);
        assertEquals(newHead.next.next, newHead.random);
        assertEquals(newHead, newHead.next.random);
        assertEquals(newHead.next, newHead.next.next.random);
    }
}