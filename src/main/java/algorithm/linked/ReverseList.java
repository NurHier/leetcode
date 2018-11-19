package algorithm.linked;

import algorithm.common.ListNode;

import java.util.Stack;

/**
 * 反转一个单链表。
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int i = 0;
        ListNode reverseHead = new ListNode(0);
        ListNode index = null;
        int len = stack.size();
        while (!stack.isEmpty()) {
            index = stack.pop();
            if (i == 0) {
                reverseHead.val = index.val;
                reverseHead.next = stack.peek();
            }
            if (i == len - 1) {
                index.next = null;
            } else {
                index.next = stack.peek();
            }
            i++;
        }
        return reverseHead;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;


        new ReverseList().reverseList(node1);
    }
}
