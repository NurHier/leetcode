package algorithm.linked;

import algorithm.common.ListNode;

public class DeleteElements {
    public void removeElements(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        DeleteElements removeElements = new DeleteElements();
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
        removeElements.removeElements(a3);
        System.out.println(a1);

    }
}
