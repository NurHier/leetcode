package algorithm.linked;

import algorithm.common.ListNode;

import java.util.List;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
