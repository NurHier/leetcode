package algorithm.linked;

import algorithm.common.ListNode;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode headPre = new ListNode(0);
        headPre.next = head;
        ListNode pre = headPre;
        ListNode cur = headPre.next;
        while (cur != null) {
            if (cur.val == val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                cur = cur.next;
                pre = pre.next;
            }
        }
        return headPre.next;
    }

    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(6);
        ListNode a5 = new ListNode(3);
        ListNode a6 = new ListNode(4);
        ListNode a7 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        removeElements.removeElements(a1, 5);

    }
}
