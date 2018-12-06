package algorithm.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 */
public class ReverseVowels {
    Set<Character> set = new HashSet<>();
    public String reverseVowels(String s) {
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] sChar = s.toCharArray();
        int len = s.length();
        int before = 0;
        int after = len - 1;
        while (before < after) {
            char b = sChar[before];
            char a = sChar[after];
            if (isVowel(b) && isVowel(a)) {
                sChar[after] = b;
                sChar[before] = a;
                before++;
                after--;
            } else if (isVowel(b)) {
                after--;
            } else if (isVowel(a)) {
                before++;
            } else {
                before++;
                after--;
            }
        }
        return new String(sChar);
    }

    private boolean isVowel(char c) {
        return set.contains(c);
    }


    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("e"));
    }
}
