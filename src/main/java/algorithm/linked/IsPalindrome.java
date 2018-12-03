package algorithm.linked;

import algorithm.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode first = head, second = head, third = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
        }
        List<Integer> stack = new ArrayList<>();
        while (second != null) {
            stack.add(second.val);
            second = second.next;
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) != third.val) {
                return false;
            }
            third = third.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(3);
        ListNode a6 = new ListNode(2);
        ListNode a7 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        System.out.println(new IsPalindrome().isPalindrome(a1));
    }
}
