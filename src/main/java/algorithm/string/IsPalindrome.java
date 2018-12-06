package algorithm.string;

import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        Stack<Character> stack = new Stack<>();
        int length, remove;
        if (s.length() % 2 == 0) {
            length = s.length();
            remove = -1;
        } else {
            length = s.length() - 1;
            remove = length / 2;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < length / 2) {
                if (i != remove) {
                    stack.push(s.charAt(i));
                }
            } else {
                if (i == remove) {
                    i++;
                }
                if (stack.pop() != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("a , bc cba"));
    }
}
